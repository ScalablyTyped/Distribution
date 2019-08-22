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
import typings.atIonicCore.atIonicCoreStrings.mobile
import typings.atIonicCore.atIonicCoreStrings.mobileweb
import typings.atIonicCore.atIonicCoreStrings.phablet
import typings.atIonicCore.atIonicCoreStrings.pwa
import typings.atIonicCore.atIonicCoreStrings.tablet
import typings.atIonicCore.distTypesComponentsActionDashSheetActionDashSheetDashInterfaceMod.ActionSheetOptions
import typings.atIonicCore.distTypesComponentsAlertAlertDashInterfaceMod.AlertOptions
import typings.atIonicCore.distTypesComponentsLoadingLoadingDashInterfaceMod.LoadingOptions
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonActionSheetElement
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonAlertElement
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonLoadingElement
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonModalElement
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonPickerElement
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonPopoverElement
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonToastElement
import typings.atIonicCore.distTypesComponentsModalModalDashInterfaceMod.ModalOptions
import typings.atIonicCore.distTypesComponentsPickerPickerDashInterfaceMod.PickerOptions
import typings.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod.PopoverOptions
import typings.atIonicCore.distTypesComponentsToastToastDashInterfaceMod.ToastOptions
import typings.atIonicCore.distTypesInterfaceMod.ComponentRef
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
  def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def setupConfig(config: IonicConfig): js.Any = js.native
  @js.native
  object actionSheetController extends js.Object {
    def create(options: ActionSheetOptions): js.Promise[HTMLIonActionSheetElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonActionSheetElement]] = js.native
  }
  
  @js.native
  object alertController extends js.Object {
    def create(options: AlertOptions): js.Promise[HTMLIonAlertElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonAlertElement]] = js.native
  }
  
  @js.native
  object loadingController extends js.Object {
    def create(options: LoadingOptions): js.Promise[HTMLIonLoadingElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonLoadingElement]] = js.native
  }
  
  @js.native
  object modalController extends js.Object {
    def create(options: ModalOptions[ComponentRef]): js.Promise[HTMLIonModalElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonModalElement]] = js.native
  }
  
  @js.native
  object pickerController extends js.Object {
    def create(options: PickerOptions): js.Promise[HTMLIonPickerElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPickerElement]] = js.native
  }
  
  @js.native
  object popoverController extends js.Object {
    def create(options: PopoverOptions[ComponentRef]): js.Promise[HTMLIonPopoverElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonPopoverElement]] = js.native
  }
  
  @js.native
  object toastController extends js.Object {
    def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
  }
  
}

