package typings.materialComponentsWeb.mod

import typings.materialTooltip.anon.PartialMDCTooltipAdapter
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltip {
  
  /**
    * Enum for possible anchor boundary types. This determines the gap between the
    * bottom of the anchor and the tooltip element.
    * Bounded anchors have an identifiable boundary (e.g. buttons).
    * Unbounded anchors don't have a visually declared boundary (e.g. plain text).
    */
  @JSImport("material-components-web", "tooltip.AnchorBoundaryType")
  @js.native
  object AnchorBoundaryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialTooltip.constantsMod.AnchorBoundaryType with Double] = js.native
    
    /* 0 */ val BOUNDED: typings.materialTooltip.constantsMod.AnchorBoundaryType.BOUNDED with Double = js.native
    
    /* 1 */ val UNBOUNDED: typings.materialTooltip.constantsMod.AnchorBoundaryType.UNBOUNDED with Double = js.native
  }
  
  /**
    * @license
    * Copyright 2020 Google Inc.
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
  @JSImport("material-components-web", "tooltip.CssClasses")
  @js.native
  object CssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.materialTooltip.constantsMod.CssClasses with String] = js.native
    
    /* "mdc-tooltip--hide" */ val HIDE: typings.materialTooltip.constantsMod.CssClasses.HIDE with String = js.native
    
    /* "mdc-tooltip--hide-transition" */ val HIDE_TRANSITION: typings.materialTooltip.constantsMod.CssClasses.HIDE_TRANSITION with String = js.native
    
    /* "mdc-tooltip--multiline" */ val MULTILINE_TOOLTIP: typings.materialTooltip.constantsMod.CssClasses.MULTILINE_TOOLTIP with String = js.native
    
    /* "mdc-tooltip--showing" */ val SHOWING: typings.materialTooltip.constantsMod.CssClasses.SHOWING with String = js.native
    
    /* "mdc-tooltip--showing-transition" */ val SHOWING_TRANSITION: typings.materialTooltip.constantsMod.CssClasses.SHOWING_TRANSITION with String = js.native
    
    /* "mdc-tooltip--shown" */ val SHOWN: typings.materialTooltip.constantsMod.CssClasses.SHOWN with String = js.native
  }
  
  @JSImport("material-components-web", "tooltip.MDCTooltip")
  @js.native
  class MDCTooltip protected ()
    extends typings.materialTooltip.mod.MDCTooltip {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTooltip.foundationMod.MDCTooltipFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCTooltip {
    
    @JSImport("material-components-web", "tooltip.MDCTooltip.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialTooltip.componentMod.MDCTooltip = js.native
  }
  
  @JSImport("material-components-web", "tooltip.MDCTooltipFoundation")
  @js.native
  class MDCTooltipFoundation ()
    extends typings.materialTooltip.mod.MDCTooltipFoundation {
    def this(adapter: PartialMDCTooltipAdapter) = this()
  }
  
  /** Enum for possible tooltip positioning relative to its anchor element. */
  @JSImport("material-components-web", "tooltip.XPosition")
  @js.native
  object XPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialTooltip.constantsMod.XPosition with Double] = js.native
    
    /* 2 */ val CENTER: typings.materialTooltip.constantsMod.XPosition.CENTER with Double = js.native
    
    /* 0 */ val DETECTED: typings.materialTooltip.constantsMod.XPosition.DETECTED with Double = js.native
    
    /* 3 */ val END: typings.materialTooltip.constantsMod.XPosition.END with Double = js.native
    
    /* 1 */ val START: typings.materialTooltip.constantsMod.XPosition.START with Double = js.native
  }
  
  @JSImport("material-components-web", "tooltip.YPosition")
  @js.native
  object YPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialTooltip.constantsMod.YPosition with Double] = js.native
    
    /* 1 */ val ABOVE: typings.materialTooltip.constantsMod.YPosition.ABOVE with Double = js.native
    
    /* 2 */ val BELOW: typings.materialTooltip.constantsMod.YPosition.BELOW with Double = js.native
    
    /* 0 */ val DETECTED: typings.materialTooltip.constantsMod.YPosition.DETECTED with Double = js.native
  }
  
  object events {
    
    @JSImport("material-components-web", "tooltip.events")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "tooltip.events.HIDDEN")
    @js.native
    def HIDDEN: String = js.native
    @scala.inline
    def HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "tooltip.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "tooltip.numbers.BOUNDED_ANCHOR_GAP")
    @js.native
    def BOUNDED_ANCHOR_GAP: Double = js.native
    @scala.inline
    def BOUNDED_ANCHOR_GAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOUNDED_ANCHOR_GAP")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tooltip.numbers.HIDE_DELAY_MS")
    @js.native
    def HIDE_DELAY_MS: Double = js.native
    @scala.inline
    def HIDE_DELAY_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDE_DELAY_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tooltip.numbers.MAX_WIDTH")
    @js.native
    def MAX_WIDTH: Double = js.native
    @scala.inline
    def MAX_WIDTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_WIDTH")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tooltip.numbers.MIN_HEIGHT")
    @js.native
    def MIN_HEIGHT: Double = js.native
    @scala.inline
    def MIN_HEIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_HEIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tooltip.numbers.MIN_VIEWPORT_TOOLTIP_THRESHOLD")
    @js.native
    def MIN_VIEWPORT_TOOLTIP_THRESHOLD: Double = js.native
    @scala.inline
    def MIN_VIEWPORT_TOOLTIP_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VIEWPORT_TOOLTIP_THRESHOLD")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tooltip.numbers.SHOW_DELAY_MS")
    @js.native
    def SHOW_DELAY_MS: Double = js.native
    @scala.inline
    def SHOW_DELAY_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_DELAY_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tooltip.numbers.UNBOUNDED_ANCHOR_GAP")
    @js.native
    def UNBOUNDED_ANCHOR_GAP: Double = js.native
    @scala.inline
    def UNBOUNDED_ANCHOR_GAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNBOUNDED_ANCHOR_GAP")(x.asInstanceOf[js.Any])
  }
}
