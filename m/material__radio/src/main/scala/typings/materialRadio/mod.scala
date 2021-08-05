package typings.materialRadio

import typings.materialRadio.anon.PartialMDCRadioAdapter
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/radio", "MDCRadio")
  @js.native
  class MDCRadio protected ()
    extends typings.materialRadio.componentMod.MDCRadio {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: typings.materialRadio.foundationMod.MDCRadioFoundation, args: js.Any*) = this()
  }
  /* static members */
  object MDCRadio {
    
    @JSImport("@material/radio", "MDCRadio")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialRadio.componentMod.MDCRadio = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialRadio.componentMod.MDCRadio]
  }
  
  @JSImport("@material/radio", "MDCRadioFoundation")
  @js.native
  class MDCRadioFoundation ()
    extends typings.materialRadio.foundationMod.MDCRadioFoundation {
    def this(adapter: PartialMDCRadioAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/radio", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/radio", "cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    inline def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/radio", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
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
  object strings {
    
    @JSImport("@material/radio", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/radio", "strings.NATIVE_CONTROL_SELECTOR")
    @js.native
    def NATIVE_CONTROL_SELECTOR: String = js.native
    inline def NATIVE_CONTROL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
