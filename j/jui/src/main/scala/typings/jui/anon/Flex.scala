package typings.jui.anon

import typings.jui.juiStrings.bottom
import typings.jui.juiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flex extends js.Object {
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Boolean} [flex=true]
    * Drop-down menu is varied by changing the width function
    */
  var flex: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Integer} [height=100]
    * Determines an initial selection button with a specified value
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Integer} [index=0]
    * Determines an initial selection button with a specified index
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Boolean} [keydown=false]
    * It is possible to select a node using the keyboard
    */
  var keydown: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {"top"/"bottom"} [position="bottom"]
    * It is possible to determine an initial selection button with a specified value
    */
  var position: js.UndefOr[top | bottom] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {String} [value=0]
    * Determines an initial selection button with a specified value
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    * @cfg {Integer} [width=0]
    * Determines the horizontal size of a combo box
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Flex {
  @scala.inline
  def apply(
    event: js.Any = null,
    flex: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    keydown: js.UndefOr[Boolean] = js.undefined,
    position: top | bottom = null,
    tpl: js.Any = null,
    value: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Flex = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keydown)) __obj.updateDynamic("keydown")(keydown.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flex]
  }
}

