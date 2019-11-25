package typings.atIonicCore

import typings.atIonicCore.atIonicCoreStrings.android
import typings.atIonicCore.atIonicCoreStrings.capacitor
import typings.atIonicCore.atIonicCoreStrings.cordova
import typings.atIonicCore.atIonicCoreStrings.desktop
import typings.atIonicCore.atIonicCoreStrings.electron
import typings.atIonicCore.atIonicCoreStrings.hybrid
import typings.atIonicCore.atIonicCoreStrings.ionViewDidEnter
import typings.atIonicCore.atIonicCoreStrings.ionViewDidLeave
import typings.atIonicCore.atIonicCoreStrings.ionViewWillEnter
import typings.atIonicCore.atIonicCoreStrings.ionViewWillLeave
import typings.atIonicCore.atIonicCoreStrings.ionViewWillUnload
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.ipad
import typings.atIonicCore.atIonicCoreStrings.iphone
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.atIonicCoreStrings.mobile
import typings.atIonicCore.atIonicCoreStrings.mobileweb
import typings.atIonicCore.atIonicCoreStrings.phablet
import typings.atIonicCore.atIonicCoreStrings.pwa
import typings.atIonicCore.atIonicCoreStrings.tablet
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonActionSheetElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonAlertElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonLoadingElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonMenuElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonModalElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPickerElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonToastElement
import typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod.Animation
import typings.atIonicCore.distTypesUtilsConfigMod.IonicConfig
import typings.atIonicCore.distTypesUtilsGestureMod.Gesture
import typings.atIonicCore.distTypesUtilsGestureMod.GestureConfig
import typings.atIonicCore.distTypesUtilsPlatformMod.IsPlatformSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types", JSImport.Namespace)
@js.native
object distTypesMod extends js.Object {
  val LIFECYCLE_DID_ENTER: ionViewDidEnter = js.native
  val LIFECYCLE_DID_LEAVE: ionViewDidLeave = js.native
  val LIFECYCLE_WILL_ENTER: ionViewWillEnter = js.native
  val LIFECYCLE_WILL_LEAVE: ionViewWillLeave = js.native
  val LIFECYCLE_WILL_UNLOAD: ionViewWillUnload = js.native
  val isPlatform: IsPlatformSignature = js.native
  def createAnimation(): Animation = js.native
  def createGesture(config: GestureConfig): Gesture = js.native
  def getMode(): ios | md = js.native
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def setupConfig(config: IonicConfig): js.Any = js.native
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
  object menuController extends js.Object {
    def _createAnimation(
      `type`: String,
      menuCmp: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuI */ js.Any
    ): js.Any = js.native
    def _getOpenSync(): js.UndefOr[HTMLIonMenuElement] = js.native
    def _register(menu: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuI */ js.Any): Unit = js.native
    def _setActiveMenu(menu: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuI */ js.Any): Unit = js.native
    def _setOpen(
      menu: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuI */ js.Any,
      shouldOpen: Boolean,
      animated: Boolean
    ): js.Promise[Boolean] = js.native
    def _unregister(menu: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuI */ js.Any): Unit = js.native
    def close(): js.Promise[Boolean] = js.native
    def close(menu: String): js.Promise[Boolean] = js.native
    def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def enable(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
    def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def isAnimating(): js.Promise[Boolean] = js.native
    def isEnabled(): js.Promise[Boolean] = js.native
    def isEnabled(menu: String): js.Promise[Boolean] = js.native
    def isOpen(): js.Promise[Boolean] = js.native
    def isOpen(menu: String): js.Promise[Boolean] = js.native
    def open(): js.Promise[Boolean] = js.native
    def open(menu: String): js.Promise[Boolean] = js.native
    def registerAnimation(
      name: String,
      animation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
    ): Unit = js.native
    def registerAnimation(
      name: String,
      animation: js.Function1[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuI */ /* menu */ js.Any, 
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IonicAnimation */ _
        ]
    ): Unit = js.native
    def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def swipeGesture(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def toggle(): js.Promise[Boolean] = js.native
    def toggle(menu: String): js.Promise[Boolean] = js.native
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
  
}

