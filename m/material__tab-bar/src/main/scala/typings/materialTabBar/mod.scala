package typings.materialTabBar

import typings.materialTabBar.anon.PartialMDCTabBarAdapter
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/tab-bar", "MDCTabBar")
  @js.native
  class MDCTabBar protected ()
    extends typings.materialTabBar.componentMod.MDCTabBar {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: typings.materialTabBar.foundationMod.MDCTabBarFoundation, args: js.Any*) = this()
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tab-bar", "MDCTabBar.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialTabBar.componentMod.MDCTabBar = js.native
  }
  
  @JSImport("@material/tab-bar", "MDCTabBarFoundation")
  @js.native
  class MDCTabBarFoundation ()
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
    @scala.inline
    def ARROW_LEFT_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.ARROW_RIGHT_KEYCODE")
    @js.native
    def ARROW_RIGHT_KEYCODE: Double = js.native
    @scala.inline
    def ARROW_RIGHT_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.END_KEYCODE")
    @js.native
    def END_KEYCODE: Double = js.native
    @scala.inline
    def END_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.ENTER_KEYCODE")
    @js.native
    def ENTER_KEYCODE: Double = js.native
    @scala.inline
    def ENTER_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.EXTRA_SCROLL_AMOUNT")
    @js.native
    def EXTRA_SCROLL_AMOUNT: Double = js.native
    @scala.inline
    def EXTRA_SCROLL_AMOUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTRA_SCROLL_AMOUNT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.HOME_KEYCODE")
    @js.native
    def HOME_KEYCODE: Double = js.native
    @scala.inline
    def HOME_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEYCODE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "numbers.SPACE_KEYCODE")
    @js.native
    def SPACE_KEYCODE: Double = js.native
    @scala.inline
    def SPACE_KEYCODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_KEYCODE")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @license
    * Copyright 2018 Google Inc.
    *
    * Permission is hereby granted, free of charge, to any person obtaining a copy
    * of this software and associated documentation files (the "Software"), to deal
    * in the Software without restriction, including without limitation the rights
    * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    * copies of the Software, and to permit persons to whom the Software is
    * furnished to do so, subject to the following conditions:
    *
    * The above copyright notice and this permission notice shall be included in
    * all copies or substantial portions of the Software.
    *
    * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    * THE SOFTWARE.
    */
  object strings {
    
    @JSImport("@material/tab-bar", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab-bar", "strings.ARROW_LEFT_KEY")
    @js.native
    def ARROW_LEFT_KEY: String = js.native
    @scala.inline
    def ARROW_LEFT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.ARROW_RIGHT_KEY")
    @js.native
    def ARROW_RIGHT_KEY: String = js.native
    @scala.inline
    def ARROW_RIGHT_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.END_KEY")
    @js.native
    def END_KEY: String = js.native
    @scala.inline
    def END_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.ENTER_KEY")
    @js.native
    def ENTER_KEY: String = js.native
    @scala.inline
    def ENTER_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.HOME_KEY")
    @js.native
    def HOME_KEY: String = js.native
    @scala.inline
    def HOME_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.SPACE_KEY")
    @js.native
    def SPACE_KEY: String = js.native
    @scala.inline
    def SPACE_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.TAB_ACTIVATED_EVENT")
    @js.native
    def TAB_ACTIVATED_EVENT: String = js.native
    @scala.inline
    def TAB_ACTIVATED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_ACTIVATED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.TAB_SCROLLER_SELECTOR")
    @js.native
    def TAB_SCROLLER_SELECTOR: String = js.native
    @scala.inline
    def TAB_SCROLLER_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SCROLLER_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-bar", "strings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    @scala.inline
    def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
