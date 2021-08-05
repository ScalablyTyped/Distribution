package typings.ionicCore

import typings.ionicCore.menuInterfaceMod.MenuChangeEventDetail
import typings.ionicCore.menuInterfaceMod.MenuI
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("@ionic/core/dist/types/components/menu/menu", "Menu")
  @js.native
  class Menu ()
    extends StObject
       with ComponentInterface
       with MenuI {
    
    /* private */ var _isActive: js.Any = js.native
    
    /* private */ var afterAnimation: js.Any = js.native
    
    /* private */ var animation: js.Any = js.native
    
    /* private */ var beforeAnimation: js.Any = js.native
    
    /* private */ var blocker: js.Any = js.native
    
    /* private */ var canStart: js.Any = js.native
    
    /* private */ var canSwipe: js.Any = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MMenu(): js.Promise[Unit] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MMenu(): js.Promise[Unit] = js.native
    
    /**
      * The content's id the menu should use.
      */
    var contentId: js.UndefOr[String] = js.native
    
    /* protected */ def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MMenu(): Unit = js.native
    
    /* private */ var forceClosing: js.Any = js.native
    
    /* private */ var gesture: js.Any = js.native
    
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
    /* protected */ var ionMenuChange: EventEmitter[MenuChangeEventDetail] = js.native
    
    /**
      * Emitted when the menu is about to be closed.
      */
    var ionWillClose: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the menu is about to be opened.
      */
    var ionWillOpen: EventEmitter[Unit] = js.native
    
    /**
      * Returns `true` is the menu is open.
      */
    def isOpen(): js.Promise[Boolean] = js.native
    
    var isPaneVisible: Boolean = js.native
    
    /* private */ var lastOnEnd: js.Any = js.native
    
    /* private */ var loadAnimation: js.Any = js.native
    
    /**
      * The edge threshold for dragging the menu open.
      * If a drag/swipe happens over this value, the menu is not triggered.
      */
    var maxEdgeStart: Double = js.native
    
    def onBackdropClick(ev: js.Any): Unit = js.native
    
    /* private */ var onEnd: js.Any = js.native
    
    /* private */ var onMove: js.Any = js.native
    
    def onSplitPaneChanged(ev: CustomEvent[js.Any]): Unit = js.native
    
    /* private */ var onStart: js.Any = js.native
    
    /* private */ var onWillStart: js.Any = js.native
    
    @JSName("render")
    def render_MMenu(): js.Any = js.native
    
    /* protected */ def sideChanged(): Unit = js.native
    
    /* private */ var startAnimation: js.Any = js.native
    
    /**
      * If `true`, swiping the menu is enabled.
      */
    var swipeGesture: Boolean = js.native
    
    /* protected */ def swipeGestureChanged(): Unit = js.native
    
    /**
      * The display type of the menu.
      * Available options: `"overlay"`, `"reveal"`, `"push"`.
      */
    var `type`: js.UndefOr[String] = js.native
    
    def typeChanged(`type`: String): Unit = js.native
    def typeChanged(`type`: String, oldType: String): Unit = js.native
    
    /* private */ var updateState: js.Any = js.native
  }
}
