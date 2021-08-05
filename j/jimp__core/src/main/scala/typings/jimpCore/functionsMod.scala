package typings.jimpCore

import typings.jimpCore.jimpMod.Jimp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("@jimp/core/types/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addConstants(constants: js.Tuple2[String, String | Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addConstants")(constants.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addConstants(constants: js.Tuple2[String, String | Double], jimpInstance: Jimp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addConstants")(constants.asInstanceOf[js.Any], jimpInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addJimpMethods(methods: js.Tuple2[String, js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addJimpMethods")(methods.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addJimpMethods(methods: js.Tuple2[String, js.Function], jimpInstance: Jimp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addJimpMethods")(methods.asInstanceOf[js.Any], jimpInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addType(mime: String, extensions: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addType")(mime.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def jimpEvChange(methodName: String, method: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jimpEvChange")(methodName.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def jimpEvMethod(methodName: String, evName: String, method: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jimpEvMethod")(methodName.asInstanceOf[js.Any], evName.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
