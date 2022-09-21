package typings.materialDrawer

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation
import typings.materialDrawer.utilMod.MDCDrawerFocusTrapFactory
import typings.materialList.componentMod.MDCList
import typings.materialList.componentMod.MDCListFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/drawer/component", "MDCDrawer")
  @js.native
  open class MDCDrawer protected () extends MDCComponent[MDCDismissibleDrawerFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCDismissibleDrawerFoundation, args: Any*) = this()
    
    /* private */ var focusTrap: Any = js.native
    
    /* private */ var focusTrapFactory: Any = js.native
    
    /* private */ var handleKeydown: Any = js.native
    
    /* private */ var handleScrimClick: Any = js.native
    
    /* private */ var handleTransitionEnd: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(focusTrapFactory: Unit, listFactory: MDCListFactory): Unit = js.native
    def initialize(focusTrapFactory: MDCDrawerFocusTrapFactory): Unit = js.native
    def initialize(focusTrapFactory: MDCDrawerFocusTrapFactory, listFactory: MDCListFactory): Unit = js.native
    
    /* private */ var innerList: Any = js.native
    
    def list: js.UndefOr[MDCList] = js.native
    
    /**
      * @return boolean Proxies to the foundation's `open`/`close` methods.
      * Also returns true if drawer is in the open position.
      */
    def open: Boolean = js.native
    /**
      * Toggles the drawer open and closed.
      */
    def open_=(isOpen: Boolean): Unit = js.native
    
    /* private */ var previousFocus: Any = js.native
    
    /* private */ var scrim: Any = js.native
  }
  /* static members */
  object MDCDrawer {
    
    @JSImport("@material/drawer/component", "MDCDrawer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCDrawer = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCDrawer]
  }
}
