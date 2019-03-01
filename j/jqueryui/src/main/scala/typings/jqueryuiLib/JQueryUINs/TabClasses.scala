package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabClasses extends js.Object {
  var `ui-tabs`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-tabs-active`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-tabs-anchor`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-tabs-collapsible`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-tabs-loading`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-tabs-nav`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-tabs-panel`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-tabs-tab`: js.UndefOr[java.lang.String] = js.undefined
}

object TabClasses {
  @scala.inline
  def apply(
    `ui-tabs`: java.lang.String = null,
    `ui-tabs-active`: java.lang.String = null,
    `ui-tabs-anchor`: java.lang.String = null,
    `ui-tabs-collapsible`: java.lang.String = null,
    `ui-tabs-loading`: java.lang.String = null,
    `ui-tabs-nav`: java.lang.String = null,
    `ui-tabs-panel`: java.lang.String = null,
    `ui-tabs-tab`: java.lang.String = null
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

