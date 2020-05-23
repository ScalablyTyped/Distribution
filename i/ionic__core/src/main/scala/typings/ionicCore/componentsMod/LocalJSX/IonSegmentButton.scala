package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.segmentSegmentInterfaceMod.SegmentButtonLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSegmentButton extends js.Object {
  /**
    * If `true`, the user cannot interact with the segment button.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the layout of the text and icon in the segment.
    */
  var layout: js.UndefOr[SegmentButtonLayout] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
  /**
    * The value of the segment button.
    */
  var value: js.UndefOr[String] = js.undefined
}

object IonSegmentButton {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    layout: SegmentButtonLayout = null,
    mode: ios | md = null,
    `type`: submit | reset | button = null,
    value: String = null
  ): IonSegmentButton = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSegmentButton]
  }
}

