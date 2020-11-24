package typings.materialComponentsWeb.mod

import typings.materialNotchedOutline.adapterMod.MDCNotchedOutlineAdapter
import typings.materialNotchedOutline.anon.NOLABEL
import typings.materialNotchedOutline.anon.NOTCHELEMENTPADDING
import typings.materialNotchedOutline.anon.NOTCHELEMENTSELECTOR
import typings.materialNotchedOutline.anon.PartialMDCNotchedOutlineA
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "notchedOutline")
@js.native
object notchedOutline extends js.Object {
  
  @js.native
  class MDCNotchedOutline ()
    extends typings.materialNotchedOutline.mod.MDCNotchedOutline
  /* static members */
  @js.native
  object MDCNotchedOutline extends js.Object {
    
    def attachTo(root: Element): typings.materialNotchedOutline.componentMod.MDCNotchedOutline = js.native
  }
  
  @js.native
  class MDCNotchedOutlineFoundation ()
    extends typings.materialNotchedOutline.mod.MDCNotchedOutlineFoundation {
    def this(adapter: PartialMDCNotchedOutlineA) = this()
  }
  /* static members */
  @js.native
  object MDCNotchedOutlineFoundation extends js.Object {
    
    def cssClasses: NOLABEL = js.native
    
    /**
      * See {@link MDCNotchedOutlineAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCNotchedOutlineAdapter = js.native
    
    def numbers: NOTCHELEMENTPADDING = js.native
    
    def strings: NOTCHELEMENTSELECTOR = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var NO_LABEL: String = js.native
    
    var OUTLINE_NOTCHED: String = js.native
    
    var OUTLINE_UPGRADED: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var NOTCH_ELEMENT_PADDING: Double = js.native
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
    
    var NOTCH_ELEMENT_SELECTOR: String = js.native
  }
}
