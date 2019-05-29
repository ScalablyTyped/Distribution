package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSpinner extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * Duration of the spinner animation in milliseconds. The default varies based on the spinner.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the SVG spinner to use. If a name is not provided, the platform's default spinner will be used.
    */
  var name: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any
  ] = js.undefined
  /**
    * If `true`, the spinner's animation will be paused.
    */
  var paused: scala.Boolean
}

object IonSpinner {
  @scala.inline
  def apply(
    paused: scala.Boolean,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    duration: scala.Int | scala.Double = null,
    name: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null
  ): IonSpinner = {
    val __obj = js.Dynamic.literal(paused = paused)
    if (color != null) __obj.updateDynamic("color")(color)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IonSpinner]
  }
}

