package typings
package jqueryDotTipsyLib.JQueryTipsyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tipsy extends js.Object {
  /**
    * initialize tipsy plugin
    */
  def apply(): jqueryDotTipsyLib.JQuery = js.native
  def apply(options: Options): jqueryDotTipsyLib.JQuery = js.native
  /**
    * determine gravity either to North or South automatically based on the element's location in the viewport
    */
  def autoNS(): java.lang.String = js.native
  /**
    * determine gravity either to Northwest or Northeast automatically based on the element's location in the viewport
    */
  def autoNWNE(): java.lang.String = js.native
  /**
    * determine gravity either to Southwest or Southeast automatically based on the element's location in the viewport
    */
  def autoSWSE(): java.lang.String = js.native
  /**
    * determine gravity either to West or East automatically based on the element's location in the viewport
    */
  def autoWE(): java.lang.String = js.native
}

