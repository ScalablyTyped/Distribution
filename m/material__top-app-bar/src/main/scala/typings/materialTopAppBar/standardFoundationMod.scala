package typings.materialTopAppBar

import typings.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import typings.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object standardFoundationMod {
  
  @JSImport("@material/top-app-bar/standard/foundation", JSImport.Default)
  @js.native
  class default () extends MDCTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @JSImport("@material/top-app-bar/standard/foundation", "MDCTopAppBarFoundation")
  @js.native
  class MDCTopAppBarFoundation () extends MDCTopAppBarBaseFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
}
