package typings.materialTextfield

import typings.materialTextfield.anon.ARIAHIDDEN
import typings.materialTextfield.anon.HELPERTEXTPERSISTENT
import typings.materialTextfield.anon.PartialMDCTextFieldHelper
import typings.materialTextfield.helperTextAdapterMod.MDCTextFieldHelperTextAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/textfield/helper-text/index", JSImport.Namespace)
@js.native
object helperTextIndexMod extends js.Object {
  
  @js.native
  class MDCTextFieldHelperText ()
    extends typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperText
  /* static members */
  @js.native
  object MDCTextFieldHelperText extends js.Object {
    
    def attachTo(root: Element): typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperText = js.native
  }
  
  @js.native
  class MDCTextFieldHelperTextFoundation ()
    extends typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation {
    def this(adapter: PartialMDCTextFieldHelper) = this()
  }
  /* static members */
  @js.native
  object MDCTextFieldHelperTextFoundation extends js.Object {
    
    def cssClasses: HELPERTEXTPERSISTENT = js.native
    
    /**
      * See {@link MDCTextFieldHelperTextAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
    
    def strings: ARIAHIDDEN = js.native
  }
  
  /**
    * @license
    * Copyright 2016 Google Inc.
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
  object helperTextCssClasses extends js.Object {
    
    var HELPER_TEXT_PERSISTENT: String = js.native
    
    var HELPER_TEXT_VALIDATION_MSG: String = js.native
    
    var ROOT: String = js.native
  }
  
  @js.native
  object helperTextStrings extends js.Object {
    
    var ARIA_HIDDEN: String = js.native
    
    var ROLE: String = js.native
    
    var ROOT_SELECTOR: String = js.native
  }
}
