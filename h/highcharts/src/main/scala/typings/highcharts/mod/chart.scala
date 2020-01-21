package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "chart")
@js.native
object chart extends js.Object {
  def apply(options: Options): Chart_ = js.native
  def apply(options: Options, callback: ChartCallbackFunction): Chart_ = js.native
  def apply(renderTo: String, options: Options): Chart_ = js.native
  def apply(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
  def apply(renderTo: HTMLDOMElement, options: Options): Chart_ = js.native
  def apply(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
}

