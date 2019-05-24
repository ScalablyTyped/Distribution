package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardHeader/CardHeader.CardHeaderClassKey>> */
trait PartialClassNameMapCardHeaderClassKey extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var avatar: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var subheader: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapCardHeaderClassKey {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    avatar: java.lang.String = null,
    content: java.lang.String = null,
    root: java.lang.String = null,
    subheader: java.lang.String = null,
    title: java.lang.String = null
  ): PartialClassNameMapCardHeaderClassKey = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (content != null) __obj.updateDynamic("content")(content)
    if (root != null) __obj.updateDynamic("root")(root)
    if (subheader != null) __obj.updateDynamic("subheader")(subheader)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PartialClassNameMapCardHeaderClassKey]
  }
}

