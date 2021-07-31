package typings.materialDrawer

import typings.materialDom.focusTrapMod.FocusTrap
import typings.materialDrawer.anon.PartialMDCDrawerAdapter
import typings.materialDrawer.utilMod.MDCDrawerFocusTrapFactory
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/drawer", "MDCDismissibleDrawerFoundation")
  @js.native
  class MDCDismissibleDrawerFoundation ()
    extends typings.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation {
    def this(adapter: PartialMDCDrawerAdapter) = this()
  }
  
  @JSImport("@material/drawer", "MDCDrawer")
  @js.native
  class MDCDrawer protected ()
    extends typings.materialDrawer.componentMod.MDCDrawer {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCDrawer {
    
    @JSImport("@material/drawer", "MDCDrawer")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): typings.materialDrawer.componentMod.MDCDrawer = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialDrawer.componentMod.MDCDrawer]
  }
  
  @JSImport("@material/drawer", "MDCModalDrawerFoundation")
  @js.native
  class MDCModalDrawerFoundation ()
    extends typings.materialDrawer.modalFoundationMod.MDCModalDrawerFoundation {
    def this(adapter: PartialMDCDrawerAdapter) = this()
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
  object cssClasses {
    
    @JSImport("@material/drawer", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/drawer", "cssClasses.ANIMATE")
    @js.native
    def ANIMATE: String = js.native
    @scala.inline
    def ANIMATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "cssClasses.CLOSING")
    @js.native
    def CLOSING: String = js.native
    @scala.inline
    def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "cssClasses.DISMISSIBLE")
    @js.native
    def DISMISSIBLE: String = js.native
    @scala.inline
    def DISMISSIBLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISMISSIBLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "cssClasses.MODAL")
    @js.native
    def MODAL: String = js.native
    @scala.inline
    def MODAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    
    @JSImport("@material/drawer", "cssClasses.OPENING")
    @js.native
    def OPENING: String = js.native
    @scala.inline
    def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/drawer", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/drawer", "strings.APP_CONTENT_SELECTOR")
    @js.native
    def APP_CONTENT_SELECTOR: String = js.native
    @scala.inline
    def APP_CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "strings.CLOSE_EVENT")
    @js.native
    def CLOSE_EVENT: String = js.native
    @scala.inline
    def CLOSE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "strings.OPEN_EVENT")
    @js.native
    def OPEN_EVENT: String = js.native
    @scala.inline
    def OPEN_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/drawer", "strings.SCRIM_SELECTOR")
    @js.native
    def SCRIM_SELECTOR: String = js.native
    @scala.inline
    def SCRIM_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIM_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("@material/drawer", "util")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDrawerFocusTrapFactory): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrapInstance")(surfaceEl.asInstanceOf[js.Any], focusTrapFactory.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  }
}
