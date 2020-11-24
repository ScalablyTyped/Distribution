package typings.materialComponentsWeb.mod

import typings.materialTabBar.adapterMod.MDCTabBarAdapter
import typings.materialTabBar.anon.ARROWLEFTKEY
import typings.materialTabBar.anon.ARROWLEFTKEYCODE
import typings.materialTabBar.anon.PartialMDCTabBarAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "tabBar")
@js.native
object tabBar extends js.Object {
  
  @js.native
  class MDCTabBar ()
    extends typings.materialTabBar.mod.MDCTabBar
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    
    def attachTo(root: Element): typings.materialTabBar.componentMod.MDCTabBar = js.native
  }
  
  @js.native
  class MDCTabBarFoundation ()
    extends typings.materialTabBar.mod.MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    
    def defaultAdapter: MDCTabBarAdapter = js.native
    
    def numbers: ARROWLEFTKEYCODE = js.native
    
    def strings: ARROWLEFTKEY = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var ARROW_LEFT_KEYCODE: Double = js.native
    
    var ARROW_RIGHT_KEYCODE: Double = js.native
    
    var END_KEYCODE: Double = js.native
    
    var ENTER_KEYCODE: Double = js.native
    
    var EXTRA_SCROLL_AMOUNT: Double = js.native
    
    var HOME_KEYCODE: Double = js.native
    
    var SPACE_KEYCODE: Double = js.native
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
  @js.native
  object strings extends js.Object {
    
    var ARROW_LEFT_KEY: String = js.native
    
    var ARROW_RIGHT_KEY: String = js.native
    
    var END_KEY: String = js.native
    
    var ENTER_KEY: String = js.native
    
    var HOME_KEY: String = js.native
    
    var SPACE_KEY: String = js.native
    
    var TAB_ACTIVATED_EVENT: String = js.native
    
    var TAB_SCROLLER_SELECTOR: String = js.native
    
    var TAB_SELECTOR: String = js.native
  }
}
