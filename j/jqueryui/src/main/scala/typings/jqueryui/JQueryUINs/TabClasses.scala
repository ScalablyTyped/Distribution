package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabClasses extends js.Object {
  var `ui-tabs`: js.UndefOr[String] = js.undefined
  var `ui-tabs-active`: js.UndefOr[String] = js.undefined
  var `ui-tabs-anchor`: js.UndefOr[String] = js.undefined
  var `ui-tabs-collapsible`: js.UndefOr[String] = js.undefined
  var `ui-tabs-loading`: js.UndefOr[String] = js.undefined
  var `ui-tabs-nav`: js.UndefOr[String] = js.undefined
  var `ui-tabs-panel`: js.UndefOr[String] = js.undefined
  var `ui-tabs-tab`: js.UndefOr[String] = js.undefined
}

object TabClasses {
  @scala.inline
  def apply(
    `ui-tabs`: String = null,
    `ui-tabs-active`: String = null,
    `ui-tabs-anchor`: String = null,
    `ui-tabs-collapsible`: String = null,
    `ui-tabs-loading`: String = null,
    `ui-tabs-nav`: String = null,
    `ui-tabs-panel`: String = null,
    `ui-tabs-tab`: String = null
  ): TabClasses = {
    val __obj = js.Dynamic.literal()
    if (`ui-tabs` != null) __obj.updateDynamic("ui-tabs")(`ui-tabs`)
    if (`ui-tabs-active` != null) __obj.updateDynamic("ui-tabs-active")(`ui-tabs-active`)
    if (`ui-tabs-anchor` != null) __obj.updateDynamic("ui-tabs-anchor")(`ui-tabs-anchor`)
    if (`ui-tabs-collapsible` != null) __obj.updateDynamic("ui-tabs-collapsible")(`ui-tabs-collapsible`)
    if (`ui-tabs-loading` != null) __obj.updateDynamic("ui-tabs-loading")(`ui-tabs-loading`)
    if (`ui-tabs-nav` != null) __obj.updateDynamic("ui-tabs-nav")(`ui-tabs-nav`)
    if (`ui-tabs-panel` != null) __obj.updateDynamic("ui-tabs-panel")(`ui-tabs-panel`)
    if (`ui-tabs-tab` != null) __obj.updateDynamic("ui-tabs-tab")(`ui-tabs-tab`)
    __obj.asInstanceOf[TabClasses]
  }
}

