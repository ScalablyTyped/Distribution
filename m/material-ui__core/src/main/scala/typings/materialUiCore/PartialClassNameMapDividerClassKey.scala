package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Divider/Divider.DividerClassKey>> */
@js.native
trait PartialClassNameMapDividerClassKey extends js.Object {
  var absolute: js.UndefOr[String] = js.native
  var inset: js.UndefOr[String] = js.native
  var light: js.UndefOr[String] = js.native
  var middle: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapDividerClassKey {
  @scala.inline
  def apply(
    absolute: String = null,
    inset: String = null,
    light: String = null,
    middle: String = null,
    root: String = null
  ): PartialClassNameMapDividerClassKey = {
    val __obj = js.Dynamic.literal()
    if (absolute != null) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (middle != null) __obj.updateDynamic("middle")(middle.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapDividerClassKey]
  }
}

