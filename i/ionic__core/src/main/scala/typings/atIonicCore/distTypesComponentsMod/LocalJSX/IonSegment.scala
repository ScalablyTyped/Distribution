package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesComponentsSegmentSegmentDashInterfaceMod.SegmentChangeEventDetail
import typings.atIonicCore.distTypesInterfaceMod.Color
import typings.std.CustomEvent
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
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted when the value property has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[SegmentChangeEventDetail], Unit]] = js.undefined
  /**
    * If `true`, the segment buttons will overflow and the user can swipe to see them.
    */
  var scrollable: js.UndefOr[Boolean] = js.undefined
  /**
    * the value of the segment.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}

object IonSegment {
  @scala.inline
  def apply(
    color: Color = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    mode: ios | md = null,
    onIonChange: /* event */ CustomEvent[SegmentChangeEventDetail] => Unit = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): IonSegment = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonChange != null) __obj.updateDynamic("onIonChange")(js.Any.fromFunction1(onIonChange))
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IonSegment]
  }
}

