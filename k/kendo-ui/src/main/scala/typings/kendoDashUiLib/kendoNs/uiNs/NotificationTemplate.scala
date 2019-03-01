package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTemplate extends js.Object {
  var template: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NotificationTemplate {
  @scala.inline
  def apply(template: java.lang.String = null, `type`: java.lang.String = null): NotificationTemplate = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NotificationTemplate]
  }
}

