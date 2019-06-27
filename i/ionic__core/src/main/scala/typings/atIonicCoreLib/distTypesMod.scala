package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types", JSImport.Namespace)
@js.native
object distTypesMod extends js.Object {
  val LIFECYCLE_DID_ENTER: atIonicCoreLib.atIonicCoreLibStrings.ionViewDidEnter = js.native
  val LIFECYCLE_DID_LEAVE: atIonicCoreLib.atIonicCoreLibStrings.ionViewDidLeave = js.native
  val LIFECYCLE_WILL_ENTER: atIonicCoreLib.atIonicCoreLibStrings.ionViewWillEnter = js.native
  val LIFECYCLE_WILL_LEAVE: atIonicCoreLib.atIonicCoreLibStrings.ionViewWillLeave = js.native
  val LIFECYCLE_WILL_UNLOAD: atIonicCoreLib.atIonicCoreLibStrings.ionViewWillUnload = js.native
  def getPlatforms(win: js.Any): js.Array[java.lang.String] = js.native
  def isPlatform(
    win: stdLib.Window,
    platform: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.ipad | atIonicCoreLib.atIonicCoreLibStrings.iphone | atIonicCoreLib.atIonicCoreLibStrings.android | atIonicCoreLib.atIonicCoreLibStrings.phablet | atIonicCoreLib.atIonicCoreLibStrings.tablet | atIonicCoreLib.atIonicCoreLibStrings.cordova | atIonicCoreLib.atIonicCoreLibStrings.capacitor | atIonicCoreLib.atIonicCoreLibStrings.electron | atIonicCoreLib.atIonicCoreLibStrings.pwa | atIonicCoreLib.atIonicCoreLibStrings.mobile | atIonicCoreLib.atIonicCoreLibStrings.mobileweb | atIonicCoreLib.atIonicCoreLibStrings.desktop | atIonicCoreLib.atIonicCoreLibStrings.hybrid
  ): scala.Boolean = js.native
  def setupConfig(config: atIonicCoreLib.distTypesUtilsConfigMod.IonicConfig): js.Any = js.native
  @js.native
  object actionSheetController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActionSheetOptions */ js.Any
    ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonActionSheetElement] = js.native
    def dismiss(): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def getTop(): js.Promise[
        js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonActionSheetElement]
      ] = js.native
  }
  
  @js.native
  object alertController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AlertOptions */ js.Any
    ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonAlertElement] = js.native
    def dismiss(): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonAlertElement]] = js.native
  }
  
  @js.native
  object loadingController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify LoadingOptions */ js.Any
    ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonLoadingElement] = js.native
    def dismiss(): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonLoadingElement]] = js.native
  }
  
  @js.native
  object modalController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModalOptions<imported_@ionic/core/dist/types/interface.ComponentRef> */ js.Any
    ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonModalElement] = js.native
    def dismiss(): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonModalElement]] = js.native
  }
  
  @js.native
  object pickerController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PickerOptions */ js.Any
    ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPickerElement] = js.native
    def dismiss(): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPickerElement]] = js.native
  }
  
  @js.native
  object popoverController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PopoverOptions<imported_@ionic/core/dist/types/interface.ComponentRef> */ js.Any
    ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement] = js.native
    def dismiss(): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement]] = js.native
  }
  
  @js.native
  object toastController extends js.Object {
    def create(
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any
    ): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonToastElement] = js.native
    def dismiss(): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
    def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
    def getTop(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonToastElement]] = js.native
  }
  
}

