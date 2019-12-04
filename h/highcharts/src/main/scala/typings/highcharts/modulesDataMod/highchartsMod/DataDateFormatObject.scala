package typings.highcharts.modulesDataMod.highchartsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure for alternative date formats to parse.
  */
@js.native
trait DataDateFormatObject extends js.Object {
  var alternative: js.UndefOr[String] = js.native
  @JSName("parser")
  var parser_Original: DataDateFormatCallbackFunction = js.native
  var regex: RegExp = js.native
  def parser(`match`: js.Array[Double]): Double = js.native
}

