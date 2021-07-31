package typings.materialLineRipple

import typings.materialLineRipple.anon.PartialMDCLineRippleAdapt
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/line-ripple", "MDCLineRipple")
  @js.native
  class MDCLineRipple protected ()
    extends typings.materialLineRipple.componentMod.MDCLineRipple {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialLineRipple.foundationMod.MDCLineRippleFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCLineRipple {
    
    @JSImport("@material/line-ripple", "MDCLineRipple")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): typings.materialLineRipple.componentMod.MDCLineRipple = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialLineRipple.componentMod.MDCLineRipple]
  }
  
  @JSImport("@material/line-ripple", "MDCLineRippleFoundation")
  @js.native
  class MDCLineRippleFoundation ()
    extends typings.materialLineRipple.foundationMod.MDCLineRippleFoundation {
    def this(adapter: PartialMDCLineRippleAdapt) = this()
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
    
    @JSImport("@material/line-ripple", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/line-ripple", "cssClasses.LINE_RIPPLE_ACTIVE")
    @js.native
    def LINE_RIPPLE_ACTIVE: String = js.native
    @scala.inline
    def LINE_RIPPLE_ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/line-ripple", "cssClasses.LINE_RIPPLE_DEACTIVATING")
    @js.native
    def LINE_RIPPLE_DEACTIVATING: String = js.native
    @scala.inline
    def LINE_RIPPLE_DEACTIVATING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_DEACTIVATING")(x.asInstanceOf[js.Any])
  }
}
