package typings.jimpCore

import typings.jimpCore.jimpMod.Jimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/core/types/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  def addConstants(constants: js.Tuple2[String, String | Double]): Unit = js.native
  def addConstants(constants: js.Tuple2[String, String | Double], jimpInstance: Jimp): Unit = js.native
  def addJimpMethods(methods: js.Tuple2[String, js.Function]): Unit = js.native
  def addJimpMethods(methods: js.Tuple2[String, js.Function], jimpInstance: Jimp): Unit = js.native
  def addType(mime: String, extensions: js.Array[String]): Unit = js.native
  def jimpEvChange(methodName: String, method: js.Function): Unit = js.native
  def jimpEvMethod(methodName: String, evName: String, method: js.Function): Unit = js.native
}

