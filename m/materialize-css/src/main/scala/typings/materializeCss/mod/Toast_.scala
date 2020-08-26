package typings.materializeCss.mod

import typings.materializeCss.M.Toast
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Toast")
@js.native
class Toast_ () extends Toast

/* static members */
@JSImport("materialize-css", "Toast")
@js.native
object Toast_ extends js.Object {
  /**
    * dismiss all toasts
    */
  def dismissAll(): Unit = js.native
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Toast = js.native
}

