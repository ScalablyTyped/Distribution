package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardMedia/CardMedia.CardMediaClassKey>> */
trait PartialClassNameMapCardMediaClassKey extends js.Object {
  var media: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapCardMediaClassKey {
  @scala.inline
  def apply(media: String = null, root: String = null): PartialClassNameMapCardMediaClassKey = {
    val __obj = js.Dynamic.literal()
    if (media != null) __obj.updateDynamic("media")(media)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapCardMediaClassKey]
  }
}

