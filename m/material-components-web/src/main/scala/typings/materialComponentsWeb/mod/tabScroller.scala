package typings.materialComponentsWeb.mod

import typings.materialTabScroller.anon.PartialMDCTabScrollerAdap
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabScroller {
  
  @JSImport("material-components-web", "tabScroller.MDCTabScroller")
  @js.native
  class MDCTabScroller protected ()
    extends typings.materialTabScroller.mod.MDCTabScroller {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTabScroller.foundationMod.MDCTabScrollerFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTabScroller {
    
    @JSImport("material-components-web", "tabScroller.MDCTabScroller")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialTabScroller.componentMod.MDCTabScroller = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTabScroller.componentMod.MDCTabScroller]
  }
  
  @JSImport("material-components-web", "tabScroller.MDCTabScrollerFoundation")
  @js.native
  class MDCTabScrollerFoundation ()
    extends typings.materialTabScroller.mod.MDCTabScrollerFoundation {
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
    
    @JSImport("material-components-web", "tabScroller.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "tabScroller.cssClasses.ANIMATING")
    @js.native
    def ANIMATING: String = js.native
    inline def ANIMATING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabScroller.cssClasses.SCROLL_AREA_SCROLL")
    @js.native
    def SCROLL_AREA_SCROLL: String = js.native
    inline def SCROLL_AREA_SCROLL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_AREA_SCROLL")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabScroller.cssClasses.SCROLL_TEST")
    @js.native
    def SCROLL_TEST: String = js.native
    inline def SCROLL_TEST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_TEST")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "tabScroller.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "tabScroller.strings.AREA_SELECTOR")
    @js.native
    def AREA_SELECTOR: String = js.native
    inline def AREA_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AREA_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabScroller.strings.CONTENT_SELECTOR")
    @js.native
    def CONTENT_SELECTOR: String = js.native
    inline def CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("material-components-web", "tabScroller.util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def computeHorizontalScrollbarHeight(documentObj: Document): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHorizontalScrollbarHeight")(documentObj.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def computeHorizontalScrollbarHeight(documentObj: Document, shouldCacheResult: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHorizontalScrollbarHeight")(documentObj.asInstanceOf[js.Any], shouldCacheResult.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
