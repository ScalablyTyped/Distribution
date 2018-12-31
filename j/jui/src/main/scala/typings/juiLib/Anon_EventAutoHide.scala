package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventAutoHide extends js.Object {
  /**
    * @cfg {Boolean} [autoHide=true]
    * Automatically hides a modal when clicking on it
    */
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Boolean} [clone=false]
    * Copies an existing modal and shows it
    */
  @JSName("clone")
  var clone_FAnon_EventAutoHide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {"black"/"gray"} [color="black"]
    * Determines the color of a modal
    */
  var color: js.UndefOr[juiLib.juiLibStrings.black | juiLib.juiLibStrings.gray] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [index=0]
    * Determines the sequence (index) of a modal
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {Float} [opacity=0.4]
    * Sets the transparency of a modal
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {String/DOMElement} [target="body"]
    * Sets a selector on which a modal is shown
    */
  var target: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

