package typings.materializeCss.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Toast")
@js.native
class Toast_ ()
  extends typings.materializeCss.M.Toast_

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
  def getInstance(elem: Element): typings.materializeCss.M.Toast_ = js.native
}

