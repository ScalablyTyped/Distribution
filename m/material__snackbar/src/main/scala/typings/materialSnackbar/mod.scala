package typings.materialSnackbar

import typings.materialSnackbar.anon.PartialMDCSnackbarAdapter
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/snackbar", "MDCSnackbar")
  @js.native
  class MDCSnackbar protected ()
    extends typings.materialSnackbar.componentMod.MDCSnackbar {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSnackbar.foundationMod.MDCSnackbarFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSnackbar {
    
    @JSImport("@material/snackbar", "MDCSnackbar")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): typings.materialSnackbar.componentMod.MDCSnackbar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSnackbar.componentMod.MDCSnackbar]
  }
  
  @JSImport("@material/snackbar", "MDCSnackbarFoundation")
  @js.native
  class MDCSnackbarFoundation ()
    extends typings.materialSnackbar.foundationMod.MDCSnackbarFoundation {
    def this(adapter: PartialMDCSnackbarAdapter) = this()
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
  object cssClasses {
    
    @JSImport("@material/snackbar", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/snackbar", "cssClasses.CLOSING")
    @js.native
    def CLOSING: String = js.native
    @scala.inline
    def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    
    @JSImport("@material/snackbar", "cssClasses.OPENING")
    @js.native
    def OPENING: String = js.native
    @scala.inline
    def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/snackbar", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Number of milliseconds to wait between temporarily clearing the label text
      * in the DOM and subsequently restoring it. This is necessary to force IE 11
      * to pick up the `aria-live` content change and announce it to the user.
      */
    @JSImport("@material/snackbar", "numbers.ARIA_LIVE_DELAY_MS")
    @js.native
    def ARIA_LIVE_DELAY_MS: Double = js.native
    @scala.inline
    def ARIA_LIVE_DELAY_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_LIVE_DELAY_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "numbers.DEFAULT_AUTO_DISMISS_TIMEOUT_MS")
    @js.native
    def DEFAULT_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
    @scala.inline
    def DEFAULT_AUTO_DISMISS_TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_AUTO_DISMISS_TIMEOUT_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "numbers.INDETERMINATE")
    @js.native
    def INDETERMINATE: Double = js.native
    @scala.inline
    def INDETERMINATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDETERMINATE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "numbers.MAX_AUTO_DISMISS_TIMEOUT_MS")
    @js.native
    def MAX_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
    @scala.inline
    def MAX_AUTO_DISMISS_TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_AUTO_DISMISS_TIMEOUT_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "numbers.MIN_AUTO_DISMISS_TIMEOUT_MS")
    @js.native
    def MIN_AUTO_DISMISS_TIMEOUT_MS: Double = js.native
    @scala.inline
    def MIN_AUTO_DISMISS_TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_AUTO_DISMISS_TIMEOUT_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "numbers.SNACKBAR_ANIMATION_CLOSE_TIME_MS")
    @js.native
    def SNACKBAR_ANIMATION_CLOSE_TIME_MS: Double = js.native
    @scala.inline
    def SNACKBAR_ANIMATION_CLOSE_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNACKBAR_ANIMATION_CLOSE_TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "numbers.SNACKBAR_ANIMATION_OPEN_TIME_MS")
    @js.native
    def SNACKBAR_ANIMATION_OPEN_TIME_MS: Double = js.native
    @scala.inline
    def SNACKBAR_ANIMATION_OPEN_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNACKBAR_ANIMATION_OPEN_TIME_MS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/snackbar", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/snackbar", "strings.ACTION_SELECTOR")
    @js.native
    def ACTION_SELECTOR: String = js.native
    @scala.inline
    def ACTION_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "strings.ARIA_LIVE_LABEL_TEXT_ATTR")
    @js.native
    def ARIA_LIVE_LABEL_TEXT_ATTR: String = js.native
    @scala.inline
    def ARIA_LIVE_LABEL_TEXT_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_LIVE_LABEL_TEXT_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "strings.CLOSED_EVENT")
    @js.native
    def CLOSED_EVENT: String = js.native
    @scala.inline
    def CLOSED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "strings.CLOSING_EVENT")
    @js.native
    def CLOSING_EVENT: String = js.native
    @scala.inline
    def CLOSING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "strings.DISMISS_SELECTOR")
    @js.native
    def DISMISS_SELECTOR: String = js.native
    @scala.inline
    def DISMISS_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISMISS_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "strings.LABEL_SELECTOR")
    @js.native
    def LABEL_SELECTOR: String = js.native
    @scala.inline
    def LABEL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "strings.OPENED_EVENT")
    @js.native
    def OPENED_EVENT: String = js.native
    @scala.inline
    def OPENED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "strings.OPENING_EVENT")
    @js.native
    def OPENING_EVENT: String = js.native
    @scala.inline
    def OPENING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "strings.REASON_ACTION")
    @js.native
    def REASON_ACTION: String = js.native
    @scala.inline
    def REASON_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REASON_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "strings.REASON_DISMISS")
    @js.native
    def REASON_DISMISS: String = js.native
    @scala.inline
    def REASON_DISMISS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REASON_DISMISS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/snackbar", "strings.SURFACE_SELECTOR")
    @js.native
    def SURFACE_SELECTOR: String = js.native
    @scala.inline
    def SURFACE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SURFACE_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("@material/snackbar", "util")
    @js.native
    val ^ : js.Any = js.native
    
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
    @scala.inline
    def announce(ariaEl: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("announce")(ariaEl.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def announce(ariaEl: Element, labelEl: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("announce")(ariaEl.asInstanceOf[js.Any], labelEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
