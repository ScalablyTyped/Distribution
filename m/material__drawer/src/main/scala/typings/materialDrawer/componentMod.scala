package typings.materialDrawer

import typings.materialBase.componentMod.MDCComponent
import typings.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation
import typings.materialDrawer.utilMod.MDCDrawerFocusTrapFactory
import typings.materialList.componentMod.MDCList
import typings.materialList.componentMod.MDCListFactory
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/drawer/component", "MDCDrawer")
  @js.native
  class MDCDrawer protected () extends MDCComponent[MDCDismissibleDrawerFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCDismissibleDrawerFoundation, args: js.Any*) = this()
    
    def initialize(): Unit = js.native
    def initialize(focusTrapFactory: Unit, listFactory: MDCListFactory): Unit = js.native
    def initialize(focusTrapFactory: MDCDrawerFocusTrapFactory): Unit = js.native
    def initialize(focusTrapFactory: MDCDrawerFocusTrapFactory, listFactory: MDCListFactory): Unit = js.native
    
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
  }
  /* static members */
  object MDCDrawer {
    
    @JSImport("@material/drawer/component", "MDCDrawer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): MDCDrawer = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCDrawer]
  }
}
