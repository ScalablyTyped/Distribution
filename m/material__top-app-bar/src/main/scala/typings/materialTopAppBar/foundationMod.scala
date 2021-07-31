package typings.materialTopAppBar

import typings.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import typings.materialTopAppBar.standardFoundationMod.MDCTopAppBarFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/top-app-bar/fixed/foundation", JSImport.Default)
  @js.native
  class default () extends MDCFixedTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @JSImport("@material/top-app-bar/fixed/foundation", "MDCFixedTopAppBarFoundation")
  @js.native
  class MDCFixedTopAppBarFoundation () extends MDCTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
}
