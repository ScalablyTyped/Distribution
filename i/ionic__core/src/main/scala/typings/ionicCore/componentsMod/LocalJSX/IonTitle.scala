package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.large
import typings.ionicCore.ionicCoreStrings.small
import typings.ionicCore.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonTitle extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * The size of the toolbar title.
    */
  var size: js.UndefOr[large | small] = js.undefined
}

object IonTitle {
  @scala.inline
  def apply(color: Color = null, size: large | small = null): IonTitle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTitle]
  }
}

