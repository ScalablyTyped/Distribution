package typings.hashWasm

import typings.hashWasm.anon.Calculate
import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.hashWasmStrings.binary
import typings.hashWasm.hashWasmStrings.hex
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibWasminterfaceMod {
  
  @JSImport("hash-wasm/dist/lib/WASMInterface", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hash-wasm/dist/lib/WASMInterface", "MAX_HEAP")
  @js.native
  val MAX_HEAP: Double = js.native
  
  inline def WASMInterface(binary: Any, hashLength: Double): js.Promise[Calculate] = (^.asInstanceOf[js.Dynamic].applyDynamic("WASMInterface")(binary.asInstanceOf[js.Any], hashLength.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Calculate]]
  
  @js.native
  trait IHasher extends StObject {
    
    /**
      * Block size in bytes
      */
    var blockSize: Double = js.native
    
    /**
      * Calculates the hash of all of the data passed to be hashed with hash.update().
      * Defaults to hexadecimal string
      * @param outputType If outputType is "binary", it returns Uint8Array. Otherwise it
      *                   returns hexadecimal string
      */
    def digest(): String = js.native
    
    /**
      * Digest size in bytes
      */
    var digestSize: Double = js.native
    
    /**
      * Calculates the hash of all of the data passed to be hashed with hash.update().
      * Defaults to hexadecimal string
      * @param outputType If outputType is "binary", it returns Uint8Array. Otherwise it
      *                   returns hexadecimal string
      */
    @JSName("digest")
    def digest_binary(outputType: binary): js.typedarray.Uint8Array = js.native
    @JSName("digest")
    def digest_hex(outputType: hex): String = js.native
    
    /**
      * Initializes hash state to default value
      */
    def init(): IHasher = js.native
    
    /**
      * Resume a state that was created by save(). If this state was not created by a
      * compatible build of hash-wasm, an exception will be thrown.
      */
    def load(state: js.typedarray.Uint8Array): IHasher = js.native
    
    /**
      * Save the current internal state of the hasher for later resumption with load().
      * Cannot be called before .init() or after .digest()
      *
      * Note that this state can include arbitrary information about the value being hashed (e.g.
      * could include N plaintext bytes from the value), so needs to be treated as being as
      * sensitive as the input value itself.
      */
    def save(): js.typedarray.Uint8Array = js.native
    
    /**
      * Updates the hash content with the given data
      */
    def update(data: IDataType): IHasher = js.native
  }
  
  type IWASMInterface = ThenArg[
    ReturnType[js.Function2[/* binary */ Any, /* hashLength */ Double, js.Promise[Calculate]]]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Promise<infer U> ? U : T extends (args : ...any): std.Promise<infer V> ? V : T
    }}}
    */
  type ThenArg[T] = T
}
