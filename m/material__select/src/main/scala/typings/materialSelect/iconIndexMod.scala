package typings.materialSelect

import typings.materialSelect.anon.PartialMDCSelectIconAdapt
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconIndexMod {
  
  @JSImport("@material/select/icon/index", "MDCSelectIcon")
  @js.native
  class MDCSelectIcon protected ()
    extends typings.materialSelect.iconComponentMod.MDCSelectIcon {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSelect.iconFoundationMod.MDCSelectIconFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSelectIcon {
    
    @JSImport("@material/select/icon/index", "MDCSelectIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): typings.materialSelect.iconComponentMod.MDCSelectIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSelect.iconComponentMod.MDCSelectIcon]
  }
  
  @JSImport("@material/select/icon/index", "MDCSelectIconFoundation")
  @js.native
  class MDCSelectIconFoundation ()
    extends typings.materialSelect.iconFoundationMod.MDCSelectIconFoundation {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
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
  object iconStrings {
    
    @JSImport("@material/select/icon/index", "iconStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/select/icon/index", "iconStrings.ICON_EVENT")
    @js.native
    def ICON_EVENT: String = js.native
    @scala.inline
    def ICON_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/select/icon/index", "iconStrings.ICON_ROLE")
    @js.native
    def ICON_ROLE: String = js.native
    @scala.inline
    def ICON_ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_ROLE")(x.asInstanceOf[js.Any])
  }
}
