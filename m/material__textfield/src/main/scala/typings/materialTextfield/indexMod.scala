package typings.materialTextfield

import typings.materialTextfield.anon.PartialMDCTextFieldCharac
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@material/textfield/character-counter/index", "MDCTextFieldCharacterCounter")
  @js.native
  class MDCTextFieldCharacterCounter protected ()
    extends typings.materialTextfield.componentMod.MDCTextFieldCharacterCounter {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTextFieldCharacterCounter {
    
    @JSImport("@material/textfield/character-counter/index", "MDCTextFieldCharacterCounter.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialTextfield.componentMod.MDCTextFieldCharacterCounter = js.native
  }
  
  @JSImport("@material/textfield/character-counter/index", "MDCTextFieldCharacterCounterFoundation")
  @js.native
  class MDCTextFieldCharacterCounterFoundation ()
    extends typings.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation {
    def this(adapter: PartialMDCTextFieldCharac) = this()
  }
  
  /**
    * @license
    * Copyright 2019 Google Inc.
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
  object characterCountCssClasses {
    
    @JSImport("@material/textfield/character-counter/index", "characterCountCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/textfield/character-counter/index", "characterCountCssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object characterCountStrings {
    
    @JSImport("@material/textfield/character-counter/index", "characterCountStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/textfield/character-counter/index", "characterCountStrings.ROOT_SELECTOR")
    @js.native
    def ROOT_SELECTOR: String = js.native
    @scala.inline
    def ROOT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
