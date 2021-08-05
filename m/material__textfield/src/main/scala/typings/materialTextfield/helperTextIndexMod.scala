package typings.materialTextfield

import typings.materialTextfield.anon.PartialMDCTextFieldHelper
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextIndexMod {
  
  @JSImport("@material/textfield/helper-text/index", "MDCTextFieldHelperText")
  @js.native
  class MDCTextFieldHelperText protected ()
    extends typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperText {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTextFieldHelperText {
    
    @JSImport("@material/textfield/helper-text/index", "MDCTextFieldHelperText")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperText = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperText]
  }
  
  @JSImport("@material/textfield/helper-text/index", "MDCTextFieldHelperTextFoundation")
  @js.native
  class MDCTextFieldHelperTextFoundation ()
    extends typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation {
    def this(adapter: PartialMDCTextFieldHelper) = this()
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
  object helperTextCssClasses {
    
    @JSImport("@material/textfield/helper-text/index", "helperTextCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/textfield/helper-text/index", "helperTextCssClasses.HELPER_TEXT_PERSISTENT")
    @js.native
    def HELPER_TEXT_PERSISTENT: String = js.native
    inline def HELPER_TEXT_PERSISTENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_PERSISTENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/textfield/helper-text/index", "helperTextCssClasses.HELPER_TEXT_VALIDATION_MSG")
    @js.native
    def HELPER_TEXT_VALIDATION_MSG: String = js.native
    inline def HELPER_TEXT_VALIDATION_MSG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_VALIDATION_MSG")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/textfield/helper-text/index", "helperTextCssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object helperTextStrings {
    
    @JSImport("@material/textfield/helper-text/index", "helperTextStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/textfield/helper-text/index", "helperTextStrings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/textfield/helper-text/index", "helperTextStrings.ROLE")
    @js.native
    def ROLE: String = js.native
    inline def ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/textfield/helper-text/index", "helperTextStrings.ROOT_SELECTOR")
    @js.native
    def ROOT_SELECTOR: String = js.native
    inline def ROOT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
