package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHide extends js.Object {
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
  var clone_FAnon_AutoHide: js.UndefOr[scala.Boolean] = js.undefined
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

object Anon_AutoHide {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    color: juiLib.juiLibStrings.black | juiLib.juiLibStrings.gray = null,
    event: js.Any = null,
    index: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    target: java.lang.String | js.Any = null,
    tpl: js.Any = null
  ): Anon_AutoHide = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[Anon_AutoHide]
  }
}

