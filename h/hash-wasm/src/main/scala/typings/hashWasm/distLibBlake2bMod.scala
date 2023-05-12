package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibBlake2bMod {
  
  @JSImport("hash-wasm/dist/lib/blake2b", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blake2b(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def blake2b(data: IDataType, bits: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake2b(data: IDataType, bits: Double, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def blake2b(data: IDataType, bits: Unit, key: IDataType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("blake2b")(data.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def createBLAKE2b(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2b")().asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2b(bits: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2b")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2b(bits: Double, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2b")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createBLAKE2b(bits: Unit, key: IDataType): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBLAKE2b")(bits.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
}
