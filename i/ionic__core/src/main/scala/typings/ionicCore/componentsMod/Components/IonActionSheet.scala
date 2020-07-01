package typings.ionicCore.componentsMod.Components

import typings.ionicCore.actionSheetInterfaceMod.ActionSheetButton
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonActionSheet extends js.Object {
  /**
    * If `true`, the action sheet will animate.
    */
  var animated: Boolean = js.native
  /**
    * If `true`, the action sheet will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: Boolean = js.native
  /**
    * An array of buttons for the action sheet.
    */
  var buttons: js.Array[ActionSheetButton | String] = js.native
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Animation to use when the action sheet is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * Title for the action sheet.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: Boolean = js.native
  /**
    * Animation to use when the action sheet is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  var overlayIndex: Double = js.native
  /**
    * Subtitle for the action sheet.
    */
  var subHeader: js.UndefOr[String] = js.native
  /**
    * If `true`, the action sheet will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: Boolean = js.native
  /**
    * Dismiss the action sheet overlay after it has been presented.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the action sheet. This can be useful in a button handler for determining which button was clicked to dismiss the action sheet. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  /**
    * Returns a promise that resolves when the action sheet did dismiss.
    */
  def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  /**
    * Returns a promise that resolves when the action sheet will dismiss.
    */
  def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  /**
    * Present the action sheet overlay after it has been created.
    */
  def present(): js.Promise[Unit] = js.native
}

