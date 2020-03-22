package typings.ionicCore.componentsMod.Components

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonModal extends js.Object {
  /**
    * If `true`, the modal will animate.
    */
  var animated: Boolean = js.native
  /**
    * If `true`, the modal will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: Boolean = js.native
  /**
    * The component to display inside of the modal.
    */
  var component: ComponentRef = js.native
  /**
    * The data to pass to the modal component.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  /**
    * Animation to use when the modal is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: Boolean = js.native
  /**
    * Animation to use when the modal is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  var overlayIndex: Double = js.native
  /**
    * The element that presented the modal. This is used for card presentation effects and for stacking multiple modals on top of each other. Only applies in iOS mode.
    */
  var presentingElement: js.UndefOr[HTMLElement] = js.native
  /**
    * If `true`, a backdrop will be displayed behind the modal.
    */
  var showBackdrop: Boolean = js.native
  /**
    * If `true`, the modal can be swiped to dismiss. Only applies in iOS mode.
    */
  var swipeToClose: Boolean = js.native
  /**
    * Dismiss the modal overlay after it has been presented.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the modal. For example, 'cancel' or 'backdrop'.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  /**
    * Returns a promise that resolves when the modal did dismiss.
    */
  def onDidDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
  /**
    * Returns a promise that resolves when the modal will dismiss.
    */
  def onWillDismiss(): js.Promise[OverlayEventDetail[_]] = js.native
  /**
    * Present the modal overlay after it has been created.
    */
  def present(): js.Promise[Unit] = js.native
}

