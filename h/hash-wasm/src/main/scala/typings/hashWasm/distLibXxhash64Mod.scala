package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibXxhash64Mod {
  
  @JSImport("hash-wasm/dist/lib/xxhash64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createXXHash64(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash64")().asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash64(seedLow: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash64")(seedLow.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash64(seedLow: Double, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash64")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash64(seedLow: Unit, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash64")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  
  inline def xxhash64(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("xxhash64")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def xxhash64(data: IDataType, seedLow: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash64")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash64(data: IDataType, seedLow: Double, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash64")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash64(data: IDataType, seedLow: Unit, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash64")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
