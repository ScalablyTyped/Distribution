package typings.materialSelect

import typings.materialSelect.adapterMod.MDCSelectAdapter
import typings.materialSelect.anon.ACTIVATED
import typings.materialSelect.anon.ARIACONTROLS
import typings.materialSelect.anon.ARIAHIDDEN
import typings.materialSelect.anon.HELPERTEXTVALIDATIONMSG
import typings.materialSelect.anon.ICONEVENT
import typings.materialSelect.anon.LABELSCALE
import typings.materialSelect.anon.PartialMDCSelectAdapter
import typings.materialSelect.anon.PartialMDCSelectFoundatio
import typings.materialSelect.anon.PartialMDCSelectHelperTex
import typings.materialSelect.anon.PartialMDCSelectIconAdapt
import typings.materialSelect.helperTextAdapterMod.MDCSelectHelperTextAdapter
import typings.materialSelect.iconAdapterMod.MDCSelectIconAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCSelect ()
    extends typings.materialSelect.componentMod.MDCSelect
  
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  class MDCSelectFoundation ()
    extends typings.materialSelect.foundationMod.MDCSelectFoundation {
    def this(adapter: PartialMDCSelectAdapter) = this()
    def this(adapter: js.UndefOr[scala.Nothing], foundationMap: PartialMDCSelectFoundatio) = this()
    def this(adapter: PartialMDCSelectAdapter, foundationMap: PartialMDCSelectFoundatio) = this()
  }
  
  @js.native
  class MDCSelectHelperText ()
    extends typings.materialSelect.indexMod.MDCSelectHelperText
  
  @js.native
  class MDCSelectHelperTextFoundation ()
    extends typings.materialSelect.indexMod.MDCSelectHelperTextFoundation {
    def this(adapter: PartialMDCSelectHelperTex) = this()
  }
  
  @js.native
  class MDCSelectIcon ()
    extends typings.materialSelect.iconIndexMod.MDCSelectIcon
  
  @js.native
  class MDCSelectIconFoundation ()
    extends typings.materialSelect.iconIndexMod.MDCSelectIconFoundation {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  
  /* static members */
  @js.native
  object MDCSelect extends js.Object {
    def attachTo(root: Element): typings.materialSelect.componentMod.MDCSelect = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectFoundation extends js.Object {
    def cssClasses: ACTIVATED = js.native
    /**
      * See {@link MDCSelectAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCSelectAdapter = js.native
    def numbers: LABELSCALE = js.native
    def strings: ARIACONTROLS = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectHelperText extends js.Object {
    def attachTo(root: Element): typings.materialSelect.helperTextComponentMod.MDCSelectHelperText = js.native
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
  object cssClasses extends js.Object {
    var ACTIVATED: String = js.native
    var DISABLED: String = js.native
    var FOCUSED: String = js.native
    var INVALID: String = js.native
    var MENU_INVALID: String = js.native
    var OUTLINED: String = js.native
    var REQUIRED: String = js.native
    var ROOT: String = js.native
    var SELECTED_ITEM_CLASS: String = js.native
    var WITH_LEADING_ICON: String = js.native
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
  
  @js.native
  object numbers extends js.Object {
    var LABEL_SCALE: Double = js.native
    var UNSET_INDEX: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var ARIA_CONTROLS: String = js.native
    var ARIA_SELECTED_ATTR: String = js.native
    var CHANGE_EVENT: String = js.native
    var LABEL_SELECTOR: String = js.native
    var LEADING_ICON_SELECTOR: String = js.native
    var LINE_RIPPLE_SELECTOR: String = js.native
    var MENU_SELECTOR: String = js.native
    var OUTLINE_SELECTOR: String = js.native
    var SELECTED_ITEM_SELECTOR: String = js.native
    var SELECTED_TEXT_SELECTOR: String = js.native
    var SELECT_ANCHOR_SELECTOR: String = js.native
    var VALUE_ATTR: String = js.native
  }
  
}

