package typings.materialTopAppBar

import typings.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/top-app-bar", "MDCFixedTopAppBarFoundation")
  @js.native
  class MDCFixedTopAppBarFoundation ()
    extends typings.materialTopAppBar.foundationMod.MDCFixedTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @JSImport("@material/top-app-bar", "MDCShortTopAppBarFoundation")
  @js.native
  class MDCShortTopAppBarFoundation ()
    extends typings.materialTopAppBar.shortFoundationMod.MDCShortTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @JSImport("@material/top-app-bar", "MDCTopAppBar")
  @js.native
  class MDCTopAppBar protected ()
    extends typings.materialTopAppBar.componentMod.MDCTopAppBar {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTopAppBar {
    
    @JSImport("@material/top-app-bar", "MDCTopAppBar")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): typings.materialTopAppBar.componentMod.MDCTopAppBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTopAppBar.componentMod.MDCTopAppBar]
  }
  
  @JSImport("@material/top-app-bar", "MDCTopAppBarBaseFoundation")
  @js.native
  class MDCTopAppBarBaseFoundation ()
    extends typings.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @JSImport("@material/top-app-bar", "MDCTopAppBarFoundation")
  @js.native
  class MDCTopAppBarFoundation ()
    extends typings.materialTopAppBar.standardFoundationMod.MDCTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
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
  object cssClasses {
    
    @JSImport("@material/top-app-bar", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/top-app-bar", "cssClasses.FIXED_CLASS")
    @js.native
    def FIXED_CLASS: String = js.native
    @scala.inline
    def FIXED_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/top-app-bar", "cssClasses.FIXED_SCROLLED_CLASS")
    @js.native
    def FIXED_SCROLLED_CLASS: String = js.native
    @scala.inline
    def FIXED_SCROLLED_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED_SCROLLED_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/top-app-bar", "cssClasses.SHORT_CLASS")
    @js.native
    def SHORT_CLASS: String = js.native
    @scala.inline
    def SHORT_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/top-app-bar", "cssClasses.SHORT_COLLAPSED_CLASS")
    @js.native
    def SHORT_COLLAPSED_CLASS: String = js.native
    @scala.inline
    def SHORT_COLLAPSED_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT_COLLAPSED_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/top-app-bar", "cssClasses.SHORT_HAS_ACTION_ITEM_CLASS")
    @js.native
    def SHORT_HAS_ACTION_ITEM_CLASS: String = js.native
    @scala.inline
    def SHORT_HAS_ACTION_ITEM_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT_HAS_ACTION_ITEM_CLASS")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/top-app-bar", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/top-app-bar", "numbers.DEBOUNCE_THROTTLE_RESIZE_TIME_MS")
    @js.native
    def DEBOUNCE_THROTTLE_RESIZE_TIME_MS: Double = js.native
    @scala.inline
    def DEBOUNCE_THROTTLE_RESIZE_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBOUNCE_THROTTLE_RESIZE_TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/top-app-bar", "numbers.MAX_TOP_APP_BAR_HEIGHT")
    @js.native
    def MAX_TOP_APP_BAR_HEIGHT: Double = js.native
    @scala.inline
    def MAX_TOP_APP_BAR_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_TOP_APP_BAR_HEIGHT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/top-app-bar", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/top-app-bar", "strings.ACTION_ITEM_SELECTOR")
    @js.native
    def ACTION_ITEM_SELECTOR: String = js.native
    @scala.inline
    def ACTION_ITEM_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_ITEM_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/top-app-bar", "strings.NAVIGATION_EVENT")
    @js.native
    def NAVIGATION_EVENT: String = js.native
    @scala.inline
    def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/top-app-bar", "strings.NAVIGATION_ICON_SELECTOR")
    @js.native
    def NAVIGATION_ICON_SELECTOR: String = js.native
    @scala.inline
    def NAVIGATION_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_ICON_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/top-app-bar", "strings.ROOT_SELECTOR")
    @js.native
    def ROOT_SELECTOR: String = js.native
    @scala.inline
    def ROOT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/top-app-bar", "strings.TITLE_SELECTOR")
    @js.native
    def TITLE_SELECTOR: String = js.native
    @scala.inline
    def TITLE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TITLE_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
