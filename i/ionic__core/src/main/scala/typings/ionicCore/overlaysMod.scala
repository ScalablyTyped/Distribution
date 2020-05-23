package typings.ionicCore

import typings.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typings.ionicCore.alertInterfaceMod.AlertOptions
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonActionSheetElement
import typings.ionicCore.componentsMod.global.HTMLIonAlertElement
import typings.ionicCore.componentsMod.global.HTMLIonLoadingElement
import typings.ionicCore.componentsMod.global.HTMLIonModalElement
import typings.ionicCore.componentsMod.global.HTMLIonPickerElement
import typings.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typings.ionicCore.componentsMod.global.HTMLIonToastElement
import typings.ionicCore.ionicCoreStrings._forceStatusbarPadding
import typings.ionicCore.ionicCoreStrings._testing
import typings.ionicCore.ionicCoreStrings._zoneGate
import typings.ionicCore.ionicCoreStrings.actionSheetEnter
import typings.ionicCore.ionicCoreStrings.actionSheetLeave
import typings.ionicCore.ionicCoreStrings.alertEnter
import typings.ionicCore.ionicCoreStrings.alertLeave
import typings.ionicCore.ionicCoreStrings.animated
import typings.ionicCore.ionicCoreStrings.backButtonDefaultHref
import typings.ionicCore.ionicCoreStrings.backButtonIcon
import typings.ionicCore.ionicCoreStrings.backButtonText
import typings.ionicCore.ionicCoreStrings.experimentalTransitionShadow
import typings.ionicCore.ionicCoreStrings.hardwareBackButton
import typings.ionicCore.ionicCoreStrings.hideCaretOnScroll
import typings.ionicCore.ionicCoreStrings.infiniteLoadingSpinner
import typings.ionicCore.ionicCoreStrings.inputBlurring
import typings.ionicCore.ionicCoreStrings.inputShims
import typings.ionicCore.ionicCoreStrings.keyboardHeight
import typings.ionicCore.ionicCoreStrings.loadingEnter
import typings.ionicCore.ionicCoreStrings.loadingLeave
import typings.ionicCore.ionicCoreStrings.loadingSpinner
import typings.ionicCore.ionicCoreStrings.menuIcon
import typings.ionicCore.ionicCoreStrings.menuType
import typings.ionicCore.ionicCoreStrings.modalEnter
import typings.ionicCore.ionicCoreStrings.modalLeave
import typings.ionicCore.ionicCoreStrings.mode
import typings.ionicCore.ionicCoreStrings.navAnimation
import typings.ionicCore.ionicCoreStrings.persistConfig
import typings.ionicCore.ionicCoreStrings.pickerEnter
import typings.ionicCore.ionicCoreStrings.pickerLeave
import typings.ionicCore.ionicCoreStrings.popoverEnter
import typings.ionicCore.ionicCoreStrings.popoverLeave
import typings.ionicCore.ionicCoreStrings.refreshingIcon
import typings.ionicCore.ionicCoreStrings.refreshingSpinner
import typings.ionicCore.ionicCoreStrings.rippleEffect
import typings.ionicCore.ionicCoreStrings.sanitizerEnabled
import typings.ionicCore.ionicCoreStrings.scrollAssist
import typings.ionicCore.ionicCoreStrings.scrollPadding
import typings.ionicCore.ionicCoreStrings.spinner
import typings.ionicCore.ionicCoreStrings.statusTap
import typings.ionicCore.ionicCoreStrings.swipeBackEnabled
import typings.ionicCore.ionicCoreStrings.tabButtonLayout
import typings.ionicCore.ionicCoreStrings.toastEnter
import typings.ionicCore.ionicCoreStrings.toastLeave
import typings.ionicCore.loadingInterfaceMod.LoadingOptions
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.modalInterfaceMod.ModalOptions
import typings.ionicCore.overlaysInterfaceMod.HTMLIonOverlayElement
import typings.ionicCore.overlaysInterfaceMod.OverlayInterface
import typings.ionicCore.pickerInterfaceMod.PickerOptions
import typings.ionicCore.popoverInterfaceMod.PopoverOptions
import typings.ionicCore.toastInterfaceMod.ToastOptions
import typings.std.Document
import typings.std.Event
import typings.std.HTMLElement
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/overlays", JSImport.Namespace)
@js.native
object overlaysMod extends js.Object {
  val BACKDROP: /* "backdrop" */ String = js.native
  val activeAnimations: WeakMap[OverlayInterface, js.Array[Animation]] = js.native
  def connectListeners(doc: Document): Unit = js.native
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String): js.Promise[T] = js.native
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String, opts: js.Object): js.Promise[T] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[String],
    name: mode | sanitizerEnabled | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: js.UndefOr[String],
    name: mode | sanitizerEnabled | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: js.UndefOr[String], overlayTag: String): js.Promise[Boolean] = js.native
  def dismissOverlay(doc: Document, data: js.Any, role: js.UndefOr[String], overlayTag: String, id: String): js.Promise[Boolean] = js.native
  def eventMethod[T](element: HTMLElement, eventName: String): js.Promise[T] = js.native
  def getOverlay(doc: Document): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlay(doc: Document, overlayTag: String): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlay(doc: Document, overlayTag: String, id: String): js.UndefOr[HTMLIonOverlayElement] = js.native
  def getOverlays(doc: Document): js.Array[HTMLIonOverlayElement] = js.native
  def getOverlays(doc: Document, selector: String): js.Array[HTMLIonOverlayElement] = js.native
  def isCancel(): Boolean = js.native
  def isCancel(role: String): Boolean = js.native
  def onceEvent(element: HTMLElement, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): Unit = js.native
  def prepareOverlay[T /* <: HTMLIonOverlayElement */](el: T): Unit = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | sanitizerEnabled | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder
  ): js.Promise[Unit] = js.native
  def present(
    overlay: OverlayInterface,
    name: mode | sanitizerEnabled | animated | rippleEffect | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Unit] = js.native
  def safeCall(handler: js.Any): js.Any = js.native
  def safeCall(handler: js.Any, arg: js.Any): js.Any = js.native
  @js.native
  object actionSheetController extends js.Object {
    def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
  }
  
  @js.native
  object alertController extends js.Object {
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
  }
  
  @js.native
  object loadingController extends js.Object {
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
  }
  
  @js.native
  object modalController extends js.Object {
    def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
  }
  
  @js.native
  object pickerController extends js.Object {
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
  }
  
  @js.native
  object popoverController extends js.Object {
    def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
  }
  
  @js.native
  object toastController extends js.Object {
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
  }
  
}

