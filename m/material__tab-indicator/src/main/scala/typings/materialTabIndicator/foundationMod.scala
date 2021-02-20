package typings.materialTabIndicator

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTabIndicator.adapterMod.MDCTabIndicatorAdapter
import typings.materialTabIndicator.anon.PartialMDCTabIndicatorAda
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/tab-indicator/foundation", JSImport.Default)
  @js.native
  abstract class default () extends MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("@material/tab-indicator/foundation", "MDCTabIndicatorFoundation")
  @js.native
  abstract class MDCTabIndicatorFoundation () extends MDCFoundation[MDCTabIndicatorAdapter] {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
    
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: ClientRect): Unit = js.native
    
    def computeContentClientRect(): ClientRect = js.native
    
    def deactivate(): Unit = js.native
  }
}
