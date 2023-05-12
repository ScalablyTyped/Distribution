package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibBlake3Mod {
  
  @JSImport("hash-wasm/dist/lib/blake3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blake3(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("blake3")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def blake3(data: IDataType, bits: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake3")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake3(data: IDataType, bits: Double, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake3")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake3(data: IDataType, bits: Unit, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake3")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def createBLAKE3(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE3")().asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE3(bits: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE3")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE3(bits: Double, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE3")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE3(bits: Unit, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE3")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
}
