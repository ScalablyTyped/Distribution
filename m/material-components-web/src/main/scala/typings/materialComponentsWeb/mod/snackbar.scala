package typings.materialComponentsWeb.mod

import typings.materialSnackbar.adapterMod.MDCSnackbarAdapter
import typings.materialSnackbar.anon.ACTIONSELECTOR
import typings.materialSnackbar.anon.ARIALIVEDELAYMS
import typings.materialSnackbar.anon.CLOSING
import typings.materialSnackbar.anon.PartialMDCSnackbarAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "snackbar")
@js.native
object snackbar extends js.Object {
  
  @js.native
  class MDCSnackbar ()
    extends typings.materialSnackbar.mod.MDCSnackbar
  /* static members */
  @js.native
  object MDCSnackbar extends js.Object {
    
    def attachTo(root: Element): typings.materialSnackbar.componentMod.MDCSnackbar = js.native
  }
  
  @js.native
  class MDCSnackbarFoundation ()
    extends typings.materialSnackbar.mod.MDCSnackbarFoundation {
    def this(adapter: PartialMDCSnackbarAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCSnackbarFoundation extends js.Object {
    
    def cssClasses: CLOSING = js.native
    
    def defaultAdapter: MDCSnackbarAdapter = js.native
    
    def numbers: ARIALIVEDELAYMS = js.native
    
    def strings: ACTIONSELECTOR = js.native
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
    
    var CLOSING: String = js.native
    
    var OPEN: String = js.native
    
    var OPENING: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    /**
      * Number of milliseconds to wait between temporarily clearing the label text
      * in the DOM and subsequently restoring it. This is necessary to force IE 11
      * to pick up the `aria-live` content change and announce it to the user.
      */
    var ARIA_LIVE_DELAY_MS: Double = js.native
    
    var DEFAULT_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
    
    var INDETERMINATE: Double = js.native
    
    var MAX_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
    
    var MIN_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
    
    var SNACKBAR_ANIMATION_CLOSE_TIME_MS: Double = js.native
    
    var SNACKBAR_ANIMATION_OPEN_TIME_MS: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ACTION_SELECTOR: String = js.native
    
    var ARIA_LIVE_LABEL_TEXT_ATTR: String = js.native
    
    var CLOSED_EVENT: String = js.native
    
    var CLOSING_EVENT: String = js.native
    
    var DISMISS_SELECTOR: String = js.native
    
    var LABEL_SELECTOR: String = js.native
    
    var OPENED_EVENT: String = js.native
    
    var OPENING_EVENT: String = js.native
    
    var REASON_ACTION: String = js.native
    
    var REASON_DISMISS: String = js.native
    
    var SURFACE_SELECTOR: String = js.native
  }
  
  @js.native
  object util extends js.Object {
    
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
    def announce(ariaEl: Element): Unit = js.native
    def announce(ariaEl: Element, labelEl: Element): Unit = js.native
  }
}
