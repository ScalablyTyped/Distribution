package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonLabel extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * The position determines where and how the label behaves inside an item.
    */
  var position: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.fixed | atIonicCoreLib.atIonicCoreLibStrings.stacked | atIonicCoreLib.atIonicCoreLibStrings.floating
  ] = js.undefined
}

object IonLabel {
  @scala.inline
  def apply(
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    position: atIonicCoreLib.atIonicCoreLibStrings.fixed | atIonicCoreLib.atIonicCoreLibStrings.stacked | atIonicCoreLib.atIonicCoreLibStrings.floating = null
  ): IonLabel = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (color != null) __obj.updateDynamic("color")(color)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonLabel]
  }
}

