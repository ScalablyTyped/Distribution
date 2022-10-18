package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialTabBar.anon.PartialMDCTabBarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBar {
  
  @JSImport("material-components-web", "tabBar.default")
  @js.native
  open class default ()
    extends typings.materialTabBar.mod.default {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  
  @JSImport("material-components-web", "tabBar.MDCTabBar")
  @js.native
  open class MDCTabBar protected ()
    extends typings.materialTabBar.mod.MDCTabBar {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialTabBar.foundationMod.MDCTabBarFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("material-components-web", "tabBar.MDCTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTabBar.componentMod.MDCTabBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTabBar.componentMod.MDCTabBar]
  }
  
  @JSImport("material-components-web", "tabBar.MDCTabBarFoundation")
  @js.native
  open class MDCTabBarFoundation ()
    extends typings.materialTabBar.mod.MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  
  object numbers {
    
    @JSImport("material-components-web", "tabBar.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "tabBar.numbers.ARROW_LEFT_KEYCODE")
    @js.native
    def ARROW_LEFT_KEYCODE: Double = js.native
    inline def ARROW_LEFT_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.numbers.ARROW_RIGHT_KEYCODE")
    @js.native
    def ARROW_RIGHT_KEYCODE: Double = js.native
    inline def ARROW_RIGHT_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.numbers.END_KEYCODE")
    @js.native
    def END_KEYCODE: Double = js.native
    inline def END_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.numbers.ENTER_KEYCODE")
    @js.native
    def ENTER_KEYCODE: Double = js.native
    inline def ENTER_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.numbers.EXTRA_SCROLL_AMOUNT")
    @js.native
    def EXTRA_SCROLL_AMOUNT: Double = js.native
    inline def EXTRA_SCROLL_AMOUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTRA_SCROLL_AMOUNT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.numbers.HOME_KEYCODE")
    @js.native
    def HOME_KEYCODE: Double = js.native
    inline def HOME_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.numbers.SPACE_KEYCODE")
    @js.native
    def SPACE_KEYCODE: Double = js.native
    inline def SPACE_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_KEYCODE")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "tabBar.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "tabBar.strings.ARROW_LEFT_KEY")
    @js.native
    def ARROW_LEFT_KEY: String = js.native
    inline def ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.strings.ARROW_RIGHT_KEY")
    @js.native
    def ARROW_RIGHT_KEY: String = js.native
    inline def ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.strings.END_KEY")
    @js.native
    def END_KEY: String = js.native
    inline def END_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.strings.ENTER_KEY")
    @js.native
    def ENTER_KEY: String = js.native
    inline def ENTER_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.strings.HOME_KEY")
    @js.native
    def HOME_KEY: String = js.native
    inline def HOME_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.strings.SPACE_KEY")
    @js.native
    def SPACE_KEY: String = js.native
    inline def SPACE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.strings.TAB_ACTIVATED_EVENT")
    @js.native
    def TAB_ACTIVATED_EVENT: String = js.native
    inline def TAB_ACTIVATED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_ACTIVATED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.strings.TAB_SCROLLER_SELECTOR")
    @js.native
    def TAB_SCROLLER_SELECTOR: String = js.native
    inline def TAB_SCROLLER_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SCROLLER_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabBar.strings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    inline def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
