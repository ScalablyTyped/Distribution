package typings.jqueryDotScrollto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Duration extends js.Object {
  /**
    * Scroll window
    *
    * @param target Where to scroll the matched elements.
    * @param duration The OVERALL length of the animation
    * @param settings Set of settings.
    */
  def apply(target: js.Any): JQuery = js.native
  def apply(target: js.Any, duration: Double): JQuery = js.native
  def apply(target: js.Any, duration: Double, onAfter: js.Function): JQuery = js.native
  def apply(target: js.Any, duration: Double, settings: ScrollToOptions): JQuery = js.native
  /**
    * Scroll window
    *
    * @param target Where to scroll the matched elements.
    * @param settings Set of settings.
    * @param onAfter The onAfter callback.
    */
  def apply(target: js.Any, settings: ScrollToOptions): JQuery = js.native
  def apply(target: js.Any, settings: ScrollToOptions, onAfter: js.Function): JQuery = js.native
}

