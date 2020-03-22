package typings.materialTabIndicator

import typings.materialTabIndicator.adapterMod.MDCTabIndicatorAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-indicator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCFadingTabIndicatorFoundation ()
    extends typings.materialTabIndicator.fadingFoundationMod.MDCFadingTabIndicatorFoundation
  
  @js.native
  class MDCSlidingTabIndicatorFoundation ()
    extends typings.materialTabIndicator.slidingFoundationMod.MDCSlidingTabIndicatorFoundation
  
  @js.native
  class MDCTabIndicator ()
    extends typings.materialTabIndicator.componentMod.MDCTabIndicator
  
  @js.native
  abstract class MDCTabIndicatorFoundation ()
    extends typings.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  /* static members */
  @js.native
  object MDCTabIndicator extends js.Object {
    def attachTo(root: Element): typings.materialTabIndicator.componentMod.MDCTabIndicator = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabIndicatorFoundation extends js.Object {
    val cssClasses: AnonACTIVE = js.native
    val defaultAdapter: MDCTabIndicatorAdapter = js.native
    val strings: AnonCONTENTSELECTOR = js.native
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
    var ACTIVE: String = js.native
    var FADE: String = js.native
    var NO_TRANSITION: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var CONTENT_SELECTOR: String = js.native
  }
  
}

