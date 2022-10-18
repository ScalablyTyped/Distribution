package typings.materialTopAppBar

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.componentMod.MDCRippleFactory
import typings.materialTopAppBar.foundationMod.MDCTopAppBarBaseFoundation
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/top-app-bar/component", "MDCTopAppBar")
  @js.native
  open class MDCTopAppBar protected () extends MDCComponent[MDCTopAppBarBaseFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTopAppBarBaseFoundation, args: Any*) = this()
    
    /* private */ var handleNavigationClick: Any = js.native
    
    /* private */ var handleTargetScroll: Any = js.native
    
    /* private */ var handleWindowResize: Any = js.native
    
    /* private */ var iconRipples: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    
    /* private */ var navIcon: Any = js.native
    
    /* private */ var scrollTarget: Any = js.native
    
    def setScrollTarget(target: EventTarget): Unit = js.native
  }
  /* static members */
  object MDCTopAppBar {
    
    @JSImport("@material/top-app-bar/component", "MDCTopAppBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCTopAppBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTopAppBar]
  }
}
