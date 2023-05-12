package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import typings.hashWasm.hashWasmStrings.binary
import typings.hashWasm.hashWasmStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPbkdf2Mod {
  
  @JSImport("hash-wasm/dist/lib/pbkdf2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pbkdf2[T /* <: IPBKDF2Options */](options: T): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  trait IPBKDF2Options extends StObject {
    
    /**
      * Hash algorithm to use. It has to be the return value of a function like createSHA1()
      */
    var hashFunction: js.Promise[IHasher]
    
    /**
      * Output size in bytes
      */
    var hashLength: Double
    
    /**
      * Number of iterations to perform
      */
    var iterations: Double
    
    /**
      * Desired output type. Defaults to 'hex'
      */
    var outputType: js.UndefOr[hex | binary] = js.undefined
    
    /**
      * Password (or message) to be hashed
      */
    var password: IDataType
    
    /**
      * Salt (usually containing random bytes)
      */
    var salt: IDataType
  }
  object IPBKDF2Options {
    
    inline def apply(
      hashFunction: js.Promise[IHasher],
      hashLength: Double,
      iterations: Double,
      password: IDataType,
      salt: IDataType
    ): IPBKDF2Options = {
      val __obj = js.Dynamic.literal(hashFunction = hashFunction.asInstanceOf[js.Any], hashLength = hashLength.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPBKDF2Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPBKDF2Options] (val x: Self) extends AnyVal {
      
      inline def setHashFunction(value: js.Promise[IHasher]): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
      
      inline def setHashLength(value: Double): Self = StObject.set(x, "hashLength", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setOutputType(value: hex | binary): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
      
      inline def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
      
      inline def setPassword(value: IDataType): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: IDataType): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPBKDF2OptionsBinary extends StObject {
    
    var outputType: binary
  }
  object IPBKDF2OptionsBinary {
    
    inline def apply(): IPBKDF2OptionsBinary = {
      val __obj = js.Dynamic.literal(outputType = "binary")
      __obj.asInstanceOf[IPBKDF2OptionsBinary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPBKDF2OptionsBinary] (val x: Self) extends AnyVal {
      
      inline def setOutputType(value: binary): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends hash-wasm.hash-wasm/dist/lib/pbkdf2.IPBKDF2OptionsBinary ? std.Uint8Array : string
    }}}
    */
  type PBKDF2ReturnType[T] = js.typedarray.Uint8Array
}
