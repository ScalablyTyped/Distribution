package typings.materialTopAppBar

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTopAppBar.adapterMod.MDCTopAppBarAdapter
import typings.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/top-app-bar/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTopAppBarBaseFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @JSImport("@material/top-app-bar/foundation", "MDCTopAppBarBaseFoundation")
  @js.native
  open class MDCTopAppBarBaseFoundation () extends MDCFoundation[MDCTopAppBarAdapter] {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
    
    def handleNavigationClick(): Unit = js.native
    
    /** Other variants of TopAppBar foundation overrides this method */
    def handleTargetScroll(): Unit = js.native
    
    /** Other variants of TopAppBar foundation overrides this method */
    def handleWindowResize(): Unit = js.native
  }
}
