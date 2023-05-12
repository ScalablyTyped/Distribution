package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibBlake2sMod {
  
  @JSImport("hash-wasm/dist/lib/blake2s", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blake2s(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def blake2s(data: IDataType, bits: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake2s(data: IDataType, bits: Double, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake2s(data: IDataType, bits: Unit, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2s")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def createBLAKE2s(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2s")().asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2s(bits: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2s")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2s(bits: Double, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2s")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2s(bits: Unit, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2s")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
}
