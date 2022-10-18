package typings.materialDrawer

import typings.materialBase.Element
import typings.materialDom.focusTrapMod.FocusTrap
import typings.materialDrawer.anon.PartialMDCDrawerAdapter
import typings.materialDrawer.utilMod.MDCDrawerFocusTrapFactory
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/drawer", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialDrawer.modalFoundationMod.default {
    def this(adapter: PartialMDCDrawerAdapter) = this()
  }
  
  @JSImport("@material/drawer", "MDCDismissibleDrawerFoundation")
  @js.native
  open class MDCDismissibleDrawerFoundation ()
    extends typings.materialDrawer.dismissibleFoundationMod.MDCDismissibleDrawerFoundation {
    def this(adapter: PartialMDCDrawerAdapter) = this()
  }
  
  @JSImport("@material/drawer", "MDCDrawer")
  @js.native
  open class MDCDrawer protected ()
    extends typings.materialDrawer.componentMod.MDCDrawer {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialDrawer.dismissibleFoundationMod.MDCDismissibleDrawerFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCDrawer {
    
    @JSImport("@material/drawer", "MDCDrawer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialDrawer.componentMod.MDCDrawer = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialDrawer.componentMod.MDCDrawer]
  }
  
  @JSImport("@material/drawer", "MDCModalDrawerFoundation")
  @js.native
  open class MDCModalDrawerFoundation ()
    extends typings.materialDrawer.modalFoundationMod.MDCModalDrawerFoundation {
    def this(adapter: PartialMDCDrawerAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/drawer", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/drawer", "cssClasses.ANIMATE")
    @js.native
    def ANIMATE: String = js.native
    inline def ANIMATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "cssClasses.CLOSING")
    @js.native
    def CLOSING: String = js.native
    inline def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "cssClasses.DISMISSIBLE")
    @js.native
    def DISMISSIBLE: String = js.native
    inline def DISMISSIBLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISMISSIBLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "cssClasses.MODAL")
    @js.native
    def MODAL: String = js.native
    inline def MODAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    
    @JSImport("@material/drawer", "cssClasses.OPENING")
    @js.native
    def OPENING: String = js.native
    inline def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
    
    inline def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/drawer", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/drawer", "strings.APP_CONTENT_SELECTOR")
    @js.native
    def APP_CONTENT_SELECTOR: String = js.native
    inline def APP_CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "strings.CLOSE_EVENT")
    @js.native
    def CLOSE_EVENT: String = js.native
    inline def CLOSE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "strings.LIST_ITEM_ACTIVATED_SELECTOR")
    @js.native
    def LIST_ITEM_ACTIVATED_SELECTOR: String = js.native
    inline def LIST_ITEM_ACTIVATED_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_ITEM_ACTIVATED_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "strings.LIST_SELECTOR")
    @js.native
    def LIST_SELECTOR: String = js.native
    inline def LIST_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "strings.OPEN_EVENT")
    @js.native
    def OPEN_EVENT: String = js.native
    inline def OPEN_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "strings.SCRIM_SELECTOR")
    @js.native
    def SCRIM_SELECTOR: String = js.native
    inline def SCRIM_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIM_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("@material/drawer", "util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDrawerFocusTrapFactory): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrapInstance")(surfaceEl.asInstanceOf[js.Any], focusTrapFactory.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  }
}
