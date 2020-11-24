package typings.materialComponentsWeb.mod

import typings.materialSegmentedButton.adapterMod.MDCSegmentedButtonAdapter
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import typings.materialSegmentedButton.segmentAdapterMod.MDCSegmentedButtonSegmentAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "segmentedButton")
@js.native
object segmentedButton extends js.Object {
  
  @js.native
  class MDCSegmentedButton ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButton
  /* static members */
  @js.native
  object MDCSegmentedButton extends js.Object {
    
    def attachTo(root: Element): typings.materialSegmentedButton.componentMod.MDCSegmentedButton = js.native
  }
  
  @js.native
  class MDCSegmentedButtonFoundation ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
  /* static members */
  @js.native
  object MDCSegmentedButtonFoundation extends js.Object {
    
    def defaultAdapter: MDCSegmentedButtonAdapter = js.native
  }
  
  @js.native
  class MDCSegmentedButtonSegment ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButtonSegment
  /* static members */
  @js.native
  object MDCSegmentedButtonSegment extends js.Object {
    
    def attachTo(root: Element): typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = js.native
  }
  
  @js.native
  class MDCSegmentedButtonSegmentFoundation ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
  /* static members */
  @js.native
  object MDCSegmentedButtonSegmentFoundation extends js.Object {
    
    def defaultAdapter: MDCSegmentedButtonSegmentAdapter = js.native
  }
}
