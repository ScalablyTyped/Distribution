package typings.jqueryTipsy.JQueryTipsy

import typings.jqueryTipsy.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tipsy extends js.Object {
  /**
    * initialize tipsy plugin
    */
  def apply(): JQuery = js.native
  def apply(options: Options): JQuery = js.native
  /**
    * determine gravity either to North or South automatically based on the element's location in the viewport
    */
  def autoNS(): String = js.native
  /**
    * determine gravity either to Northwest or Northeast automatically based on the element's location in the viewport
    */
  def autoNWNE(): String = js.native
  /**
    * determine gravity either to Southwest or Southeast automatically based on the element's location in the viewport
    */
  def autoSWSE(): String = js.native
  /**
    * determine gravity either to West or East automatically based on the element's location in the viewport
    */
  def autoWE(): String = js.native
}

