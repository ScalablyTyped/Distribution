package typings.materialTabBar

import typings.materialBase.Element
import typings.materialTabBar.anon.PartialMDCTabBarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/tab-bar", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialTabBar.foundationMod.default {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  
  @JSImport("@material/tab-bar", "MDCTabBar")
  @js.native
  open class MDCTabBar protected ()
    extends typings.materialTabBar.componentMod.MDCTabBar {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialTabBar.foundationMod.MDCTabBarFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tab-bar", "MDCTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTabBar.componentMod.MDCTabBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTabBar.componentMod.MDCTabBar]
  }
  
  @JSImport("@material/tab-bar", "MDCTabBarFoundation")
  @js.native
  open class MDCTabBarFoundation ()
    extends typings.materialTabBar.foundationMod.MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  
  object numbers {
    
    @JSImport("@material/tab-bar", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab-bar", "numbers.ARROW_LEFT_KEYCODE")
    @js.native
    def ARROW_LEFT_KEYCODE: Double = js.native
    inline def ARROW_LEFT_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.ARROW_RIGHT_KEYCODE")
    @js.native
    def ARROW_RIGHT_KEYCODE: Double = js.native
    inline def ARROW_RIGHT_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.END_KEYCODE")
    @js.native
    def END_KEYCODE: Double = js.native
    inline def END_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.ENTER_KEYCODE")
    @js.native
    def ENTER_KEYCODE: Double = js.native
    inline def ENTER_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.EXTRA_SCROLL_AMOUNT")
    @js.native
    def EXTRA_SCROLL_AMOUNT: Double = js.native
    inline def EXTRA_SCROLL_AMOUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTRA_SCROLL_AMOUNT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.HOME_KEYCODE")
    @js.native
    def HOME_KEYCODE: Double = js.native
    inline def HOME_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.SPACE_KEYCODE")
    @js.native
    def SPACE_KEYCODE: Double = js.native
    inline def SPACE_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_KEYCODE")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/tab-bar", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab-bar", "strings.ARROW_LEFT_KEY")
    @js.native
    def ARROW_LEFT_KEY: String = js.native
    inline def ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.ARROW_RIGHT_KEY")
    @js.native
    def ARROW_RIGHT_KEY: String = js.native
    inline def ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.END_KEY")
    @js.native
    def END_KEY: String = js.native
    inline def END_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.ENTER_KEY")
    @js.native
    def ENTER_KEY: String = js.native
    inline def ENTER_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.HOME_KEY")
    @js.native
    def HOME_KEY: String = js.native
    inline def HOME_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.SPACE_KEY")
    @js.native
    def SPACE_KEY: String = js.native
    inline def SPACE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.TAB_ACTIVATED_EVENT")
    @js.native
    def TAB_ACTIVATED_EVENT: String = js.native
    inline def TAB_ACTIVATED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_ACTIVATED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.TAB_SCROLLER_SELECTOR")
    @js.native
    def TAB_SCROLLER_SELECTOR: String = js.native
    inline def TAB_SCROLLER_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SCROLLER_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    inline def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
