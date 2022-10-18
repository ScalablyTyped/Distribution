package typings.materialTooltip

import typings.materialBase.Element
import typings.materialTooltip.anon.PartialMDCTooltipAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/tooltip", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialTooltip.foundationMod.default {
    def this(adapter: PartialMDCTooltipAdapter) = this()
  }
  
  /**
    * Enum for possible anchor boundary types. This determines the gap between the
    * bottom of the anchor and the tooltip element.
    * Bounded anchors have an identifiable boundary (e.g. buttons).
    * Unbounded anchors don't have a visually declared boundary (e.g. plain text).
    */
  @JSImport("@material/tooltip", "AnchorBoundaryType")
  @js.native
  object AnchorBoundaryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialTooltip.constantsMod.AnchorBoundaryType & Double] = js.native
    
    /* 0 */ val BOUNDED: typings.materialTooltip.constantsMod.AnchorBoundaryType.BOUNDED & Double = js.native
    
    /* 1 */ val UNBOUNDED: typings.materialTooltip.constantsMod.AnchorBoundaryType.UNBOUNDED & Double = js.native
  }
  
  @JSImport("@material/tooltip", "CssClasses")
  @js.native
  object CssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialTooltip.constantsMod.CssClasses & String] = js.native
    
    /* "mdc-tooltip--hide" */ val HIDE: typings.materialTooltip.constantsMod.CssClasses.HIDE & String = js.native
    
    /* "mdc-tooltip--hide-transition" */ val HIDE_TRANSITION: typings.materialTooltip.constantsMod.CssClasses.HIDE_TRANSITION & String = js.native
    
    /* "mdc-tooltip--multiline" */ val MULTILINE_TOOLTIP: typings.materialTooltip.constantsMod.CssClasses.MULTILINE_TOOLTIP & String = js.native
    
    /* "mdc-tooltip--rich" */ val RICH: typings.materialTooltip.constantsMod.CssClasses.RICH & String = js.native
    
    /* "mdc-tooltip--showing" */ val SHOWING: typings.materialTooltip.constantsMod.CssClasses.SHOWING & String = js.native
    
    /* "mdc-tooltip--showing-transition" */ val SHOWING_TRANSITION: typings.materialTooltip.constantsMod.CssClasses.SHOWING_TRANSITION & String = js.native
    
    /* "mdc-tooltip--shown" */ val SHOWN: typings.materialTooltip.constantsMod.CssClasses.SHOWN & String = js.native
    
    /* "mdc-tooltip__surface" */ val SURFACE: typings.materialTooltip.constantsMod.CssClasses.SURFACE & String = js.native
    
    /* "mdc-tooltip__surface-animation" */ val SURFACE_ANIMATION: typings.materialTooltip.constantsMod.CssClasses.SURFACE_ANIMATION & String = js.native
    
    /* "mdc-tooltip__caret-surface-bottom" */ val TOOLTIP_CARET_BOTTOM: typings.materialTooltip.constantsMod.CssClasses.TOOLTIP_CARET_BOTTOM & String = js.native
    
    /* "mdc-tooltip__caret-surface-top" */ val TOOLTIP_CARET_TOP: typings.materialTooltip.constantsMod.CssClasses.TOOLTIP_CARET_TOP & String = js.native
  }
  
  @JSImport("@material/tooltip", "MDCTooltip")
  @js.native
  open class MDCTooltip protected ()
    extends typings.materialTooltip.componentMod.MDCTooltip {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialTooltip.foundationMod.MDCTooltipFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCTooltip {
    
    @JSImport("@material/tooltip", "MDCTooltip")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTooltip.componentMod.MDCTooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTooltip.componentMod.MDCTooltip]
  }
  
  @JSImport("@material/tooltip", "MDCTooltipFoundation")
  @js.native
  open class MDCTooltipFoundation ()
    extends typings.materialTooltip.foundationMod.MDCTooltipFoundation {
    def this(adapter: PartialMDCTooltipAdapter) = this()
  }
  
  /**
    * Enum for possible positions of a tooltip with caret (this specifies the
    * positioning of the tooltip relative to the anchor -- the position of the
    * caret will follow that of the tooltip). This can NOT be combined with the
    * above X/YPosition options. Naming for the enums follows: (vertical
    * placement)_(horizontal placement).
    */
  @JSImport("@material/tooltip", "PositionWithCaret")
  @js.native
  object PositionWithCaret extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialTooltip.constantsMod.PositionWithCaret & Double] = js.native
    
    /* 2 */ val ABOVE_CENTER: typings.materialTooltip.constantsMod.PositionWithCaret.ABOVE_CENTER & Double = js.native
    
    /* 3 */ val ABOVE_END: typings.materialTooltip.constantsMod.PositionWithCaret.ABOVE_END & Double = js.native
    
    /* 1 */ val ABOVE_START: typings.materialTooltip.constantsMod.PositionWithCaret.ABOVE_START & Double = js.native
    
    /* 11 */ val BELOW_CENTER: typings.materialTooltip.constantsMod.PositionWithCaret.BELOW_CENTER & Double = js.native
    
    /* 12 */ val BELOW_END: typings.materialTooltip.constantsMod.PositionWithCaret.BELOW_END & Double = js.native
    
    /* 10 */ val BELOW_START: typings.materialTooltip.constantsMod.PositionWithCaret.BELOW_START & Double = js.native
    
    /* 9 */ val BOTTOM_SIDE_END: typings.materialTooltip.constantsMod.PositionWithCaret.BOTTOM_SIDE_END & Double = js.native
    
    /* 6 */ val BOTTOM_SIDE_START: typings.materialTooltip.constantsMod.PositionWithCaret.BOTTOM_SIDE_START & Double = js.native
    
    /* 8 */ val CENTER_SIDE_END: typings.materialTooltip.constantsMod.PositionWithCaret.CENTER_SIDE_END & Double = js.native
    
    /* 5 */ val CENTER_SIDE_START: typings.materialTooltip.constantsMod.PositionWithCaret.CENTER_SIDE_START & Double = js.native
    
    /* 0 */ val DETECTED: typings.materialTooltip.constantsMod.PositionWithCaret.DETECTED & Double = js.native
    
    /* 7 */ val TOP_SIDE_END: typings.materialTooltip.constantsMod.PositionWithCaret.TOP_SIDE_END & Double = js.native
    
    /* 4 */ val TOP_SIDE_START: typings.materialTooltip.constantsMod.PositionWithCaret.TOP_SIDE_START & Double = js.native
  }
  
  /** Enum for possible tooltip positioning relative to its anchor element. */
  @JSImport("@material/tooltip", "XPosition")
  @js.native
  object XPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialTooltip.constantsMod.XPosition & Double] = js.native
    
    /* 2 */ val CENTER: typings.materialTooltip.constantsMod.XPosition.CENTER & Double = js.native
    
    /* 0 */ val DETECTED: typings.materialTooltip.constantsMod.XPosition.DETECTED & Double = js.native
    
    /* 3 */ val END: typings.materialTooltip.constantsMod.XPosition.END & Double = js.native
    
    /* 1 */ val START: typings.materialTooltip.constantsMod.XPosition.START & Double = js.native
  }
  
  @JSImport("@material/tooltip", "XPositionWithCaret")
  @js.native
  object XPositionWithCaret extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialTooltip.constantsMod.XPositionWithCaret & Double] = js.native
    
    /* 2 */ val CENTER: typings.materialTooltip.constantsMod.XPositionWithCaret.CENTER & Double = js.native
    
    /* 3 */ val END: typings.materialTooltip.constantsMod.XPositionWithCaret.END & Double = js.native
    
    /* 5 */ val SIDE_END: typings.materialTooltip.constantsMod.XPositionWithCaret.SIDE_END & Double = js.native
    
    /* 4 */ val SIDE_START: typings.materialTooltip.constantsMod.XPositionWithCaret.SIDE_START & Double = js.native
    
    /* 1 */ val START: typings.materialTooltip.constantsMod.XPositionWithCaret.START & Double = js.native
  }
  
  @JSImport("@material/tooltip", "YPosition")
  @js.native
  object YPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialTooltip.constantsMod.YPosition & Double] = js.native
    
    /* 1 */ val ABOVE: typings.materialTooltip.constantsMod.YPosition.ABOVE & Double = js.native
    
    /* 2 */ val BELOW: typings.materialTooltip.constantsMod.YPosition.BELOW & Double = js.native
    
    /* 0 */ val DETECTED: typings.materialTooltip.constantsMod.YPosition.DETECTED & Double = js.native
  }
  
  @JSImport("@material/tooltip", "YPositionWithCaret")
  @js.native
  object YPositionWithCaret extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialTooltip.constantsMod.YPositionWithCaret & Double] = js.native
    
    /* 1 */ val ABOVE: typings.materialTooltip.constantsMod.YPositionWithCaret.ABOVE & Double = js.native
    
    /* 2 */ val BELOW: typings.materialTooltip.constantsMod.YPositionWithCaret.BELOW & Double = js.native
    
    /* 5 */ val SIDE_BOTTOM: typings.materialTooltip.constantsMod.YPositionWithCaret.SIDE_BOTTOM & Double = js.native
    
    /* 4 */ val SIDE_CENTER: typings.materialTooltip.constantsMod.YPositionWithCaret.SIDE_CENTER & Double = js.native
    
    /* 3 */ val SIDE_TOP: typings.materialTooltip.constantsMod.YPositionWithCaret.SIDE_TOP & Double = js.native
  }
  
  object attributes {
    
    @JSImport("@material/tooltip", "attributes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tooltip", "attributes.ARIA_EXPANDED")
    @js.native
    def ARIA_EXPANDED: String = js.native
    inline def ARIA_EXPANDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_EXPANDED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "attributes.ARIA_HASPOPUP")
    @js.native
    def ARIA_HASPOPUP: String = js.native
    inline def ARIA_HASPOPUP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HASPOPUP")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "attributes.HAS_CARET")
    @js.native
    def HAS_CARET: String = js.native
    inline def HAS_CARET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HAS_CARET")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "attributes.PERSISTENT")
    @js.native
    def PERSISTENT: String = js.native
    inline def PERSISTENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERSISTENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "attributes.SCROLLABLE_ANCESTOR")
    @js.native
    def SCROLLABLE_ANCESTOR: String = js.native
    inline def SCROLLABLE_ANCESTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLLABLE_ANCESTOR")(x.asInstanceOf[js.Any])
  }
  
  object events {
    
    @JSImport("@material/tooltip", "events")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tooltip", "events.HIDDEN")
    @js.native
    def HIDDEN: String = js.native
    inline def HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/tooltip", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tooltip", "numbers.ANIMATION_SCALE")
    @js.native
    def ANIMATION_SCALE: Double = js.native
    inline def ANIMATION_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATION_SCALE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "numbers.BOUNDED_ANCHOR_GAP")
    @js.native
    def BOUNDED_ANCHOR_GAP: Double = js.native
    inline def BOUNDED_ANCHOR_GAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOUNDED_ANCHOR_GAP")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "numbers.CARET_INDENTATION")
    @js.native
    def CARET_INDENTATION: Double = js.native
    inline def CARET_INDENTATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CARET_INDENTATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "numbers.HIDE_DELAY_MS")
    @js.native
    def HIDE_DELAY_MS: Double = js.native
    inline def HIDE_DELAY_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDE_DELAY_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "numbers.MAX_WIDTH")
    @js.native
    def MAX_WIDTH: Double = js.native
    inline def MAX_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_WIDTH")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "numbers.MIN_HEIGHT")
    @js.native
    def MIN_HEIGHT: Double = js.native
    inline def MIN_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "numbers.MIN_VIEWPORT_TOOLTIP_THRESHOLD")
    @js.native
    def MIN_VIEWPORT_TOOLTIP_THRESHOLD: Double = js.native
    inline def MIN_VIEWPORT_TOOLTIP_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VIEWPORT_TOOLTIP_THRESHOLD")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "numbers.SHOW_DELAY_MS")
    @js.native
    def SHOW_DELAY_MS: Double = js.native
    inline def SHOW_DELAY_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_DELAY_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "numbers.UNBOUNDED_ANCHOR_GAP")
    @js.native
    def UNBOUNDED_ANCHOR_GAP: Double = js.native
    inline def UNBOUNDED_ANCHOR_GAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNBOUNDED_ANCHOR_GAP")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/tooltip", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tooltip", "strings.BOTTOM")
    @js.native
    def BOTTOM: String = js.native
    inline def BOTTOM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "strings.CENTER")
    @js.native
    def CENTER: String = js.native
    inline def CENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "strings.LEFT")
    @js.native
    def LEFT: String = js.native
    inline def LEFT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "strings.RIGHT")
    @js.native
    def RIGHT: String = js.native
    inline def RIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tooltip", "strings.TOP")
    @js.native
    def TOP: String = js.native
    inline def TOP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP")(x.asInstanceOf[js.Any])
  }
}
