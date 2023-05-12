package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibXxhash128Mod {
  
  @JSImport("hash-wasm/dist/lib/xxhash128", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createXXHash128(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash128")().asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash128(seedLow: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash128")(seedLow.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash128(seedLow: Double, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash128")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash128(seedLow: Unit, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash128")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  
  inline def xxhash128(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("xxhash128")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def xxhash128(data: IDataType, seedLow: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash128")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash128(data: IDataType, seedLow: Double, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash128")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash128(data: IDataType, seedLow: Unit, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash128")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
