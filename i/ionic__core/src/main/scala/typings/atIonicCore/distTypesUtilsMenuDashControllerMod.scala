package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonMenuElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/menu-controller", JSImport.Namespace)
@js.native
object distTypesUtilsMenuDashControllerMod extends js.Object {
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
  
}

