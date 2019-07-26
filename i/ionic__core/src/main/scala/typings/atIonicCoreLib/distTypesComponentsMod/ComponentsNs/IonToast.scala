package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonToast extends js.Object {
  /**
    * If `true`, the toast will animate.
    */
  var animated: scala.Boolean = js.native
  /**
    * An array of buttons for the toast.
    */
  var buttons: js.UndefOr[
    js.Array[
      (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastButton */ _) | java.lang.String
    ]
  ] = js.native
  /**
    * Text to display in the close button.
    */
  var closeButtonText: js.UndefOr[java.lang.String] = js.native
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.native
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  /**
    * How many milliseconds to wait before hiding the toast. By default, it will show until `dismiss()` is called.
    */
  var duration: scala.Double = js.native
  /**
    * Animation to use when the toast is presented.
    */
  var enterAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.native
  /**
    * Header to be shown in the toast.
    */
  var header: js.UndefOr[java.lang.String] = js.native
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: scala.Boolean = js.native
  /**
    * Animation to use when the toast is dismissed.
    */
  var leaveAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.native
  /**
    * Message to be shown in the toast.
    */
  var message: js.UndefOr[java.lang.String] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.native
  var overlayIndex: scala.Double = js.native
  /**
    * The position of the toast on the screen.
    */
  var position: atIonicCoreLib.atIonicCoreLibStrings.top | atIonicCoreLib.atIonicCoreLibStrings.bottom | atIonicCoreLib.atIonicCoreLibStrings.middle = js.native
  /**
    * If `true`, the close button will be displayed.
    */
  var showCloseButton: scala.Boolean = js.native
  /**
    * If `true`, the toast will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: scala.Boolean = js.native
  /**
    * Dismiss the toast overlay after it has been presented.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the toast. This can be useful in a button handler for determining which button was clicked to dismiss the toast. Some examples include: ``"cancel"`, `"destructive"`, "selected"`, and `"backdrop"`.
    */
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Returns a promise that resolves when the toast did dismiss.
    */
  def onDidDismiss(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail<any> */ _
  ] = js.native
  /**
    * Returns a promise that resolves when the toast will dismiss.
    */
  def onWillDismiss(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail<any> */ _
  ] = js.native
  /**
    * Present the toast overlay after it has been created.
    */
  def present(): js.Promise[scala.Unit] = js.native
}

