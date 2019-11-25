package typings.jqueryui.JQueryUI

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
    if (`ui-tabs` != null) __obj.updateDynamic("ui-tabs")(`ui-tabs`.asInstanceOf[js.Any])
    if (`ui-tabs-active` != null) __obj.updateDynamic("ui-tabs-active")(`ui-tabs-active`.asInstanceOf[js.Any])
    if (`ui-tabs-anchor` != null) __obj.updateDynamic("ui-tabs-anchor")(`ui-tabs-anchor`.asInstanceOf[js.Any])
    if (`ui-tabs-collapsible` != null) __obj.updateDynamic("ui-tabs-collapsible")(`ui-tabs-collapsible`.asInstanceOf[js.Any])
    if (`ui-tabs-loading` != null) __obj.updateDynamic("ui-tabs-loading")(`ui-tabs-loading`.asInstanceOf[js.Any])
    if (`ui-tabs-nav` != null) __obj.updateDynamic("ui-tabs-nav")(`ui-tabs-nav`.asInstanceOf[js.Any])
    if (`ui-tabs-panel` != null) __obj.updateDynamic("ui-tabs-panel")(`ui-tabs-panel`.asInstanceOf[js.Any])
    if (`ui-tabs-tab` != null) __obj.updateDynamic("ui-tabs-tab")(`ui-tabs-tab`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabClasses]
  }
}

