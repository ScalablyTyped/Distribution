package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogClasses extends js.Object {
  var `ui-dialog`: js.UndefOr[String] = js.undefined
  var `ui-dialog-buttonpane`: js.UndefOr[String] = js.undefined
  var `ui-dialog-buttons`: js.UndefOr[String] = js.undefined
  var `ui-dialog-buttonset`: js.UndefOr[String] = js.undefined
  var `ui-dialog-content`: js.UndefOr[String] = js.undefined
  var `ui-dialog-dragging`: js.UndefOr[String] = js.undefined
  var `ui-dialog-resizing`: js.UndefOr[String] = js.undefined
  var `ui-dialog-title`: js.UndefOr[String] = js.undefined
  var `ui-dialog-titlebar`: js.UndefOr[String] = js.undefined
  var `ui-dialog-titlebar-close`: js.UndefOr[String] = js.undefined
  var `ui-widget-overlay`: js.UndefOr[String] = js.undefined
}

object DialogClasses {
  @scala.inline
  def apply(
    `ui-dialog`: String = null,
    `ui-dialog-buttonpane`: String = null,
    `ui-dialog-buttons`: String = null,
    `ui-dialog-buttonset`: String = null,
    `ui-dialog-content`: String = null,
    `ui-dialog-dragging`: String = null,
    `ui-dialog-resizing`: String = null,
    `ui-dialog-title`: String = null,
    `ui-dialog-titlebar`: String = null,
    `ui-dialog-titlebar-close`: String = null,
    `ui-widget-overlay`: String = null
  ): DialogClasses = {
    val __obj = js.Dynamic.literal()
    if (`ui-dialog` != null) __obj.updateDynamic("ui-dialog")(`ui-dialog`)
    if (`ui-dialog-buttonpane` != null) __obj.updateDynamic("ui-dialog-buttonpane")(`ui-dialog-buttonpane`)
    if (`ui-dialog-buttons` != null) __obj.updateDynamic("ui-dialog-buttons")(`ui-dialog-buttons`)
    if (`ui-dialog-buttonset` != null) __obj.updateDynamic("ui-dialog-buttonset")(`ui-dialog-buttonset`)
    if (`ui-dialog-content` != null) __obj.updateDynamic("ui-dialog-content")(`ui-dialog-content`)
    if (`ui-dialog-dragging` != null) __obj.updateDynamic("ui-dialog-dragging")(`ui-dialog-dragging`)
    if (`ui-dialog-resizing` != null) __obj.updateDynamic("ui-dialog-resizing")(`ui-dialog-resizing`)
    if (`ui-dialog-title` != null) __obj.updateDynamic("ui-dialog-title")(`ui-dialog-title`)
    if (`ui-dialog-titlebar` != null) __obj.updateDynamic("ui-dialog-titlebar")(`ui-dialog-titlebar`)
    if (`ui-dialog-titlebar-close` != null) __obj.updateDynamic("ui-dialog-titlebar-close")(`ui-dialog-titlebar-close`)
    if (`ui-widget-overlay` != null) __obj.updateDynamic("ui-widget-overlay")(`ui-widget-overlay`)
    __obj.asInstanceOf[DialogClasses]
  }
}

