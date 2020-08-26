package typings.materialTopAppBar

import typings.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import typings.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar/short/foundation", JSImport.Namespace)
@js.native
object shortFoundationMod extends js.Object {
  @js.native
  class MDCShortTopAppBarFoundation () extends MDCTopAppBarBaseFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
    def getAlwaysCollapsed(): Boolean = js.native
    def isCollapsed: Boolean = js.native
    /**
      * Set if the short top app bar should always be collapsed.
      *
      * @param value When `true`, bar will always be collapsed. When `false`, bar may collapse or expand based on scroll.
      */
    def setAlwaysCollapsed(value: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCShortTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
}

