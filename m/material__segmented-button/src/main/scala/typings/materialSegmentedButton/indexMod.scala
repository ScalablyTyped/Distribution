package typings.materialSegmentedButton

import typings.materialSegmentedButton.adapterMod.MDCSegmentedButtonAdapter
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/segmented-button/segmented-button/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  
  @js.native
  class MDCSegmentedButton ()
    extends typings.materialSegmentedButton.componentMod.MDCSegmentedButton
  /* static members */
  @js.native
  object MDCSegmentedButton extends js.Object {
    
    def attachTo(root: Element): typings.materialSegmentedButton.componentMod.MDCSegmentedButton = js.native
  }
  
  @js.native
  class MDCSegmentedButtonFoundation ()
    extends typings.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
  /* static members */
  @js.native
  object MDCSegmentedButtonFoundation extends js.Object {
    
    def defaultAdapter: MDCSegmentedButtonAdapter = js.native
  }
}
