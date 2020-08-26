package typings.materialSelect

import typings.materialSelect.anon.ICONEVENT
import typings.materialSelect.anon.PartialMDCSelectIconAdapt
import typings.materialSelect.iconAdapterMod.MDCSelectIconAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/select/icon/index", JSImport.Namespace)
@js.native
object iconIndexMod extends js.Object {
  @js.native
  class MDCSelectIcon ()
    extends typings.materialSelect.iconComponentMod.MDCSelectIcon
  
  @js.native
  class MDCSelectIconFoundation ()
    extends typings.materialSelect.iconFoundationMod.MDCSelectIconFoundation {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  
  /* static members */
  @js.native
  object MDCSelectIcon extends js.Object {
    def attachTo(root: Element): typings.materialSelect.iconComponentMod.MDCSelectIcon = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectIconFoundation extends js.Object {
    /**
      * See {@link MDCSelectIconAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCSelectIconAdapter = js.native
    def strings: ICONEVENT = js.native
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
  object iconStrings extends js.Object {
    var ICON_EVENT: String = js.native
    var ICON_ROLE: String = js.native
  }
  
}

