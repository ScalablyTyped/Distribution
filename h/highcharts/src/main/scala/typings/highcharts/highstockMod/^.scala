package typings.highcharts.highstockMod

import typings.highcharts.mod.Dictionary
import typings.highcharts.mod.Options
import typings.highcharts.mod.TimeFormatCallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts/highstock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var charts: js.Array[js.UndefOr[typings.highcharts.mod.Chart_]] = js.native
  
  var dateFormats: Dictionary[TimeFormatCallbackFunction] = js.native
  
  var defaultOptions: Options = js.native
  
  var theme: Options = js.native
  
  var time: typings.highcharts.mod.Time_ = js.native
}
