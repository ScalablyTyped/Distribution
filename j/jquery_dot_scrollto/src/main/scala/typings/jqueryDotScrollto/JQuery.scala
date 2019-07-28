package typings.jqueryDotScrollto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Scroll the matched elements
    */
  @JSName("scrollTo")
  var scrollTo_Original: Fn_Duration = js.native
  /**
    * Scroll window
    *
    * @param target Where to scroll the matched elements.
    * @param duration The OVERALL length of the animation
    * @param settings Set of settings.
    */
  /**
    * Scroll the matched elements
    */
  def scrollTo(target: js.Any): JQuery = js.native
  def scrollTo(target: js.Any, duration: Double): JQuery = js.native
  def scrollTo(target: js.Any, duration: Double, onAfter: js.Function): JQuery = js.native
  def scrollTo(target: js.Any, duration: Double, settings: ScrollToOptions): JQuery = js.native
  /**
    * Scroll window
    *
    * @param target Where to scroll the matched elements.
    * @param settings Set of settings.
    * @param onAfter The onAfter callback.
    */
  /**
    * Scroll the matched elements
    */
  def scrollTo(target: js.Any, settings: ScrollToOptions): JQuery = js.native
  def scrollTo(target: js.Any, settings: ScrollToOptions, onAfter: js.Function): JQuery = js.native
}

