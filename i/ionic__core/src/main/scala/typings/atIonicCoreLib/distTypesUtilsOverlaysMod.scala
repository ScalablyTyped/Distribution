package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/overlays", JSImport.Namespace)
@js.native
object distTypesUtilsOverlaysMod extends js.Object {
  val BACKDROP: atIonicCoreLib.atIonicCoreLibStrings.backdrop = js.native
  def autoFocus(containerEl: stdLib.HTMLElement): js.UndefOr[stdLib.HTMLElement] = js.native
  def connectListeners(doc: stdLib.Document): scala.Unit = js.native
  def createOverlay[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any */](tagName: java.lang.String): js.Promise[T] = js.native
  def createOverlay[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any */](tagName: java.lang.String, opts: js.Object): js.Promise[T] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: atIonicCoreLib.atIonicCoreLibStrings.mode | atIonicCoreLib.atIonicCoreLibStrings.animated | atIonicCoreLib.atIonicCoreLibStrings.rippleEffect | atIonicCoreLib.atIonicCoreLibStrings.hardwareBackButton | atIonicCoreLib.atIonicCoreLibStrings.statusTap | atIonicCoreLib.atIonicCoreLibStrings.backButtonIcon | atIonicCoreLib.atIonicCoreLibStrings.backButtonText | atIonicCoreLib.atIonicCoreLibStrings.menuIcon | atIonicCoreLib.atIonicCoreLibStrings.menuType | atIonicCoreLib.atIonicCoreLibStrings.spinner | atIonicCoreLib.atIonicCoreLibStrings.loadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.refreshingIcon | atIonicCoreLib.atIonicCoreLibStrings.refreshingSpinner | atIonicCoreLib.atIonicCoreLibStrings.infiniteLoadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.swipeBackEnabled | atIonicCoreLib.atIonicCoreLibStrings.tabButtonLayout | atIonicCoreLib.atIonicCoreLibStrings.navAnimation | atIonicCoreLib.atIonicCoreLibStrings.actionSheetEnter | atIonicCoreLib.atIonicCoreLibStrings.alertEnter | atIonicCoreLib.atIonicCoreLibStrings.loadingEnter | atIonicCoreLib.atIonicCoreLibStrings.modalEnter | atIonicCoreLib.atIonicCoreLibStrings.popoverEnter | atIonicCoreLib.atIonicCoreLibStrings.toastEnter | atIonicCoreLib.atIonicCoreLibStrings.pickerEnter | atIonicCoreLib.atIonicCoreLibStrings.actionSheetLeave | atIonicCoreLib.atIonicCoreLibStrings.alertLeave | atIonicCoreLib.atIonicCoreLibStrings.loadingLeave | atIonicCoreLib.atIonicCoreLibStrings.modalLeave | atIonicCoreLib.atIonicCoreLibStrings.popoverLeave | atIonicCoreLib.atIonicCoreLibStrings.toastLeave | atIonicCoreLib.atIonicCoreLibStrings.pickerLeave | atIonicCoreLib.atIonicCoreLibStrings.keyboardHeight | atIonicCoreLib.atIonicCoreLibStrings.inputShims | atIonicCoreLib.atIonicCoreLibStrings.scrollPadding | atIonicCoreLib.atIonicCoreLibStrings.inputBlurring | atIonicCoreLib.atIonicCoreLibStrings.scrollAssist | atIonicCoreLib.atIonicCoreLibStrings.hideCaretOnScroll | atIonicCoreLib.atIonicCoreLibStrings.persistConfig | atIonicCoreLib.atIonicCoreLibStrings._forceStatusbarPadding | atIonicCoreLib.atIonicCoreLibStrings._testing,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    name: atIonicCoreLib.atIonicCoreLibStrings.mode | atIonicCoreLib.atIonicCoreLibStrings.animated | atIonicCoreLib.atIonicCoreLibStrings.rippleEffect | atIonicCoreLib.atIonicCoreLibStrings.hardwareBackButton | atIonicCoreLib.atIonicCoreLibStrings.statusTap | atIonicCoreLib.atIonicCoreLibStrings.backButtonIcon | atIonicCoreLib.atIonicCoreLibStrings.backButtonText | atIonicCoreLib.atIonicCoreLibStrings.menuIcon | atIonicCoreLib.atIonicCoreLibStrings.menuType | atIonicCoreLib.atIonicCoreLibStrings.spinner | atIonicCoreLib.atIonicCoreLibStrings.loadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.refreshingIcon | atIonicCoreLib.atIonicCoreLibStrings.refreshingSpinner | atIonicCoreLib.atIonicCoreLibStrings.infiniteLoadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.swipeBackEnabled | atIonicCoreLib.atIonicCoreLibStrings.tabButtonLayout | atIonicCoreLib.atIonicCoreLibStrings.navAnimation | atIonicCoreLib.atIonicCoreLibStrings.actionSheetEnter | atIonicCoreLib.atIonicCoreLibStrings.alertEnter | atIonicCoreLib.atIonicCoreLibStrings.loadingEnter | atIonicCoreLib.atIonicCoreLibStrings.modalEnter | atIonicCoreLib.atIonicCoreLibStrings.popoverEnter | atIonicCoreLib.atIonicCoreLibStrings.toastEnter | atIonicCoreLib.atIonicCoreLibStrings.pickerEnter | atIonicCoreLib.atIonicCoreLibStrings.actionSheetLeave | atIonicCoreLib.atIonicCoreLibStrings.alertLeave | atIonicCoreLib.atIonicCoreLibStrings.loadingLeave | atIonicCoreLib.atIonicCoreLibStrings.modalLeave | atIonicCoreLib.atIonicCoreLibStrings.popoverLeave | atIonicCoreLib.atIonicCoreLibStrings.toastLeave | atIonicCoreLib.atIonicCoreLibStrings.pickerLeave | atIonicCoreLib.atIonicCoreLibStrings.keyboardHeight | atIonicCoreLib.atIonicCoreLibStrings.inputShims | atIonicCoreLib.atIonicCoreLibStrings.scrollPadding | atIonicCoreLib.atIonicCoreLibStrings.inputBlurring | atIonicCoreLib.atIonicCoreLibStrings.scrollAssist | atIonicCoreLib.atIonicCoreLibStrings.hideCaretOnScroll | atIonicCoreLib.atIonicCoreLibStrings.persistConfig | atIonicCoreLib.atIonicCoreLibStrings._forceStatusbarPadding | atIonicCoreLib.atIonicCoreLibStrings._testing,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    opts: js.Any
  ): js.Promise[scala.Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: java.lang.String,
    name: atIonicCoreLib.atIonicCoreLibStrings.mode | atIonicCoreLib.atIonicCoreLibStrings.animated | atIonicCoreLib.atIonicCoreLibStrings.rippleEffect | atIonicCoreLib.atIonicCoreLibStrings.hardwareBackButton | atIonicCoreLib.atIonicCoreLibStrings.statusTap | atIonicCoreLib.atIonicCoreLibStrings.backButtonIcon | atIonicCoreLib.atIonicCoreLibStrings.backButtonText | atIonicCoreLib.atIonicCoreLibStrings.menuIcon | atIonicCoreLib.atIonicCoreLibStrings.menuType | atIonicCoreLib.atIonicCoreLibStrings.spinner | atIonicCoreLib.atIonicCoreLibStrings.loadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.refreshingIcon | atIonicCoreLib.atIonicCoreLibStrings.refreshingSpinner | atIonicCoreLib.atIonicCoreLibStrings.infiniteLoadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.swipeBackEnabled | atIonicCoreLib.atIonicCoreLibStrings.tabButtonLayout | atIonicCoreLib.atIonicCoreLibStrings.navAnimation | atIonicCoreLib.atIonicCoreLibStrings.actionSheetEnter | atIonicCoreLib.atIonicCoreLibStrings.alertEnter | atIonicCoreLib.atIonicCoreLibStrings.loadingEnter | atIonicCoreLib.atIonicCoreLibStrings.modalEnter | atIonicCoreLib.atIonicCoreLibStrings.popoverEnter | atIonicCoreLib.atIonicCoreLibStrings.toastEnter | atIonicCoreLib.atIonicCoreLibStrings.pickerEnter | atIonicCoreLib.atIonicCoreLibStrings.actionSheetLeave | atIonicCoreLib.atIonicCoreLibStrings.alertLeave | atIonicCoreLib.atIonicCoreLibStrings.loadingLeave | atIonicCoreLib.atIonicCoreLibStrings.modalLeave | atIonicCoreLib.atIonicCoreLibStrings.popoverLeave | atIonicCoreLib.atIonicCoreLibStrings.toastLeave | atIonicCoreLib.atIonicCoreLibStrings.pickerLeave | atIonicCoreLib.atIonicCoreLibStrings.keyboardHeight | atIonicCoreLib.atIonicCoreLibStrings.inputShims | atIonicCoreLib.atIonicCoreLibStrings.scrollPadding | atIonicCoreLib.atIonicCoreLibStrings.inputBlurring | atIonicCoreLib.atIonicCoreLibStrings.scrollAssist | atIonicCoreLib.atIonicCoreLibStrings.hideCaretOnScroll | atIonicCoreLib.atIonicCoreLibStrings.persistConfig | atIonicCoreLib.atIonicCoreLibStrings._forceStatusbarPadding | atIonicCoreLib.atIonicCoreLibStrings._testing,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def dismiss(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    data: js.Any,
    role: java.lang.String,
    name: atIonicCoreLib.atIonicCoreLibStrings.mode | atIonicCoreLib.atIonicCoreLibStrings.animated | atIonicCoreLib.atIonicCoreLibStrings.rippleEffect | atIonicCoreLib.atIonicCoreLibStrings.hardwareBackButton | atIonicCoreLib.atIonicCoreLibStrings.statusTap | atIonicCoreLib.atIonicCoreLibStrings.backButtonIcon | atIonicCoreLib.atIonicCoreLibStrings.backButtonText | atIonicCoreLib.atIonicCoreLibStrings.menuIcon | atIonicCoreLib.atIonicCoreLibStrings.menuType | atIonicCoreLib.atIonicCoreLibStrings.spinner | atIonicCoreLib.atIonicCoreLibStrings.loadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.refreshingIcon | atIonicCoreLib.atIonicCoreLibStrings.refreshingSpinner | atIonicCoreLib.atIonicCoreLibStrings.infiniteLoadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.swipeBackEnabled | atIonicCoreLib.atIonicCoreLibStrings.tabButtonLayout | atIonicCoreLib.atIonicCoreLibStrings.navAnimation | atIonicCoreLib.atIonicCoreLibStrings.actionSheetEnter | atIonicCoreLib.atIonicCoreLibStrings.alertEnter | atIonicCoreLib.atIonicCoreLibStrings.loadingEnter | atIonicCoreLib.atIonicCoreLibStrings.modalEnter | atIonicCoreLib.atIonicCoreLibStrings.popoverEnter | atIonicCoreLib.atIonicCoreLibStrings.toastEnter | atIonicCoreLib.atIonicCoreLibStrings.pickerEnter | atIonicCoreLib.atIonicCoreLibStrings.actionSheetLeave | atIonicCoreLib.atIonicCoreLibStrings.alertLeave | atIonicCoreLib.atIonicCoreLibStrings.loadingLeave | atIonicCoreLib.atIonicCoreLibStrings.modalLeave | atIonicCoreLib.atIonicCoreLibStrings.popoverLeave | atIonicCoreLib.atIonicCoreLibStrings.toastLeave | atIonicCoreLib.atIonicCoreLibStrings.pickerLeave | atIonicCoreLib.atIonicCoreLibStrings.keyboardHeight | atIonicCoreLib.atIonicCoreLibStrings.inputShims | atIonicCoreLib.atIonicCoreLibStrings.scrollPadding | atIonicCoreLib.atIonicCoreLibStrings.inputBlurring | atIonicCoreLib.atIonicCoreLibStrings.scrollAssist | atIonicCoreLib.atIonicCoreLibStrings.hideCaretOnScroll | atIonicCoreLib.atIonicCoreLibStrings.persistConfig | atIonicCoreLib.atIonicCoreLibStrings._forceStatusbarPadding | atIonicCoreLib.atIonicCoreLibStrings._testing,
    iosLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdLeaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    opts: js.Any
  ): js.Promise[scala.Boolean] = js.native
  def dismissOverlay(doc: stdLib.Document, data: js.Any, role: js.UndefOr[scala.Nothing], overlayTag: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismissOverlay(
    doc: stdLib.Document,
    data: js.Any,
    role: js.UndefOr[scala.Nothing],
    overlayTag: java.lang.String,
    id: java.lang.String
  ): js.Promise[scala.Boolean] = js.native
  def dismissOverlay(doc: stdLib.Document, data: js.Any, role: java.lang.String, overlayTag: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismissOverlay(
    doc: stdLib.Document,
    data: js.Any,
    role: java.lang.String,
    overlayTag: java.lang.String,
    id: java.lang.String
  ): js.Promise[scala.Boolean] = js.native
  def eventMethod[T](element: stdLib.HTMLElement, eventName: java.lang.String): js.Promise[T] = js.native
  def getOverlay(doc: stdLib.Document): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any
  ] = js.native
  def getOverlay(doc: stdLib.Document, overlayTag: js.UndefOr[scala.Nothing], id: java.lang.String): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any
  ] = js.native
  def getOverlay(doc: stdLib.Document, overlayTag: java.lang.String): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any
  ] = js.native
  def getOverlay(doc: stdLib.Document, overlayTag: java.lang.String, id: java.lang.String): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ js.Any
  ] = js.native
  def getOverlays(doc: stdLib.Document): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ _
  ] = js.native
  def getOverlays(doc: stdLib.Document, overlayTag: java.lang.String): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLIonOverlayElement */ _
  ] = js.native
  def isCancel(): scala.Boolean = js.native
  def isCancel(role: java.lang.String): scala.Boolean = js.native
  def onceEvent(
    element: stdLib.HTMLElement,
    eventName: java.lang.String,
    callback: js.Function1[/* ev */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  def present(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    name: atIonicCoreLib.atIonicCoreLibStrings.mode | atIonicCoreLib.atIonicCoreLibStrings.animated | atIonicCoreLib.atIonicCoreLibStrings.rippleEffect | atIonicCoreLib.atIonicCoreLibStrings.hardwareBackButton | atIonicCoreLib.atIonicCoreLibStrings.statusTap | atIonicCoreLib.atIonicCoreLibStrings.backButtonIcon | atIonicCoreLib.atIonicCoreLibStrings.backButtonText | atIonicCoreLib.atIonicCoreLibStrings.menuIcon | atIonicCoreLib.atIonicCoreLibStrings.menuType | atIonicCoreLib.atIonicCoreLibStrings.spinner | atIonicCoreLib.atIonicCoreLibStrings.loadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.refreshingIcon | atIonicCoreLib.atIonicCoreLibStrings.refreshingSpinner | atIonicCoreLib.atIonicCoreLibStrings.infiniteLoadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.swipeBackEnabled | atIonicCoreLib.atIonicCoreLibStrings.tabButtonLayout | atIonicCoreLib.atIonicCoreLibStrings.navAnimation | atIonicCoreLib.atIonicCoreLibStrings.actionSheetEnter | atIonicCoreLib.atIonicCoreLibStrings.alertEnter | atIonicCoreLib.atIonicCoreLibStrings.loadingEnter | atIonicCoreLib.atIonicCoreLibStrings.modalEnter | atIonicCoreLib.atIonicCoreLibStrings.popoverEnter | atIonicCoreLib.atIonicCoreLibStrings.toastEnter | atIonicCoreLib.atIonicCoreLibStrings.pickerEnter | atIonicCoreLib.atIonicCoreLibStrings.actionSheetLeave | atIonicCoreLib.atIonicCoreLibStrings.alertLeave | atIonicCoreLib.atIonicCoreLibStrings.loadingLeave | atIonicCoreLib.atIonicCoreLibStrings.modalLeave | atIonicCoreLib.atIonicCoreLibStrings.popoverLeave | atIonicCoreLib.atIonicCoreLibStrings.toastLeave | atIonicCoreLib.atIonicCoreLibStrings.pickerLeave | atIonicCoreLib.atIonicCoreLibStrings.keyboardHeight | atIonicCoreLib.atIonicCoreLibStrings.inputShims | atIonicCoreLib.atIonicCoreLibStrings.scrollPadding | atIonicCoreLib.atIonicCoreLibStrings.inputBlurring | atIonicCoreLib.atIonicCoreLibStrings.scrollAssist | atIonicCoreLib.atIonicCoreLibStrings.hideCaretOnScroll | atIonicCoreLib.atIonicCoreLibStrings.persistConfig | atIonicCoreLib.atIonicCoreLibStrings._forceStatusbarPadding | atIonicCoreLib.atIonicCoreLibStrings._testing,
    iosEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): js.Promise[scala.Unit] = js.native
  def present(
    overlay: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayInterface */ js.Any,
    name: atIonicCoreLib.atIonicCoreLibStrings.mode | atIonicCoreLib.atIonicCoreLibStrings.animated | atIonicCoreLib.atIonicCoreLibStrings.rippleEffect | atIonicCoreLib.atIonicCoreLibStrings.hardwareBackButton | atIonicCoreLib.atIonicCoreLibStrings.statusTap | atIonicCoreLib.atIonicCoreLibStrings.backButtonIcon | atIonicCoreLib.atIonicCoreLibStrings.backButtonText | atIonicCoreLib.atIonicCoreLibStrings.menuIcon | atIonicCoreLib.atIonicCoreLibStrings.menuType | atIonicCoreLib.atIonicCoreLibStrings.spinner | atIonicCoreLib.atIonicCoreLibStrings.loadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.refreshingIcon | atIonicCoreLib.atIonicCoreLibStrings.refreshingSpinner | atIonicCoreLib.atIonicCoreLibStrings.infiniteLoadingSpinner | atIonicCoreLib.atIonicCoreLibStrings.swipeBackEnabled | atIonicCoreLib.atIonicCoreLibStrings.tabButtonLayout | atIonicCoreLib.atIonicCoreLibStrings.navAnimation | atIonicCoreLib.atIonicCoreLibStrings.actionSheetEnter | atIonicCoreLib.atIonicCoreLibStrings.alertEnter | atIonicCoreLib.atIonicCoreLibStrings.loadingEnter | atIonicCoreLib.atIonicCoreLibStrings.modalEnter | atIonicCoreLib.atIonicCoreLibStrings.popoverEnter | atIonicCoreLib.atIonicCoreLibStrings.toastEnter | atIonicCoreLib.atIonicCoreLibStrings.pickerEnter | atIonicCoreLib.atIonicCoreLibStrings.actionSheetLeave | atIonicCoreLib.atIonicCoreLibStrings.alertLeave | atIonicCoreLib.atIonicCoreLibStrings.loadingLeave | atIonicCoreLib.atIonicCoreLibStrings.modalLeave | atIonicCoreLib.atIonicCoreLibStrings.popoverLeave | atIonicCoreLib.atIonicCoreLibStrings.toastLeave | atIonicCoreLib.atIonicCoreLibStrings.pickerLeave | atIonicCoreLib.atIonicCoreLibStrings.keyboardHeight | atIonicCoreLib.atIonicCoreLibStrings.inputShims | atIonicCoreLib.atIonicCoreLibStrings.scrollPadding | atIonicCoreLib.atIonicCoreLibStrings.inputBlurring | atIonicCoreLib.atIonicCoreLibStrings.scrollAssist | atIonicCoreLib.atIonicCoreLibStrings.hideCaretOnScroll | atIonicCoreLib.atIonicCoreLibStrings.persistConfig | atIonicCoreLib.atIonicCoreLibStrings._forceStatusbarPadding | atIonicCoreLib.atIonicCoreLibStrings._testing,
    iosEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    mdEnterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any,
    opts: js.Any
  ): js.Promise[scala.Unit] = js.native
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

