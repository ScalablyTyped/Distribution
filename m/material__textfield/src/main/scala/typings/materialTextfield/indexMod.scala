package typings.materialTextfield

import typings.materialTextfield.anon.PartialMDCTextFieldCharac
import typings.materialTextfield.anon.ROOT
import typings.materialTextfield.anon.ROOTSELECTOR
import typings.materialTextfield.characterCounterAdapterMod.MDCTextFieldCharacterCounterAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/character-counter/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  @js.native
  class MDCTextFieldCharacterCounter ()
    extends typings.materialTextfield.componentMod.MDCTextFieldCharacterCounter
  
  @js.native
  class MDCTextFieldCharacterCounterFoundation ()
    extends typings.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation {
    def this(adapter: PartialMDCTextFieldCharac) = this()
  }
  
  /* static members */
  @js.native
  object MDCTextFieldCharacterCounter extends js.Object {
    def attachTo(root: Element): typings.materialTextfield.componentMod.MDCTextFieldCharacterCounter = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldCharacterCounterFoundation extends js.Object {
    def cssClasses: ROOT = js.native
    /**
      * See {@link MDCTextFieldCharacterCounterAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTextFieldCharacterCounterAdapter = js.native
    def strings: ROOTSELECTOR = js.native
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
  @js.native
  object characterCountCssClasses extends js.Object {
    var ROOT: String = js.native
  }
  
  @js.native
  object characterCountStrings extends js.Object {
    var ROOT_SELECTOR: String = js.native
  }
  
}

