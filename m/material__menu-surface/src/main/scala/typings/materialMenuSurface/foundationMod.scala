package typings.materialMenuSurface

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialMenuSurface.adapterMod.MDCMenuSurfaceAdapter
import typings.materialMenuSurface.anon.PartialMDCMenuDistance
import typings.materialMenuSurface.anon.PartialMDCMenuSurfaceAdap
import typings.materialMenuSurface.constantsMod.Corner
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/menu-surface/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCMenuSurfaceFoundation {
    def this(adapter: PartialMDCMenuSurfaceAdap) = this()
  }
  
  @JSImport("@material/menu-surface/foundation", "MDCMenuSurfaceFoundation")
  @js.native
  open class MDCMenuSurfaceFoundation () extends MDCFoundation[MDCMenuSurfaceAdapter] {
    def this(adapter: PartialMDCMenuSurfaceAdap) = this()
    
    /**
      * Calculates the offsets for positioning the menu-surface when the
      * menu-surface has been hoisted to the body.
      */
    /* private */ var adjustPositionForHoistedElement: Any = js.native
    
    /* private */ var anchorCorner: Any = js.native
    
    /* private */ val anchorMargin: Any = js.native
    
    /* private */ var animationRequestId: Any = js.native
    
    /* private */ var autoposition: Any = js.native
    
    /**
      * Closes the menu surface.
      */
    def close(): Unit = js.native
    def close(skipRestoreFocus: Boolean): Unit = js.native
    
    /* private */ var closeAnimationEndTimerId: Any = js.native
    
    /* private */ var dimensions: Any = js.native
    
    /**
      * Flip menu corner horizontally.
      */
    def flipCornerHorizontally(): Unit = js.native
    
    /**
      * @return Measurements used to position menu surface popup.
      */
    /* private */ var getAutoLayoutmeasurements: Any = js.native
    
    /**
      * @param corner Origin corner of the menu surface.
      * @return Horizontal offset of menu surface origin corner from corresponding
      *     anchor corner.
      */
    /* private */ var getHorizontalOriginOffset: Any = js.native
    
    /**
      * @param corner Origin corner of the menu surface.
      * @return Maximum height of the menu surface, based on available space. 0
      *     indicates should not be set.
      */
    /* private */ var getMenuSurfaceMaxHeight: Any = js.native
    
    /**
      * @param corner Origin corner of the menu surface.
      * @return Vertical offset of menu surface origin corner from corresponding
      *     anchor corner.
      */
    /* private */ var getVerticalOriginOffset: Any = js.native
    
    /**
      * Computes the corner of the anchor from which to animate and position the
      * menu surface.
      *
      * Only LEFT or RIGHT bit is used to position the menu surface ignoring RTL
      * context. E.g., menu surface will be positioned from right side on TOP_END.
      */
    /* private */ var getoriginCorner: Any = js.native
    
    /** Handle clicks and close if not within menu-surface element. */
    def handleBodyClick(evt: MouseEvent): Unit = js.native
    
    /** Handle keys that close the surface. */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    /* private */ var hasBit: Any = js.native
    
    /**
      * isFinite that doesn't force conversion to number type.
      * Equivalent to Number.isFinite in ES2015, which is not supported in IE.
      */
    /* private */ var isFinite: Any = js.native
    
    /**
      * @return Returns true if menu is in fixed (`position: fixed`) position.
      */
    def isFixed(): Boolean = js.native
    
    /* private */ var isFixedPosition: Any = js.native
    
    /* private */ var isHoistedElement: Any = js.native
    
    /* private */ var isHorizontallyCenteredOnViewport: Any = js.native
    
    def isOpen(): Boolean = js.native
    
    /* private */ var isQuickOpen: Any = js.native
    
    /* private */ var isSurfaceOpen: Any = js.native
    
    /* private */ var maxHeight: Any = js.native
    
    /**
      * The last focused element when the menu surface was opened should regain
      * focus, if the user is focused on or within the menu surface when it is
      * closed.
      */
    /* private */ var maybeRestoreFocus: Any = js.native
    
    /* private */ var measurements: Any = js.native
    
    /**
      * Open the menu surface.
      */
    def open(): Unit = js.native
    
    /* private */ var openAnimationEndTimerId: Any = js.native
    
    /* private */ var openBottomBias: Any = js.native
    
    /**
      * Corner of the menu surface to which menu surface is attached to anchor.
      *
      *  Anchor corner --->+----------+
      *                    |  ANCHOR  |
      *                    +----------+
      *  Origin corner --->+--------------+
      *                    |              |
      *                    |              |
      *                    | MENU SURFACE |
      *                    |              |
      *                    |              |
      *                    +--------------+
      */
    /* private */ var originCorner: Any = js.native
    
    /* private */ val position: Any = js.native
    
    /** Sets the menu-surface position on the page. */
    def setAbsolutePosition(x: Double, y: Double): Unit = js.native
    
    /**
      * @param corner Default anchor corner alignment of top-left menu surface
      *     corner.
      */
    def setAnchorCorner(corner: Corner): Unit = js.native
    
    /**
      * @param margin Set of margin values from anchor.
      */
    def setAnchorMargin(margin: PartialMDCMenuDistance): Unit = js.native
    
    /* private */ var setBit: Any = js.native
    
    /**
      * Used to set the menu-surface calculations based on a fixed position menu.
      */
    def setFixedPosition(isFixedPosition: Boolean): Unit = js.native
    
    /** Used to indicate if the menu-surface is hoisted to the body. */
    def setIsHoisted(isHoisted: Boolean): Unit = js.native
    
    /** Sets whether menu-surface should be horizontally centered to viewport. */
    def setIsHorizontallyCenteredOnViewport(isCentered: Boolean): Unit = js.native
    
    /**
      * Sets maximum menu-surface height on open.
      * @param maxHeight The desired max-height. Set to 0 (default) to
      *     automatically calculate max height based on available viewport space.
      */
    def setMaxHeight(maxHeight: Double): Unit = js.native
    
    /**
      * Set to a positive integer to influence the menu to preferentially open
      * below the anchor instead of above.
      * @param bias A value of `x` simulates an extra `x` pixels of available space
      *     below the menu during positioning calculations.
      */
    def setOpenBottomBias(bias: Double): Unit = js.native
    
    def setQuickOpen(quickOpen: Boolean): Unit = js.native
    
    /* private */ var unsetBit: Any = js.native
  }
}
