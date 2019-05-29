package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonPopover extends js.Object {
  /**
    * If `true`, the popover will animate.
    */
  var animated: scala.Boolean = js.native
  /**
    * If `true`, the popover will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: scala.Boolean = js.native
  /**
    * The component to display inside of the popover.
    */
  var component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any = js.native
  /**
    * The data to pass to the popover component.
    */
  var componentProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any
  ] = js.native
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var delegate: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.Any
  ] = js.native
  /**
    * Animation to use when the popover is presented.
    */
  var enterAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.native
  /**
    * The event to pass to the popover animation.
    */
  var event: js.Any = js.native
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: scala.Boolean = js.native
  /**
    * Animation to use when the popover is dismissed.
    */
  var leaveAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = js.native
  var overlayIndex: scala.Double = js.native
  /**
    * If `true`, a backdrop will be displayed behind the popover.
    */
  var showBackdrop: scala.Boolean = js.native
  /**
    * If `true`, the popover will be translucent.
    */
  var translucent: scala.Boolean = js.native
  /**
    * Dismiss the popover overlay after it has been presented.
    */
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Returns a promise that resolves when the popover did dismiss.
    */
  def onDidDismiss(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail<any> */ _
  ] = js.native
  /**
    * Returns a promise that resolves when the popover will dismiss.
    */
  def onWillDismiss(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail<any> */ _
  ] = js.native
  /**
    * Present the popover overlay after it has been created.
    */
  def present(): js.Promise[scala.Unit] = js.native
}

