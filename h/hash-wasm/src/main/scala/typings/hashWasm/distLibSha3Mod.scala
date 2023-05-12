package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSha3Mod {
  
  @JSImport("hash-wasm/dist/lib/sha3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSHA3(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA3")().asInstanceOf[js.Promise[IHasher]]
  inline def createSHA3(bits: IValidBits): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSHA3")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  
  inline def sha3(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha3")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha3(data: IDataType, bits: IValidBits): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha3")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
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
