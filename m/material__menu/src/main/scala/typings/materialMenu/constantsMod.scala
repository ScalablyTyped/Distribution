package typings.materialMenu

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/menu/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  @js.native
  sealed trait DefaultFocusState extends js.Object
  @js.native
  object DefaultFocusState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DefaultFocusState with Double] = js.native
    
    @js.native
    sealed trait FIRST_ITEM extends DefaultFocusState
    /* 2 */ @js.native
    object FIRST_ITEM extends TopLevel[FIRST_ITEM with Double]
    
    @js.native
    sealed trait LAST_ITEM extends DefaultFocusState
    /* 3 */ @js.native
    object LAST_ITEM extends TopLevel[LAST_ITEM with Double]
    
    @js.native
    sealed trait LIST_ROOT extends DefaultFocusState
    /* 1 */ @js.native
    object LIST_ROOT extends TopLevel[LIST_ROOT with Double]
    
    @js.native
    sealed trait NONE extends DefaultFocusState
    /* 0 */ @js.native
    object NONE extends TopLevel[NONE with Double]
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
