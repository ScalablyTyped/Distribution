package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesInterfaceMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSegment extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * If `true`, the user cannot interact with the segment.
    */
  var disabled: Boolean
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * If `true`, the segment buttons will overflow and the user can swipe to see them.
    */
  var scrollable: Boolean
  /**
    * the value of the segment.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}

object IonSegment {
  @scala.inline
  def apply(
    disabled: Boolean,
    scrollable: Boolean,
    color: Color = null,
    mode: ios | md = null,
    value: String = null
  ): IonSegment = {
    val __obj = js.Dynamic.literal(disabled = disabled, scrollable = scrollable)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonSegment]
  }
}

