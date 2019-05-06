package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonPicker extends js.Object {
  /**
    * If `true`, the picker will animate.
    */
  var animated: scala.Boolean = js.native
  /**
    * If `true`, the picker will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: scala.Boolean = js.native
  /**
    * Array of buttons to be displayed at the top of the picker.
    */
  var buttons: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PickerButton */ _
  ] = js.native
  /**
    * Array of columns to be displayed in the picker.
    */
  var columns: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PickerColumn */ _
  ] = js.native
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  /**
    * Number of milliseconds to wait before dismissing the picker.
    */
  var duration: scala.Double = js.native
  /**
    * Animation to use when the picker is presented.
    */
  var enterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.native
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: scala.Boolean = js.native
  /**
    * Animation to use when the picker is dismissed.
    */
  var leaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = js.native
  var overlayIndex: scala.Double = js.native
  /**
    * If `true`, a backdrop will be displayed behind the picker.
    */
  var showBackdrop: scala.Boolean = js.native
  /**
    * Dismiss the picker overlay after it has been presented.
    */
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Returns the column the matches the specified name
    */
  def getColumn(name: java.lang.String): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PickerColumn */ _
    ]
  ] = js.native
  /**
    * Returns a promise that resolves when the picker did dismiss.
    */
  def onDidDismiss(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail<any> */ _
  ] = js.native
  /**
    * Returns a promise that resolves when the picker will dismiss.
    */
  def onWillDismiss(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail<any> */ _
  ] = js.native
  /**
    * Present the picker overlay after it has been created.
    */
  def present(): js.Promise[scala.Unit] = js.native
}

