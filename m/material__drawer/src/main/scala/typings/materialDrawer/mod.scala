package typings.materialDrawer

import typings.materialDom.focusTrapMod.FocusTrap
import typings.materialDrawer.adapterMod.MDCDrawerAdapter
import typings.materialDrawer.anon.ANIMATE
import typings.materialDrawer.anon.APPCONTENTSELECTOR
import typings.materialDrawer.anon.PartialMDCDrawerAdapter
import typings.materialDrawer.utilMod.MDCDrawerFocusTrapFactory
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/drawer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCDismissibleDrawerFoundation ()
    extends typings.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation {
    def this(adapter: PartialMDCDrawerAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCDismissibleDrawerFoundation extends js.Object {
    
    def cssClasses: ANIMATE = js.native
    
    def defaultAdapter: MDCDrawerAdapter = js.native
    
    def strings: APPCONTENTSELECTOR = js.native
  }
  
  @js.native
  class MDCDrawer ()
    extends typings.materialDrawer.componentMod.MDCDrawer
  /* static members */
  @js.native
  object MDCDrawer extends js.Object {
    
    def attachTo(root: Element): typings.materialDrawer.componentMod.MDCDrawer = js.native
  }
  
  @js.native
  class MDCModalDrawerFoundation ()
    extends typings.materialDrawer.modalFoundationMod.MDCModalDrawerFoundation
  
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
  @js.native
  object cssClasses extends js.Object {
    
    var ANIMATE: String = js.native
    
    var CLOSING: String = js.native
    
    var DISMISSIBLE: String = js.native
    
    var MODAL: String = js.native
    
    var OPEN: String = js.native
    
    var OPENING: String = js.native
    
    var ROOT: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var APP_CONTENT_SELECTOR: String = js.native
    
    var CLOSE_EVENT: String = js.native
    
    var OPEN_EVENT: String = js.native
    
    var SCRIM_SELECTOR: String = js.native
  }
  
  @js.native
  object util extends js.Object {
    
    def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDrawerFocusTrapFactory): FocusTrap = js.native
  }
}
