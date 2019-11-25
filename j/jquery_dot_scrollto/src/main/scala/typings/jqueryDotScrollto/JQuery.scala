package typings.jqueryDotScrollto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Scroll the matched elements
    */
  def scrollTo(target: js.Any): JQuery = js.native
  def scrollTo(target: js.Any, duration: Double): JQuery = js.native
  def scrollTo(target: js.Any, duration: Double, onAfter: js.Function): JQuery = js.native
  def scrollTo(target: js.Any, duration: Double, settings: ScrollToOptions): JQuery = js.native
  /**
    * Scroll the matched elements
    */
  def scrollTo(target: js.Any, settings: ScrollToOptions): JQuery = js.native
  def scrollTo(target: js.Any, settings: ScrollToOptions, onAfter: js.Function): JQuery = js.native
}

