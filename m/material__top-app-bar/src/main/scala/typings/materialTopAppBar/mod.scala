package typings.materialTopAppBar

import typings.materialTopAppBar.adapterMod.MDCTopAppBarAdapter
import typings.materialTopAppBar.anon.ACTIONITEMSELECTOR
import typings.materialTopAppBar.anon.DEBOUNCETHROTTLERESIZETIMEMS
import typings.materialTopAppBar.anon.FIXEDCLASS
import typings.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/top-app-bar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCFixedTopAppBarFoundation ()
    extends typings.materialTopAppBar.foundationMod.MDCFixedTopAppBarFoundation
  
  @js.native
  class MDCShortTopAppBarFoundation ()
    extends typings.materialTopAppBar.shortFoundationMod.MDCShortTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @js.native
  class MDCTopAppBar ()
    extends typings.materialTopAppBar.componentMod.MDCTopAppBar
  /* static members */
  @js.native
  object MDCTopAppBar extends js.Object {
    
    def attachTo(root: Element): typings.materialTopAppBar.componentMod.MDCTopAppBar = js.native
  }
  
  @js.native
  class MDCTopAppBarBaseFoundation ()
    extends typings.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  /* static members */
  @js.native
  object MDCTopAppBarBaseFoundation extends js.Object {
    
    def cssClasses: FIXEDCLASS = js.native
    
    /**
      * See {@link MDCTopAppBarAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTopAppBarAdapter = js.native
    
    def numbers: DEBOUNCETHROTTLERESIZETIMEMS = js.native
    
    def strings: ACTIONITEMSELECTOR = js.native
  }
  
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
  @js.native
  object cssClasses extends js.Object {
    
    var FIXED_CLASS: String = js.native
    
    var FIXED_SCROLLED_CLASS: String = js.native
    
    var SHORT_CLASS: String = js.native
    
    var SHORT_COLLAPSED_CLASS: String = js.native
    
    var SHORT_HAS_ACTION_ITEM_CLASS: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var DEBOUNCE_THROTTLE_RESIZE_TIME_MS: Double = js.native
    
    var MAX_TOP_APP_BAR_HEIGHT: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ACTION_ITEM_SELECTOR: String = js.native
    
    var NAVIGATION_EVENT: String = js.native
    
    var NAVIGATION_ICON_SELECTOR: String = js.native
    
    var ROOT_SELECTOR: String = js.native
    
    var TITLE_SELECTOR: String = js.native
  }
}
