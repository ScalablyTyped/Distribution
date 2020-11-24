package typings.materialComponentsWeb.mod

import typings.materialMenu.adapterMod.MDCMenuAdapter
import typings.materialMenu.anon.ARIACHECKEDATTR
import typings.materialMenu.anon.FOCUSROOTINDEX
import typings.materialMenu.anon.MENUSELECTEDLISTITEM
import typings.materialMenu.anon.PartialMDCMenuAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "menu")
@js.native
object menu extends js.Object {
  
  /**
    * Enum for representing an element corner for positioning the menu-surface.
    *
    * The START constants map to LEFT if element directionality is left
    * to right and RIGHT if the directionality is right to left.
    * Likewise END maps to RIGHT or LEFT depending on the directionality.
    */
  @js.native
  object Corner extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialMenuSurface.constantsMod.Corner with Double] = js.native
    
    /* 13 */ val BOTTOM_END: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_END with Double = js.native
    
    /* 1 */ val BOTTOM_LEFT: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_LEFT with Double = js.native
    
    /* 5 */ val BOTTOM_RIGHT: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_RIGHT with Double = js.native
    
    /* 9 */ val BOTTOM_START: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_START with Double = js.native
    
    /* 12 */ val TOP_END: typings.materialMenuSurface.constantsMod.Corner.TOP_END with Double = js.native
    
    /* 0 */ val TOP_LEFT: typings.materialMenuSurface.constantsMod.Corner.TOP_LEFT with Double = js.native
    
    /* 4 */ val TOP_RIGHT: typings.materialMenuSurface.constantsMod.Corner.TOP_RIGHT with Double = js.native
    
    /* 8 */ val TOP_START: typings.materialMenuSurface.constantsMod.Corner.TOP_START with Double = js.native
  }
  
  @js.native
  object DefaultFocusState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialMenu.constantsMod.DefaultFocusState with Double] = js.native
    
    /* 2 */ val FIRST_ITEM: typings.materialMenu.constantsMod.DefaultFocusState.FIRST_ITEM with Double = js.native
    
    /* 3 */ val LAST_ITEM: typings.materialMenu.constantsMod.DefaultFocusState.LAST_ITEM with Double = js.native
    
    /* 1 */ val LIST_ROOT: typings.materialMenu.constantsMod.DefaultFocusState.LIST_ROOT with Double = js.native
    
    /* 0 */ val NONE: typings.materialMenu.constantsMod.DefaultFocusState.NONE with Double = js.native
  }
  
  @js.native
  class MDCMenu ()
    extends typings.materialMenu.mod.MDCMenu
  /* static members */
  @js.native
  object MDCMenu extends js.Object {
    
    def attachTo(root: Element): typings.materialMenu.componentMod.MDCMenu = js.native
  }
  
  @js.native
  class MDCMenuFoundation ()
    extends typings.materialMenu.mod.MDCMenuFoundation {
    def this(adapter: PartialMDCMenuAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCMenuFoundation extends js.Object {
    
    def cssClasses: MENUSELECTEDLISTITEM = js.native
    
    /**
      * @see {@link MDCMenuAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCMenuAdapter = js.native
    
    def numbers: FOCUSROOTINDEX = js.native
    
    def strings: ARIACHECKEDATTR = js.native
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
    
    var MENU_SELECTED_LIST_ITEM: String = js.native
    
    var MENU_SELECTION_GROUP: String = js.native
    
    var ROOT: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var FOCUS_ROOT_INDEX: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ARIA_CHECKED_ATTR: String = js.native
    
    var ARIA_DISABLED_ATTR: String = js.native
    
    var CHECKBOX_SELECTOR: String = js.native
    
    var LIST_SELECTOR: String = js.native
    
    var SELECTED_EVENT: String = js.native
  }
}
