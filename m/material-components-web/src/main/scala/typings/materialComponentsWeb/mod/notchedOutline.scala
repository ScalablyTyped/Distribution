package typings.materialComponentsWeb.mod

import typings.materialNotchedOutline.anon.PartialMDCNotchedOutlineA
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notchedOutline {
  
  @JSImport("material-components-web", "notchedOutline.MDCNotchedOutline")
  @js.native
  class MDCNotchedOutline protected ()
    extends typings.materialNotchedOutline.mod.MDCNotchedOutline {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialNotchedOutline.foundationMod.MDCNotchedOutlineFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCNotchedOutline {
    
    @JSImport("material-components-web", "notchedOutline.MDCNotchedOutline")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialNotchedOutline.componentMod.MDCNotchedOutline = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialNotchedOutline.componentMod.MDCNotchedOutline]
  }
  
  @JSImport("material-components-web", "notchedOutline.MDCNotchedOutlineFoundation")
  @js.native
  class MDCNotchedOutlineFoundation ()
    extends typings.materialNotchedOutline.mod.MDCNotchedOutlineFoundation {
    def this(adapter: PartialMDCNotchedOutlineA) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "notchedOutline.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "notchedOutline.cssClasses.NO_LABEL")
    @js.native
    def NO_LABEL: String = js.native
    inline def NO_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "notchedOutline.cssClasses.OUTLINE_NOTCHED")
    @js.native
    def OUTLINE_NOTCHED: String = js.native
    inline def OUTLINE_NOTCHED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE_NOTCHED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "notchedOutline.cssClasses.OUTLINE_UPGRADED")
    @js.native
    def OUTLINE_UPGRADED: String = js.native
    inline def OUTLINE_UPGRADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE_UPGRADED")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "notchedOutline.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "notchedOutline.numbers.NOTCH_ELEMENT_PADDING")
    @js.native
    def NOTCH_ELEMENT_PADDING: Double = js.native
    inline def NOTCH_ELEMENT_PADDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTCH_ELEMENT_PADDING")(x.asInstanceOf[js.Any])
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
  object strings {
    
    @JSImport("material-components-web", "notchedOutline.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "notchedOutline.strings.NOTCH_ELEMENT_SELECTOR")
    @js.native
    def NOTCH_ELEMENT_SELECTOR: String = js.native
    inline def NOTCH_ELEMENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTCH_ELEMENT_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
