package typings.materialSelect

import typings.materialSelect.anon.ARIAHIDDEN
import typings.materialSelect.anon.HELPERTEXTVALIDATIONMSG
import typings.materialSelect.anon.PartialMDCSelectHelperTex
import typings.materialSelect.helperTextAdapterMod.MDCSelectHelperTextAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/select/helper-text/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  
  @js.native
  class MDCSelectHelperText ()
    extends typings.materialSelect.helperTextComponentMod.MDCSelectHelperText
  /* static members */
  @js.native
  object MDCSelectHelperText extends js.Object {
    
    def attachTo(root: Element): typings.materialSelect.helperTextComponentMod.MDCSelectHelperText = js.native
  }
  
  @js.native
  class MDCSelectHelperTextFoundation ()
    extends typings.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation {
    def this(adapter: PartialMDCSelectHelperTex) = this()
  }
  /* static members */
  @js.native
  object MDCSelectHelperTextFoundation extends js.Object {
    
    def cssClasses: HELPERTEXTVALIDATIONMSG = js.native
    
    /**
      * See {@link MDCSelectHelperTextAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCSelectHelperTextAdapter = js.native
    
    def strings: ARIAHIDDEN = js.native
  }
  
  @js.native
  object helperTextCssClasses extends js.Object {
    
    var HELPER_TEXT_VALIDATION_MSG: String = js.native
    
    var HELPER_TEXT_VALIDATION_MSG_PERSISTENT: String = js.native
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
  object helperTextStrings extends js.Object {
    
    var ARIA_HIDDEN: String = js.native
    
    var ROLE: String = js.native
  }
}
