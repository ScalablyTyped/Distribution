package typings.highcharts.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structure for alternative date formats to parse.
  */
@js.native
trait DataDateFormatObject extends js.Object {
  
  var alternative: js.UndefOr[String] = js.native
  
  def parser(`match`: js.Array[Double]): Double = js.native
  @JSName("parser")
  var parser_Original: typings.highcharts.dataMod.highchartsAugmentingMod.DataDateFormatCallbackFunction = js.native
  
  var regex: RegExp = js.native
}
