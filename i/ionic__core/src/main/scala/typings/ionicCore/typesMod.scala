package typings.ionicCore

import typings.ionicCore.actionSheetInterfaceMod.ActionSheetOptions
import typings.ionicCore.alertInterfaceMod.AlertOptions
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonActionSheetElement
import typings.ionicCore.componentsMod.global.HTMLIonAlertElement
import typings.ionicCore.componentsMod.global.HTMLIonLoadingElement
import typings.ionicCore.componentsMod.global.HTMLIonMenuElement
import typings.ionicCore.componentsMod.global.HTMLIonModalElement
import typings.ionicCore.componentsMod.global.HTMLIonPickerElement
import typings.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typings.ionicCore.componentsMod.global.HTMLIonToastElement
import typings.ionicCore.gestureMod.Gesture
import typings.ionicCore.gestureMod.GestureConfig
import typings.ionicCore.ionicCoreStrings.android
import typings.ionicCore.ionicCoreStrings.capacitor
import typings.ionicCore.ionicCoreStrings.cordova
import typings.ionicCore.ionicCoreStrings.desktop
import typings.ionicCore.ionicCoreStrings.electron
import typings.ionicCore.ionicCoreStrings.hybrid
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.ipad
import typings.ionicCore.ionicCoreStrings.iphone
import typings.ionicCore.ionicCoreStrings.mobile
import typings.ionicCore.ionicCoreStrings.mobileweb
import typings.ionicCore.ionicCoreStrings.phablet
import typings.ionicCore.ionicCoreStrings.pwa
import typings.ionicCore.ionicCoreStrings.tablet
import typings.ionicCore.loadingInterfaceMod.LoadingOptions
import typings.ionicCore.menuInterfaceMod.MenuI
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.Mode
import typings.ionicCore.modalInterfaceMod.ModalOptions
import typings.ionicCore.pickerInterfaceMod.PickerOptions
import typings.ionicCore.platformMod.IsPlatformSignature
import typings.ionicCore.popoverInterfaceMod.PopoverOptions
import typings.ionicCore.toastInterfaceMod.ToastOptions
import typings.ionicCore.transitionMod.TransitionOptions
import typings.ionicCore.utilsConfigMod.IonicConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@ionic/core/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types", "IonicSafeString")
  @js.native
  class IonicSafeString protected ()
    extends typings.ionicCore.sanitizationMod.IonicSafeString {
    def this(value: String) = this()
  }
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_DID_ENTER")
  @js.native
  val LIFECYCLE_DID_ENTER: /* "ionViewDidEnter" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_DID_LEAVE")
  @js.native
  val LIFECYCLE_DID_LEAVE: /* "ionViewDidLeave" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_WILL_ENTER")
  @js.native
  val LIFECYCLE_WILL_ENTER: /* "ionViewWillEnter" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_WILL_LEAVE")
  @js.native
  val LIFECYCLE_WILL_LEAVE: /* "ionViewWillLeave" */ String = js.native
  
  @JSImport("@ionic/core/dist/types", "LIFECYCLE_WILL_UNLOAD")
  @js.native
  val LIFECYCLE_WILL_UNLOAD: /* "ionViewWillUnload" */ String = js.native
  
  object actionSheetController {
    
    @JSImport("@ionic/core/dist/types", "actionSheetController")
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
  
  object alertController {
    
    @JSImport("@ionic/core/dist/types", "alertController")
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
  def createAnimation(): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")().asInstanceOf[Animation]
  @scala.inline
  def createAnimation(animationId: String): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(animationId.asInstanceOf[js.Any]).asInstanceOf[Animation]
  
  @scala.inline
  def createGesture(config: GestureConfig): Gesture = ^.asInstanceOf[js.Dynamic].applyDynamic("createGesture")(config.asInstanceOf[js.Any]).asInstanceOf[Gesture]
  
  @scala.inline
  def getMode(): Mode = ^.asInstanceOf[js.Dynamic].applyDynamic("getMode")().asInstanceOf[Mode]
  
  @scala.inline
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")().asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  @scala.inline
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  
  @scala.inline
  def getTimeGivenProgression(
    p0: js.Array[Double],
    p1: js.Array[Double],
    p2: js.Array[Double],
    p3: js.Array[Double],
    progression: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeGivenProgression")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], progression.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def iosTransitionAnimation(navEl: HTMLElement, opts: TransitionOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("iosTransitionAnimation")(navEl.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]
  
  @JSImport("@ionic/core/dist/types", "isPlatform")
  @js.native
  val isPlatform: IsPlatformSignature = js.native
  
  object loadingController {
    
    @JSImport("@ionic/core/dist/types", "loadingController")
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
  
  @scala.inline
  def mdTransitionAnimation(_underscore: HTMLElement, opts: TransitionOptions): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("mdTransitionAnimation")(_underscore.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Animation]
  
  object menuController {
    
    @JSImport("@ionic/core/dist/types", "menuController")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def close(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def close(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def createAnimation(`type`: String, menuCmp: MenuI): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createAnimation")(`type`.asInstanceOf[js.Any], menuCmp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(shouldEnable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    @scala.inline
    def enable(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(shouldEnable.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    @scala.inline
    def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    @scala.inline
    def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    @scala.inline
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenus")().asInstanceOf[js.Promise[js.Array[HTMLIonMenuElement]]]
    
    @scala.inline
    def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpen")().asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    @scala.inline
    def getOpenSync(): js.UndefOr[HTMLIonMenuElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getOpenSync")().asInstanceOf[js.UndefOr[HTMLIonMenuElement]]
    
    @scala.inline
    def isAnimating(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimating")().asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def isEnabled(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def isEnabled(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def isOpen(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def isOpen(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def open(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def open(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def register(menu: MenuI): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_register")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def registerAnimation(name: String, animation: AnimationBuilder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(name.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setActiveMenu(menu: MenuI): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setActiveMenu")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("_setOpen")(menu.asInstanceOf[js.Any], shouldOpen.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("swipeGesture")(shouldEnable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    @scala.inline
    def swipeGesture(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("swipeGesture")(shouldEnable.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[HTMLIonMenuElement]]]
    
    @scala.inline
    def toggle(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def toggle(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    @scala.inline
    def unregister(menu: MenuI): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_unregister")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object modalController {
    
    @JSImport("@ionic/core/dist/types", "modalController")
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
  
  object pickerController {
    
    @JSImport("@ionic/core/dist/types", "pickerController")
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
    
    @JSImport("@ionic/core/dist/types", "popoverController")
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
  def setupConfig(config: IonicConfig): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setupConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  object toastController {
    
    @JSImport("@ionic/core/dist/types", "toastController")
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
