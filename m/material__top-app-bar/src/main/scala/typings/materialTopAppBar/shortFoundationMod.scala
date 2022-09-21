package typings.materialTopAppBar

import typings.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import typings.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortFoundationMod {
  
  @JSImport("@material/top-app-bar/short/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCShortTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @JSImport("@material/top-app-bar/short/foundation", "MDCShortTopAppBarFoundation")
  @js.native
  open class MDCShortTopAppBarFoundation () extends MDCTopAppBarBaseFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
    
    /* private */ var collapse: Any = js.native
    
    /* private */ var collapsed: Any = js.native
    
    def getAlwaysCollapsed(): Boolean = js.native
    
    /* private */ var isAlwaysCollapsed: Any = js.native
    
    def isCollapsed: Boolean = js.native
    
    /* private */ var maybeCollapseBar: Any = js.native
    
    /**
      * Set if the short top app bar should always be collapsed.
      *
      * @param value When `true`, bar will always be collapsed. When `false`, bar may collapse or expand based on scroll.
      */
    def setAlwaysCollapsed(value: Boolean): Unit = js.native
    
    /* private */ var uncollapse: Any = js.native
  }
}
