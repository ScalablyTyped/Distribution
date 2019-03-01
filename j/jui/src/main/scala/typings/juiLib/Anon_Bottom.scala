package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Boolean} [flex=true]
    * Drop-down menu is varied by changing the width function
    */
  var flex: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {Integer} [height=100]
    * Determines an initial selection button with a specified value
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {Integer} [index=0]
    * Determines an initial selection button with a specified index
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {Boolean} [keydown=false]
    * It is possible to select a node using the keyboard
    */
  var keydown: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @cfg {"top"/"bottom"} [position="bottom"]
    * It is possible to determine an initial selection button with a specified value
    */
  var position: js.UndefOr[juiLib.juiLibStrings.top | juiLib.juiLibStrings.bottom] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {String} [value=0]
    * Determines an initial selection button with a specified value
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @cfg {Integer} [width=0]
    * Determines the horizontal size of a combo box
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    event: js.Any = null,
    flex: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    keydown: js.UndefOr[scala.Boolean] = js.undefined,
    position: juiLib.juiLibStrings.top | juiLib.juiLibStrings.bottom = null,
    tpl: js.Any = null,
    value: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(keydown)) __obj.updateDynamic("keydown")(keydown)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

