package typings.jui.anon

import typings.jui.juiStrings.black
import typings.jui.juiStrings.gray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoHide extends js.Object {
  /**
    * @cfg {Boolean} [autoHide=true]
    * Automatically hides a modal when clicking on it
    */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Boolean} [clone=false]
    * Copies an existing modal and shows it
    */
  @JSName("clone")
  var clone_FAutoHide: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {"black"/"gray"} [color="black"]
    * Determines the color of a modal
    */
  var color: js.UndefOr[black | gray] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [index=0]
    * Determines the sequence (index) of a modal
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Float} [opacity=0.4]
    * Sets the transparency of a modal
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {String/DOMElement} [target="body"]
    * Sets a selector on which a modal is shown
    */
  var target: js.UndefOr[String | js.Any] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object AutoHide {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[Boolean] = js.undefined,
    clone: js.UndefOr[Boolean] = js.undefined,
    color: black | gray = null,
    event: js.Any = null,
    index: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    target: String | js.Any = null,
    tpl: js.Any = null
  ): AutoHide = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHide]
  }
}

