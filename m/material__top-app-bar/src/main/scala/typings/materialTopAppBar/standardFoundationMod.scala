package typings.materialTopAppBar

import typings.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import typings.materialTopAppBar.foundationMod.MDCTopAppBarBaseFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object standardFoundationMod {
  
  @JSImport("@material/top-app-bar/standard/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @JSImport("@material/top-app-bar/standard/foundation", "MDCTopAppBarFoundation")
  @js.native
  open class MDCTopAppBarFoundation () extends MDCTopAppBarBaseFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
    
    /**
      * Function to determine if the DOM needs to update.
      */
    /* private */ var checkForUpdate: Any = js.native
    
    /**
      * Variable for current scroll position of the top app bar
      */
    /* private */ var currentAppBarOffsetTop: Any = js.native
    
    /**
      * Used to prevent the top app bar from being scrolled out of view during resize events
      */
    /* private */ var isCurrentlyBeingResized: Any = js.native
    
    /**
      * Indicates if the top app bar is docked in the fully shown position.
      */
    /* private */ var isDockedShowing: Any = js.native
    
    /**
      * Used for diffs of current scroll position vs previous scroll position
      */
    /* private */ var lastScrollPosition: Any = js.native
    
    /**
      * Function to move the top app bar if needed.
      */
    /* private */ var moveTopAppBar: Any = js.native
    
    /**
      * The timeout that's used to debounce toggling the isCurrentlyBeingResized
      * variable after a resize
      */
    /* private */ var resizeDebounceId: Any = js.native
    
    /**
      * The timeout that's used to throttle the resize events
      */
    /* private */ var resizeThrottleId: Any = js.native
    
    /**
      * Throttled function that updates the top app bar scrolled values if the
      * top app bar height changes.
      */
    /* private */ var throttledResizeHandler: Any = js.native
    
    /**
      * Used to verify when the top app bar is completely showing or completely hidden
      */
    /* private */ var topAppBarHeight: Any = js.native
    
    /**
      * Indicates if the top app bar was docked in the previous scroll handler iteration.
      */
    /* private */ var wasDocked: Any = js.native
  }
}
