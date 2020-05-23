package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectMenuClasses extends js.Object {
  var `ui-selectmenu-button`: js.UndefOr[String] = js.undefined
  var `ui-selectmenu-button-closed`: js.UndefOr[String] = js.undefined
  var `ui-selectmenu-button-open`: js.UndefOr[String] = js.undefined
  var `ui-selectmenu-icon`: js.UndefOr[String] = js.undefined
  var `ui-selectmenu-menu`: js.UndefOr[String] = js.undefined
  var `ui-selectmenu-open`: js.UndefOr[String] = js.undefined
  var `ui-selectmenu-optgroup`: js.UndefOr[String] = js.undefined
  var `ui-selectmenu-text`: js.UndefOr[String] = js.undefined
}

object SelectMenuClasses {
  @scala.inline
  def apply(
    `ui-selectmenu-button`: String = null,
    `ui-selectmenu-button-closed`: String = null,
    `ui-selectmenu-button-open`: String = null,
    `ui-selectmenu-icon`: String = null,
    `ui-selectmenu-menu`: String = null,
    `ui-selectmenu-open`: String = null,
    `ui-selectmenu-optgroup`: String = null,
    `ui-selectmenu-text`: String = null
  ): SelectMenuClasses = {
    val __obj = js.Dynamic.literal()
    if (`ui-selectmenu-button` != null) __obj.updateDynamic("ui-selectmenu-button")(`ui-selectmenu-button`.asInstanceOf[js.Any])
    if (`ui-selectmenu-button-closed` != null) __obj.updateDynamic("ui-selectmenu-button-closed")(`ui-selectmenu-button-closed`.asInstanceOf[js.Any])
    if (`ui-selectmenu-button-open` != null) __obj.updateDynamic("ui-selectmenu-button-open")(`ui-selectmenu-button-open`.asInstanceOf[js.Any])
    if (`ui-selectmenu-icon` != null) __obj.updateDynamic("ui-selectmenu-icon")(`ui-selectmenu-icon`.asInstanceOf[js.Any])
    if (`ui-selectmenu-menu` != null) __obj.updateDynamic("ui-selectmenu-menu")(`ui-selectmenu-menu`.asInstanceOf[js.Any])
    if (`ui-selectmenu-open` != null) __obj.updateDynamic("ui-selectmenu-open")(`ui-selectmenu-open`.asInstanceOf[js.Any])
    if (`ui-selectmenu-optgroup` != null) __obj.updateDynamic("ui-selectmenu-optgroup")(`ui-selectmenu-optgroup`.asInstanceOf[js.Any])
    if (`ui-selectmenu-text` != null) __obj.updateDynamic("ui-selectmenu-text")(`ui-selectmenu-text`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMenuClasses]
  }
}

