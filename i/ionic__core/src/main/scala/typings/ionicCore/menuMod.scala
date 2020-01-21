package typings.ionicCore

import typings.ionicCore.menuInterfaceMod.MenuChangeEventDetail
import typings.ionicCore.menuInterfaceMod.MenuI
import typings.ionicCore.stencilCoreMod.ComponentInterface
import typings.ionicCore.stencilCoreMod.EventEmitter
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/menu/menu", JSImport.Namespace)
@js.native
object menuMod extends js.Object {
  @js.native
  class Menu ()
    extends ComponentInterface
       with MenuI {
    var _isActive: js.Any = js.native
    var afterAnimation: js.Any = js.native
    var animation: js.UndefOr[js.Any] = js.native
    var beforeAnimation: js.Any = js.native
    var blocker: js.Any = js.native
    var canStart: js.Any = js.native
    var canSwipe: js.Any = js.native
    /**
      * The content's id the menu should use.
      */
    var contentId: js.UndefOr[String] = js.native
    var forceClosing: js.Any = js.native
    var gesture: js.UndefOr[js.Any] = js.native
    /**
      * Emitted when the menu is closed.
      */
    var ionDidClose: EventEmitter[Unit] = js.native
    /**
      * Emitted when the menu is open.
      */
    var ionDidOpen: EventEmitter[Unit] = js.native
    /**
      * Emitted when the menu state is changed.
      * @internal
      */
    var ionMenuChange: EventEmitter[MenuChangeEventDetail] = js.native
    /**
      * Emitted when the menu is about to be closed.
      */
    var ionWillClose: EventEmitter[Unit] = js.native
    /**
      * Emitted when the menu is about to be opened.
      */
    var ionWillOpen: EventEmitter[Unit] = js.native
    var isPaneVisible: Boolean = js.native
    var lastOnEnd: js.Any = js.native
    var loadAnimation: js.Any = js.native
    /**
      * The edge threshold for dragging the menu open.
      * If a drag/swipe happens over this value, the menu is not triggered.
      */
    var maxEdgeStart: Double = js.native
    var mode: js.Any = js.native
    var onEnd: js.Any = js.native
    var onMove: js.Any = js.native
    var onStart: js.Any = js.native
    var onWillStart: js.Any = js.native
    var startAnimation: js.Any = js.native
    /**
      * If `true`, swiping the menu is enabled.
      */
    var swipeGesture: Boolean = js.native
    /**
      * The display type of the menu.
      * Available options: `"overlay"`, `"reveal"`, `"push"`.
      */
    var `type`: js.UndefOr[String] = js.native
    var updateState: js.Any = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MMenu(): js.Promise[Unit] = js.native
    @JSName("connectedCallback")
    def connectedCallback_MMenu(): js.Promise[Unit] = js.native
    /* protected */ def disabledChanged(): Unit = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MMenu(): Unit = js.native
    /**
      * Returns `true` is the menu is open.
      */
    def isOpen(): js.Promise[Boolean] = js.native
    def onBackdropClick(ev: js.Any): Unit = js.native
    def onSplitPaneChanged(ev: CustomEvent[_]): Unit = js.native
    @JSName("render")
    def render_MMenu(): js.Any = js.native
    /* protected */ def sideChanged(): Unit = js.native
    /* protected */ def swipeGestureChanged(): Unit = js.native
    def typeChanged(`type`: String): Unit = js.native
    def typeChanged(`type`: String, oldType: String): Unit = js.native
  }
  
}

