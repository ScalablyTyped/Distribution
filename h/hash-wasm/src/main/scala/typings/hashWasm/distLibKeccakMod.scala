package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibKeccakMod {
  
  @JSImport("hash-wasm/dist/lib/keccak", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createKeccak(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeccak")().asInstanceOf[js.Promise[IHasher]]
  inline def createKeccak(bits: IValidBits): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeccak")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  
  inline def keccak(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def keccak(data: IDataType, bits: IValidBits): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("keccak")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hashWasm.hashWasmInts.`224`
    - typings.hashWasm.hashWasmInts.`256`
    - typings.hashWasm.hashWasmInts.`384`
    - typings.hashWasm.hashWasmInts.`512`
  */
  trait IValidBits extends StObject
  object IValidBits {
    
    inline def `224`: typings.hashWasm.hashWasmInts.`224` = 224.asInstanceOf[typings.hashWasm.hashWasmInts.`224`]
    
    inline def `256`: typings.hashWasm.hashWasmInts.`256` = 256.asInstanceOf[typings.hashWasm.hashWasmInts.`256`]
    
    inline def `384`: typings.hashWasm.hashWasmInts.`384` = 384.asInstanceOf[typings.hashWasm.hashWasmInts.`384`]
    
    inline def `512`: typings.hashWasm.hashWasmInts.`512` = 512.asInstanceOf[typings.hashWasm.hashWasmInts.`512`]
  }
}
