package typings.materialList

import typings.materialList.adapterMod.MDCListAdapter
import typings.materialList.anon.ACTIONEVENT
import typings.materialList.anon.LISTITEMACTIVATEDCLASS
import typings.materialList.anon.PartialMDCListAdapter
import typings.materialList.anon.TYPEAHEADBUFFERCLEARTIMEOUTMS
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCList ()
    extends typings.materialList.componentMod.MDCList
  
  @js.native
  class MDCListFoundation ()
    extends typings.materialList.foundationMod.MDCListFoundation {
    def this(adapter: PartialMDCListAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCList extends js.Object {
    def attachTo(root: Element): typings.materialList.componentMod.MDCList = js.native
  }
  
  /* static members */
  @js.native
  object MDCListFoundation extends js.Object {
    def cssClasses: LISTITEMACTIVATEDCLASS = js.native
    def defaultAdapter: MDCListAdapter = js.native
    def numbers: TYPEAHEADBUFFERCLEARTIMEOUTMS = js.native
    def strings: ACTIONEVENT = js.native
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
    var LIST_ITEM_ACTIVATED_CLASS: String = js.native
    var LIST_ITEM_CLASS: String = js.native
    var LIST_ITEM_DISABLED_CLASS: String = js.native
    var LIST_ITEM_PRIMARY_TEXT_CLASS: String = js.native
    var LIST_ITEM_SELECTED_CLASS: String = js.native
    var LIST_ITEM_TEXT_CLASS: String = js.native
    var ROOT: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    var TYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS: Double = js.native
    var UNSET_INDEX: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var ACTION_EVENT: String = js.native
    var ARIA_CHECKED: String = js.native
    var ARIA_CHECKED_CHECKBOX_SELECTOR: String = js.native
    var ARIA_CHECKED_RADIO_SELECTOR: String = js.native
    var ARIA_CURRENT: String = js.native
    var ARIA_DISABLED: String = js.native
    var ARIA_ORIENTATION: String = js.native
    var ARIA_ORIENTATION_HORIZONTAL: String = js.native
    var ARIA_ROLE_CHECKBOX_SELECTOR: String = js.native
    var ARIA_SELECTED: String = js.native
    var CHECKBOX_RADIO_SELECTOR: String = js.native
    var CHECKBOX_SELECTOR: String = js.native
    var CHILD_ELEMENTS_TO_TOGGLE_TABINDEX: String = js.native
    var FOCUSABLE_CHILD_ELEMENTS: String = js.native
    var RADIO_SELECTOR: String = js.native
  }
  
}

