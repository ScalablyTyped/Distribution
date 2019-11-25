package typings.atIonicCore

import typings.atIonicCore.atIonicCoreStrings._forceStatusbarPadding
import typings.atIonicCore.atIonicCoreStrings._testing
import typings.atIonicCore.atIonicCoreStrings._zoneGate
import typings.atIonicCore.atIonicCoreStrings.actionSheetEnter
import typings.atIonicCore.atIonicCoreStrings.actionSheetLeave
import typings.atIonicCore.atIonicCoreStrings.alertEnter
import typings.atIonicCore.atIonicCoreStrings.alertLeave
import typings.atIonicCore.atIonicCoreStrings.animated
import typings.atIonicCore.atIonicCoreStrings.backButtonIcon
import typings.atIonicCore.atIonicCoreStrings.backButtonText
import typings.atIonicCore.atIonicCoreStrings.backdrop
import typings.atIonicCore.atIonicCoreStrings.experimentalTransitionShadow
import typings.atIonicCore.atIonicCoreStrings.hardwareBackButton
import typings.atIonicCore.atIonicCoreStrings.hideCaretOnScroll
import typings.atIonicCore.atIonicCoreStrings.infiniteLoadingSpinner
import typings.atIonicCore.atIonicCoreStrings.inputBlurring
import typings.atIonicCore.atIonicCoreStrings.inputShims
import typings.atIonicCore.atIonicCoreStrings.keyboardHeight
import typings.atIonicCore.atIonicCoreStrings.loadingEnter
import typings.atIonicCore.atIonicCoreStrings.loadingLeave
import typings.atIonicCore.atIonicCoreStrings.loadingSpinner
import typings.atIonicCore.atIonicCoreStrings.menuIcon
import typings.atIonicCore.atIonicCoreStrings.menuType
import typings.atIonicCore.atIonicCoreStrings.modalEnter
import typings.atIonicCore.atIonicCoreStrings.modalLeave
import typings.atIonicCore.atIonicCoreStrings.mode
import typings.atIonicCore.atIonicCoreStrings.navAnimation
import typings.atIonicCore.atIonicCoreStrings.persistConfig
import typings.atIonicCore.atIonicCoreStrings.pickerEnter
import typings.atIonicCore.atIonicCoreStrings.pickerLeave
import typings.atIonicCore.atIonicCoreStrings.popoverEnter
import typings.atIonicCore.atIonicCoreStrings.popoverLeave
import typings.atIonicCore.atIonicCoreStrings.refreshingIcon
import typings.atIonicCore.atIonicCoreStrings.refreshingSpinner
import typings.atIonicCore.atIonicCoreStrings.rippleEffect
import typings.atIonicCore.atIonicCoreStrings.scrollAssist
import typings.atIonicCore.atIonicCoreStrings.scrollPadding
import typings.atIonicCore.atIonicCoreStrings.spinner
import typings.atIonicCore.atIonicCoreStrings.statusTap
import typings.atIonicCore.atIonicCoreStrings.swipeBackEnabled
import typings.atIonicCore.atIonicCoreStrings.tabButtonLayout
import typings.atIonicCore.atIonicCoreStrings.toastEnter
import typings.atIonicCore.atIonicCoreStrings.toastLeave
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonActionSheetElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonAlertElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonLoadingElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonModalElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPickerElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonToastElement
import typings.atIonicCore.distTypesUtilsOverlaysMod.IonicAnimationInterface
import typings.std.Document
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/overlays", JSImport.Namespace)
@js.native
object distTypesUtilsOverlaysMod extends js.Object {
  val BACKDROP: backdrop = js.native
  def connectListeners(doc: Document): Unit = js.native
  def createOverlay[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any */](tagName: String): js.Promise[T] = js.native
  def createOverlay[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any */](tagName: String, opts: js.Object): js.Promise[T] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: String,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: IonicAnimationInterface,
    mdLeaveAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: js.UndefOr[scala.Nothing], overlayTag: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: js.UndefOr[scala.Nothing], overlayTag: String, id: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: String, overlayTag: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: String, overlayTag: String, id: String): js.Promise[Boolean] = js.native
  def eventMethod[T](element: HTMLElement, eventName: String): js.Promise[T] = js.native
  def getOverlay(doc: Document): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any
  ] = js.native
  def getOverlay(doc: Document, overlayTag: js.UndefOr[scala.Nothing], id: String): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any
  ] = js.native
  def getOverlay(doc: Document, overlayTag: String): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any
  ] = js.native
  def getOverlay(doc: Document, overlayTag: String, id: String): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any
  ] = js.native
  def getOverlays(doc: Document): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ _
  ] = js.native
  def getOverlays(doc: Document, selector: String): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ _
  ] = js.native
  def isCancel(): Boolean = js.native
  def isCancel(role: String): Boolean = js.native
  def onceEvent(element: HTMLElement, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): Unit = js.native
  def prepareOverlay[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any */](el: T): Unit = js.native
  def present(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdEnterAnimation: IonicAnimationInterface
  ): js.Promise[Unit] = js.native
  def present(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdEnterAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def present(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: IonicAnimationInterface
  ): js.Promise[Unit] = js.native
  def present(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    name: mode | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: IonicAnimationInterface,
    mdEnterAnimation: IonicAnimationInterface,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def safeCall(handler: js.Any): js.Any = js.native
  def safeCall(handler: js.Any, arg: js.Any): js.Any = js.native
  @js.native
  object actionSheetController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionSheetOptions */ js.Any
    ): js.Promise[HTMLIonActionSheetElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
  }
  
  @js.native
  object alertController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AlertOptions */ js.Any
    ): js.Promise[HTMLIonAlertElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
  }
  
  @js.native
  object loadingController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify LoadingOptions */ js.Any
    ): js.Promise[HTMLIonLoadingElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
  }
  
  @js.native
  object modalController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModalOptions<imported_interface.ComponentRef> */ js.Any
    ): js.Promise[HTMLIonModalElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
  }
  
  @js.native
  object pickerController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PickerOptions */ js.Any
    ): js.Promise[HTMLIonPickerElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
  }
  
  @js.native
  object popoverController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PopoverOptions<imported_interface.ComponentRef> */ js.Any
    ): js.Promise[HTMLIonPopoverElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
  }
  
  @js.native
  object toastController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any
    ): js.Promise[HTMLIonToastElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
  }
  
  type IonicAnimationInterface = js.Function2[
    /* baseEl */ js.Any, 
    /* opts */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IonicAnimation */ js.Any
  ]
}

