package typings.materialTabIndicator

import typings.materialBase.Element
import typings.materialTabIndicator.anon.PartialMDCTabIndicatorAda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/tab-indicator", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialTabIndicator.slidingFoundationMod.default {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("@material/tab-indicator", "MDCFadingTabIndicatorFoundation")
  @js.native
  open class MDCFadingTabIndicatorFoundation ()
    extends typings.materialTabIndicator.fadingFoundationMod.MDCFadingTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("@material/tab-indicator", "MDCSlidingTabIndicatorFoundation")
  @js.native
  open class MDCSlidingTabIndicatorFoundation ()
    extends typings.materialTabIndicator.slidingFoundationMod.MDCSlidingTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("@material/tab-indicator", "MDCTabIndicator")
  @js.native
  open class MDCTabIndicator protected ()
    extends typings.materialTabIndicator.componentMod.MDCTabIndicator {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTabIndicator {
    
    @JSImport("@material/tab-indicator", "MDCTabIndicator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTabIndicator.componentMod.MDCTabIndicator = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTabIndicator.componentMod.MDCTabIndicator]
  }
  
  /* note: abstract class */ @JSImport("@material/tab-indicator", "MDCTabIndicatorFoundation")
  @js.native
  open class MDCTabIndicatorFoundation ()
    extends typings.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/tab-indicator", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab-indicator", "cssClasses.ACTIVE")
    @js.native
    def ACTIVE: String = js.native
    inline def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-indicator", "cssClasses.FADE")
    @js.native
    def FADE: String = js.native
    inline def FADE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FADE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-indicator", "cssClasses.NO_TRANSITION")
    @js.native
    def NO_TRANSITION: String = js.native
    inline def NO_TRANSITION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_TRANSITION")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/tab-indicator", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab-indicator", "strings.CONTENT_SELECTOR")
    @js.native
    def CONTENT_SELECTOR: String = js.native
    inline def CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
