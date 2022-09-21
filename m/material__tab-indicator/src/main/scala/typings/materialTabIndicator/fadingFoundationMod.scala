package typings.materialTabIndicator

import typings.materialTabIndicator.anon.PartialMDCTabIndicatorAda
import typings.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fadingFoundationMod {
  
  @JSImport("@material/tab-indicator/fading-foundation", JSImport.Default)
  @js.native
  open class default () extends MDCFadingTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("@material/tab-indicator/fading-foundation", "MDCFadingTabIndicatorFoundation")
  @js.native
  open class MDCFadingTabIndicatorFoundation () extends MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
}
