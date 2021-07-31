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
import typings.ionicCore.ionicCoreStrings._ael
import typings.ionicCore.ionicCoreStrings._forceStatusbarPadding
import typings.ionicCore.ionicCoreStrings._rel
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlaysMod {
  
  @JSImport("@ionic/core/dist/types/utils/overlays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "BACKDROP")
  @js.native
  val BACKDROP: /* "backdrop" */ String = js.native
  
  object actionSheetController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "actionSheetController")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonActionSheetElement]]
    
    @scala.inline
    def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonActionSheetElement]]]
  }
  
  @JSImport("@ionic/core/dist/types/utils/overlays", "activeAnimations")
  @js.native
  val activeAnimations: WeakMap[OverlayInterface, js.Array[Animation]] = js.native
  
  object alertController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "alertController")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonAlertElement]]
    
    @scala.inline
    def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonAlertElement]]]
  }
  
  @scala.inline
  def connectListeners(doc: Document): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectListeners")(doc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOverlay")(tagName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def createOverlay[T /* <: HTMLIonOverlayElement */](tagName: String, opts: js.Object): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOverlay")(tagName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: Unit,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def dismiss(
    overlay: OverlayInterface,
    data: js.Any,
    role: Unit,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def dismiss(
    overlay: OverlayInterface,
    data: Unit,
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def dismiss(
    overlay: OverlayInterface,
    data: Unit,
    role: String,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def dismiss(
    overlay: OverlayInterface,
    data: Unit,
    role: Unit,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def dismiss(
    overlay: OverlayInterface,
    data: Unit,
    role: Unit,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosLeaveAnimation: AnimationBuilder,
    mdLeaveAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(overlay.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosLeaveAnimation.asInstanceOf[js.Any], mdLeaveAnimation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def dismissOverlay(doc: Document, data: js.Any, role: String, overlayTag: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismissOverlay")(doc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def dismissOverlay(doc: Document, data: js.Any, role: String, overlayTag: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismissOverlay")(doc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def dismissOverlay(doc: Document, data: js.Any, role: Unit, overlayTag: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismissOverlay")(doc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def dismissOverlay(doc: Document, data: js.Any, role: Unit, overlayTag: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismissOverlay")(doc.asInstanceOf[js.Any], data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def eventMethod[T](element: HTMLElement, eventName: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventMethod")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def getOverlay(doc: Document): js.UndefOr[HTMLIonOverlayElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverlay")(doc.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLIonOverlayElement]]
  @scala.inline
  def getOverlay(doc: Document, overlayTag: String): js.UndefOr[HTMLIonOverlayElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlay")(doc.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLIonOverlayElement]]
  @scala.inline
  def getOverlay(doc: Document, overlayTag: String, id: String): js.UndefOr[HTMLIonOverlayElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlay")(doc.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLIonOverlayElement]]
  @scala.inline
  def getOverlay(doc: Document, overlayTag: Unit, id: String): js.UndefOr[HTMLIonOverlayElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlay")(doc.asInstanceOf[js.Any], overlayTag.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLIonOverlayElement]]
  
  @scala.inline
  def getOverlays(doc: Document): js.Array[HTMLIonOverlayElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverlays")(doc.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLIonOverlayElement]]
  @scala.inline
  def getOverlays(doc: Document, selector: String): js.Array[HTMLIonOverlayElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlays")(doc.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLIonOverlayElement]]
  
  @scala.inline
  def isCancel(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancel")().asInstanceOf[Boolean]
  @scala.inline
  def isCancel(role: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancel")(role.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object loadingController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "loadingController")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonLoadingElement]]
    
    @scala.inline
    def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonLoadingElement]]]
  }
  
  object modalController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "modalController")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonModalElement]]
    
    @scala.inline
    def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonModalElement]]]
  }
  
  @scala.inline
  def onceEvent(element: HTMLElement, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onceEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object pickerController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "pickerController")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonPickerElement]]
    
    @scala.inline
    def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonPickerElement]]]
  }
  
  object popoverController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "popoverController")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonPopoverElement]]
    
    @scala.inline
    def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonPopoverElement]]]
  }
  
  @scala.inline
  def prepareOverlay[T /* <: HTMLIonOverlayElement */](el: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareOverlay")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def present(
    overlay: OverlayInterface,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("present")(overlay.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosEnterAnimation.asInstanceOf[js.Any], mdEnterAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def present(
    overlay: OverlayInterface,
    name: /* keyof @ionic/core.@ionic/core/dist/types/utils/config.IonicConfig */ animated | rippleEffect | mode | hardwareBackButton | statusTap | backButtonIcon | backButtonText | backButtonDefaultHref | menuIcon | menuType | spinner | loadingSpinner | refreshingIcon | refreshingSpinner | infiniteLoadingSpinner | swipeBackEnabled | tabButtonLayout | navAnimation | actionSheetEnter | alertEnter | loadingEnter | modalEnter | popoverEnter | toastEnter | pickerEnter | actionSheetLeave | alertLeave | loadingLeave | modalLeave | popoverLeave | toastLeave | pickerLeave | experimentalTransitionShadow | sanitizerEnabled | keyboardHeight | inputShims | scrollPadding | inputBlurring | scrollAssist | hideCaretOnScroll | persistConfig | _forceStatusbarPadding | _testing | _zoneGate | _ael | _rel,
    iosEnterAnimation: AnimationBuilder,
    mdEnterAnimation: AnimationBuilder,
    opts: js.Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("present")(overlay.asInstanceOf[js.Any], name.asInstanceOf[js.Any], iosEnterAnimation.asInstanceOf[js.Any], mdEnterAnimation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def safeCall(handler: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("safeCall")(handler.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def safeCall(handler: js.Any, arg: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("safeCall")(handler.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  object toastController {
    
    @JSImport("@ionic/core/dist/types/utils/overlays", "toastController")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLIonToastElement]]
    
    @scala.inline
    def dismiss(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: js.Any, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")(data.asInstanceOf[js.Any], role.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTop")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonToastElement]]]
  }
}
