package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Collapse/Collapse.CollapseClassKey>> */
trait PartialClassNameMapCollapseClassKey extends js.Object {
  var container: js.UndefOr[java.lang.String] = js.undefined
  var entered: js.UndefOr[java.lang.String] = js.undefined
  var wrapper: js.UndefOr[java.lang.String] = js.undefined
  var wrapperInner: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapCollapseClassKey {
  @scala.inline
  def apply(
    container: java.lang.String = null,
    entered: java.lang.String = null,
    wrapper: java.lang.String = null,
    wrapperInner: java.lang.String = null
  ): PartialClassNameMapCollapseClassKey = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (entered != null) __obj.updateDynamic("entered")(entered)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    if (wrapperInner != null) __obj.updateDynamic("wrapperInner")(wrapperInner)
    __obj.asInstanceOf[PartialClassNameMapCollapseClassKey]
  }
}

