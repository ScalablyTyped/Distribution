package typings.materialTopAppBar

import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.componentMod.MDCRippleFactory
import typings.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation
import typings.std.Element
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/top-app-bar/component", "MDCTopAppBar")
  @js.native
  class MDCTopAppBar protected () extends MDCComponent[MDCTopAppBarBaseFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCTopAppBarBaseFoundation, args: js.Any*) = this()
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    
    def setScrollTarget(target: EventTarget): Unit = js.native
  }
  /* static members */
  object MDCTopAppBar {
    
    @JSImport("@material/top-app-bar/component", "MDCTopAppBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): MDCTopAppBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTopAppBar]
  }
}
