package typings.atMaterialMenuDashSurface

import typings.atMaterialMenuDashSurface.constantsMod.Corner
import typings.atMaterialMenuDashSurface.constantsMod.CornerBit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/menu-surface/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  @js.native
  sealed trait Corner extends js.Object
  
  @js.native
  sealed trait CornerBit extends js.Object
  
  /**
    * Enum for representing an element corner for positioning the menu-surface.
    *
    * The START constants map to LEFT if element directionality is left
    * to right and RIGHT if the directionality is right to left.
    * Likewise END maps to RIGHT or LEFT depending on the directionality.
    */
  @js.native
  object Corner extends js.Object {
    @js.native
    sealed trait BOTTOM_END extends Corner
    
    @js.native
    sealed trait BOTTOM_LEFT extends Corner
    
    @js.native
    sealed trait BOTTOM_RIGHT extends Corner
    
    @js.native
    sealed trait BOTTOM_START extends Corner
    
    @js.native
    sealed trait TOP_END extends Corner
    
    @js.native
    sealed trait TOP_LEFT extends Corner
    
    @js.native
    sealed trait TOP_RIGHT extends Corner
    
    @js.native
    sealed trait TOP_START extends Corner
    
    /* 13 */ val BOTTOM_END: typings.atMaterialMenuDashSurface.constantsMod.Corner.BOTTOM_END with Double = js.native
    /* 1 */ val BOTTOM_LEFT: typings.atMaterialMenuDashSurface.constantsMod.Corner.BOTTOM_LEFT with Double = js.native
    /* 5 */ val BOTTOM_RIGHT: typings.atMaterialMenuDashSurface.constantsMod.Corner.BOTTOM_RIGHT with Double = js.native
    /* 9 */ val BOTTOM_START: typings.atMaterialMenuDashSurface.constantsMod.Corner.BOTTOM_START with Double = js.native
    /* 12 */ val TOP_END: typings.atMaterialMenuDashSurface.constantsMod.Corner.TOP_END with Double = js.native
    /* 0 */ val TOP_LEFT: typings.atMaterialMenuDashSurface.constantsMod.Corner.TOP_LEFT with Double = js.native
    /* 4 */ val TOP_RIGHT: typings.atMaterialMenuDashSurface.constantsMod.Corner.TOP_RIGHT with Double = js.native
    /* 8 */ val TOP_START: typings.atMaterialMenuDashSurface.constantsMod.Corner.TOP_START with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Corner with Double] = js.native
  }
  
  /**
    * Enum for bits in the {@see Corner) bitmap.
    */
  @js.native
  object CornerBit extends js.Object {
    @js.native
    sealed trait BOTTOM extends CornerBit
    
    @js.native
    sealed trait CENTER extends CornerBit
    
    @js.native
    sealed trait FLIP_RTL extends CornerBit
    
    @js.native
    sealed trait RIGHT extends CornerBit
    
    /* 1 */ val BOTTOM: typings.atMaterialMenuDashSurface.constantsMod.CornerBit.BOTTOM with Double = js.native
    /* 2 */ val CENTER: typings.atMaterialMenuDashSurface.constantsMod.CornerBit.CENTER with Double = js.native
    /* 8 */ val FLIP_RTL: typings.atMaterialMenuDashSurface.constantsMod.CornerBit.FLIP_RTL with Double = js.native
    /* 4 */ val RIGHT: typings.atMaterialMenuDashSurface.constantsMod.CornerBit.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CornerBit with Double] = js.native
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
    var ANCHOR: String = js.native
    var ANIMATING_CLOSED: String = js.native
    var ANIMATING_OPEN: String = js.native
    var FIXED: String = js.native
    var OPEN: String = js.native
    var ROOT: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    /** Ratio of anchor width to menu-surface width for switching from corner positioning to center positioning. */
    var ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double = js.native
    /** Margin left to the edge of the viewport when menu-surface is at maximum possible height. */
    var MARGIN_TO_EDGE: Double = js.native
    /** Total duration of menu-surface close animation. */
    var TRANSITION_CLOSE_DURATION: Double = js.native
    /** Total duration of menu-surface open animation. */
    var TRANSITION_OPEN_DURATION: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var CLOSED_EVENT: String = js.native
    var FOCUSABLE_ELEMENTS: String = js.native
    var OPENED_EVENT: String = js.native
  }
  
}

