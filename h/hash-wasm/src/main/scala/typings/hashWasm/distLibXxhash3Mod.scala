package typings.hashWasm

import typings.hashWasm.distLibUtilMod.IDataType
import typings.hashWasm.distLibWasminterfaceMod.IHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibXxhash3Mod {
  
  @JSImport("hash-wasm/dist/lib/xxhash3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createXXHash3(): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash3")().asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash3(seedLow: Double): js.Promise[IHasher] = ^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash3")(seedLow.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash3(seedLow: Double, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash3")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  inline def createXXHash3(seedLow: Unit, seedHigh: Double): js.Promise[IHasher] = (^.asInstanceOf[js.Dynamic].applyDynamic("createXXHash3")(seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IHasher]]
  
  inline def xxhash3(data: IDataType): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("xxhash3")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def xxhash3(data: IDataType, seedLow: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash3")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash3(data: IDataType, seedLow: Double, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash3")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def xxhash3(data: IDataType, seedLow: Unit, seedHigh: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("xxhash3")(data.asInstanceOf[js.Any], seedLow.asInstanceOf[js.Any], seedHigh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
