package typings.materialMenuSurface

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @js.native
  sealed trait Corner extends StObject
  /**
    * Enum for representing an element corner for positioning the menu-surface.
    *
    * The START constants map to LEFT if element directionality is left
    * to right and RIGHT if the directionality is right to left.
    * Likewise END maps to RIGHT or LEFT depending on the directionality.
    */
  @JSImport("@material/menu-surface/constants", "Corner")
  @js.native
  object Corner extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Corner & Double] = js.native
    
    @js.native
    sealed trait BOTTOM_END
      extends StObject
         with Corner
    /* 13 */ val BOTTOM_END: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_END & Double = js.native
    
    @js.native
    sealed trait BOTTOM_LEFT
      extends StObject
         with Corner
    /* 1 */ val BOTTOM_LEFT: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_LEFT & Double = js.native
    
    @js.native
    sealed trait BOTTOM_RIGHT
      extends StObject
         with Corner
    /* 5 */ val BOTTOM_RIGHT: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_RIGHT & Double = js.native
    
    @js.native
    sealed trait BOTTOM_START
      extends StObject
         with Corner
    /* 9 */ val BOTTOM_START: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_START & Double = js.native
    
    @js.native
    sealed trait TOP_END
      extends StObject
         with Corner
    /* 12 */ val TOP_END: typings.materialMenuSurface.constantsMod.Corner.TOP_END & Double = js.native
    
    @js.native
    sealed trait TOP_LEFT
      extends StObject
         with Corner
    /* 0 */ val TOP_LEFT: typings.materialMenuSurface.constantsMod.Corner.TOP_LEFT & Double = js.native
    
    @js.native
    sealed trait TOP_RIGHT
      extends StObject
         with Corner
    /* 4 */ val TOP_RIGHT: typings.materialMenuSurface.constantsMod.Corner.TOP_RIGHT & Double = js.native
    
    @js.native
    sealed trait TOP_START
      extends StObject
         with Corner
    /* 8 */ val TOP_START: typings.materialMenuSurface.constantsMod.Corner.TOP_START & Double = js.native
  }
  
  @js.native
  sealed trait CornerBit extends StObject
  /**
    * Enum for bits in the {@see Corner) bitmap.
    */
  @JSImport("@material/menu-surface/constants", "CornerBit")
  @js.native
  object CornerBit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CornerBit & Double] = js.native
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with CornerBit
    /* 1 */ val BOTTOM: typings.materialMenuSurface.constantsMod.CornerBit.BOTTOM & Double = js.native
    
    @js.native
    sealed trait CENTER
      extends StObject
         with CornerBit
    /* 2 */ val CENTER: typings.materialMenuSurface.constantsMod.CornerBit.CENTER & Double = js.native
    
    @js.native
    sealed trait FLIP_RTL
      extends StObject
         with CornerBit
    /* 8 */ val FLIP_RTL: typings.materialMenuSurface.constantsMod.CornerBit.FLIP_RTL & Double = js.native
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with CornerBit
    /* 4 */ val RIGHT: typings.materialMenuSurface.constantsMod.CornerBit.RIGHT & Double = js.native
  }
  
  object cssClasses {
    
    @JSImport("@material/menu-surface/constants", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu-surface/constants", "cssClasses.ANCHOR")
    @js.native
    def ANCHOR: String = js.native
    inline def ANCHOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANCHOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface/constants", "cssClasses.ANIMATING_CLOSED")
    @js.native
    def ANIMATING_CLOSED: String = js.native
    inline def ANIMATING_CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface/constants", "cssClasses.ANIMATING_OPEN")
    @js.native
    def ANIMATING_OPEN: String = js.native
    inline def ANIMATING_OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface/constants", "cssClasses.FIXED")
    @js.native
    def FIXED: String = js.native
    inline def FIXED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface/constants", "cssClasses.IS_OPEN_BELOW")
    @js.native
    def IS_OPEN_BELOW: String = js.native
    inline def IS_OPEN_BELOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_OPEN_BELOW")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface/constants", "cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    inline def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface/constants", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/menu-surface/constants", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Ratio of anchor width to menu-surface width for switching from corner
      * positioning to center positioning.
      */
    @JSImport("@material/menu-surface/constants", "numbers.ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO")
    @js.native
    def ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double = js.native
    inline def ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO")(x.asInstanceOf[js.Any])
    
    /**
      * Margin left to the edge of the viewport when menu-surface is at maximum
      * possible height. Also used as a viewport margin.
      */
    @JSImport("@material/menu-surface/constants", "numbers.MARGIN_TO_EDGE")
    @js.native
    def MARGIN_TO_EDGE: Double = js.native
    inline def MARGIN_TO_EDGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARGIN_TO_EDGE")(x.asInstanceOf[js.Any])
    
    /**
      * Amount of time to wait before restoring focus when closing the menu
      * surface. This is important because if a touch event triggered the menu
      * close, and the subsequent mouse event occurs after focus is restored, then
      * the restored focus would be lost.
      */
    @JSImport("@material/menu-surface/constants", "numbers.TOUCH_EVENT_WAIT_MS")
    @js.native
    def TOUCH_EVENT_WAIT_MS: Double = js.native
    inline def TOUCH_EVENT_WAIT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_EVENT_WAIT_MS")(x.asInstanceOf[js.Any])
    
    /** Total duration of menu-surface close animation. */
    @JSImport("@material/menu-surface/constants", "numbers.TRANSITION_CLOSE_DURATION")
    @js.native
    def TRANSITION_CLOSE_DURATION: Double = js.native
    inline def TRANSITION_CLOSE_DURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_CLOSE_DURATION")(x.asInstanceOf[js.Any])
    
    /** Total duration of menu-surface open animation. */
    @JSImport("@material/menu-surface/constants", "numbers.TRANSITION_OPEN_DURATION")
    @js.native
    def TRANSITION_OPEN_DURATION: Double = js.native
    inline def TRANSITION_OPEN_DURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_OPEN_DURATION")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/menu-surface/constants", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/menu-surface/constants", "strings.CLOSED_EVENT")
    @js.native
    def CLOSED_EVENT: String = js.native
    inline def CLOSED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface/constants", "strings.CLOSING_EVENT")
    @js.native
    def CLOSING_EVENT: String = js.native
    inline def CLOSING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface/constants", "strings.FOCUSABLE_ELEMENTS")
    @js.native
    def FOCUSABLE_ELEMENTS: String = js.native
    inline def FOCUSABLE_ELEMENTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSABLE_ELEMENTS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface/constants", "strings.OPENED_EVENT")
    @js.native
    def OPENED_EVENT: String = js.native
    inline def OPENED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/menu-surface/constants", "strings.OPENING_EVENT")
    @js.native
    def OPENING_EVENT: String = js.native
    inline def OPENING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING_EVENT")(x.asInstanceOf[js.Any])
  }
}
