package typings.materialTabScroller

import typings.materialTabScroller.anon.PartialMDCTabScrollerAdap
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/tab-scroller", "MDCTabScroller")
  @js.native
  class MDCTabScroller protected ()
    extends typings.materialTabScroller.componentMod.MDCTabScroller {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTabScroller.foundationMod.MDCTabScrollerFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTabScroller {
    
    @JSImport("@material/tab-scroller", "MDCTabScroller.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialTabScroller.componentMod.MDCTabScroller = js.native
  }
  
  @JSImport("@material/tab-scroller", "MDCTabScrollerFoundation")
  @js.native
  class MDCTabScrollerFoundation ()
    extends typings.materialTabScroller.foundationMod.MDCTabScrollerFoundation {
    def this(adapter: PartialMDCTabScrollerAdap) = this()
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
    
    @JSImport("@material/tab-scroller", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab-scroller", "cssClasses.ANIMATING")
    @js.native
    def ANIMATING: String = js.native
    @scala.inline
    def ANIMATING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-scroller", "cssClasses.SCROLL_AREA_SCROLL")
    @js.native
    def SCROLL_AREA_SCROLL: String = js.native
    @scala.inline
    def SCROLL_AREA_SCROLL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_AREA_SCROLL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-scroller", "cssClasses.SCROLL_TEST")
    @js.native
    def SCROLL_TEST: String = js.native
    @scala.inline
    def SCROLL_TEST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_TEST")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/tab-scroller", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab-scroller", "strings.AREA_SELECTOR")
    @js.native
    def AREA_SELECTOR: String = js.native
    @scala.inline
    def AREA_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AREA_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab-scroller", "strings.CONTENT_SELECTOR")
    @js.native
    def CONTENT_SELECTOR: String = js.native
    @scala.inline
    def CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("@material/tab-scroller", "util.computeHorizontalScrollbarHeight")
    @js.native
    def computeHorizontalScrollbarHeight(documentObj: Document): Double = js.native
    @JSImport("@material/tab-scroller", "util.computeHorizontalScrollbarHeight")
    @js.native
    def computeHorizontalScrollbarHeight(documentObj: Document, shouldCacheResult: Boolean): Double = js.native
  }
}
