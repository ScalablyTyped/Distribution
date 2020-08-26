package typings.materialTab

import typings.materialTab.adapterMod.MDCTabAdapter
import typings.materialTab.anon.ACTIVE
import typings.materialTab.anon.ARIASELECTED
import typings.materialTab.anon.PartialMDCTabAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCTab ()
    extends typings.materialTab.componentMod.MDCTab
  
  @js.native
  class MDCTabFoundation ()
    extends typings.materialTab.foundationMod.MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): typings.materialTab.componentMod.MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    def cssClasses: ACTIVE = js.native
    def defaultAdapter: MDCTabAdapter = js.native
    def strings: ARIASELECTED = js.native
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
    var ACTIVE: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var ARIA_SELECTED: String = js.native
    var CONTENT_SELECTOR: String = js.native
    var INTERACTED_EVENT: String = js.native
    var RIPPLE_SELECTOR: String = js.native
    var TABINDEX: String = js.native
    var TAB_INDICATOR_SELECTOR: String = js.native
  }
  
}

