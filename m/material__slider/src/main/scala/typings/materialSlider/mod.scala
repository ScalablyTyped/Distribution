package typings.materialSlider

import typings.materialSlider.adapterMod.MDCSliderAdapter
import typings.materialSlider.anon.ACTIVE
import typings.materialSlider.anon.ARIADISABLED
import typings.materialSlider.anon.PAGEFACTOR
import typings.materialSlider.anon.PartialMDCSliderAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/slider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCSlider ()
    extends typings.materialSlider.componentMod.MDCSlider
  
  @js.native
  class MDCSliderFoundation ()
    extends typings.materialSlider.foundationMod.MDCSliderFoundation {
    def this(adapter: PartialMDCSliderAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    def attachTo(root: Element): typings.materialSlider.componentMod.MDCSlider = js.native
  }
  
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    def cssClasses: ACTIVE = js.native
    def defaultAdapter: MDCSliderAdapter = js.native
    def numbers: PAGEFACTOR = js.native
    def strings: ARIADISABLED = js.native
  }
  
  /**
    * @license
    * Copyright 2017 Google Inc.
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
    var ACTIVE: String = js.native
    var DISABLED: String = js.native
    var DISABLE_TOUCH_ACTION: String = js.native
    var DISCRETE: String = js.native
    var FOCUS: String = js.native
    var HAS_TRACK_MARKER: String = js.native
    var IN_TRANSIT: String = js.native
    var IS_DISCRETE: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    var PAGE_FACTOR: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var ARIA_DISABLED: String = js.native
    var ARIA_VALUEMAX: String = js.native
    var ARIA_VALUEMIN: String = js.native
    var ARIA_VALUENOW: String = js.native
    var CHANGE_EVENT: String = js.native
    var INPUT_EVENT: String = js.native
    var PIN_VALUE_MARKER_SELECTOR: String = js.native
    var STEP_DATA_ATTR: String = js.native
    var THUMB_CONTAINER_SELECTOR: String = js.native
    var TRACK_MARKER_CONTAINER_SELECTOR: String = js.native
    var TRACK_SELECTOR: String = js.native
  }
  
}

