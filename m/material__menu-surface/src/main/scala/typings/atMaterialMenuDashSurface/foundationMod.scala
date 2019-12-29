package typings.atMaterialMenuDashSurface

import typings.atMaterialBase.foundationMod.MDCFoundation
import typings.atMaterialMenuDashSurface.adapterMod.MDCMenuSurfaceAdapter
import typings.atMaterialMenuDashSurface.constantsMod.Corner
import typings.atMaterialMenuDashSurface.typesMod.MDCMenuDistance
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/menu-surface/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCMenuSurfaceFoundation () extends MDCFoundation[MDCMenuSurfaceAdapter] {
    def this(adapter: Partial[MDCMenuSurfaceAdapter]) = this()
    /**
      * Closes the menu surface.
      */
    def close(): Unit = js.native
    def close(skipRestoreFocus: Boolean): Unit = js.native
    // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /** Handle clicks and close if not within menu-surface element. */
    def handleBodyClick(evt: MouseEvent): Unit = js.native
    /** Handle keys that close the surface. */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    // Subclasses should override this method to perform initialization routines (registering events, etc.)
    /* CompleteClass */
    override def init(): Unit = js.native
    def isOpen(): Boolean = js.native
    /**
      * Open the menu surface.
      */
    def open(): Unit = js.native
    /** Sets the menu-surface position on the page. */
    def setAbsolutePosition(x: Double, y: Double): Unit = js.native
    /**
      * @param corner Default anchor corner alignment of top-left menu surface corner.
      */
    def setAnchorCorner(corner: Corner): Unit = js.native
    /**
      * @param margin Set of margin values from anchor.
      */
    def setAnchorMargin(margin: Partial[MDCMenuDistance]): Unit = js.native
    /** Used to set the menu-surface calculations based on a fixed position menu. */
    def setFixedPosition(isFixedPosition: Boolean): Unit = js.native
    /** Used to indicate if the menu-surface is hoisted to the body. */
    def setIsHoisted(isHoisted: Boolean): Unit = js.native
    def setQuickOpen(quickOpen: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCMenuSurfaceFoundation {
    def this(adapter: Partial[MDCMenuSurfaceAdapter]) = this()
  }
  
  /* static members */
  @js.native
  object MDCMenuSurfaceFoundation extends js.Object {
    val Corner: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Corner */ js.Any = js.native
    val cssClasses: Anon_ANCHOR = js.native
    /**
      * @see {@link MDCMenuSurfaceAdapter} for typing information on parameters and return types.
      */
    val defaultAdapter: MDCMenuSurfaceAdapter = js.native
    val numbers: Anon_ANCHORTOMENUSURFACEWIDTHRATIO = js.native
    val strings: Anon_CLOSEDEVENT = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val Corner: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Corner */ js.Any = js.native
    val cssClasses: Anon_ANCHOR = js.native
    /**
      * @see {@link MDCMenuSurfaceAdapter} for typing information on parameters and return types.
      */
    val defaultAdapter: MDCMenuSurfaceAdapter = js.native
    val numbers: Anon_ANCHORTOMENUSURFACEWIDTHRATIO = js.native
    val strings: Anon_CLOSEDEVENT = js.native
  }
  
}

