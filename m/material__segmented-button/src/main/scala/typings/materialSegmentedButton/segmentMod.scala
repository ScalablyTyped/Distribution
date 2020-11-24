package typings.materialSegmentedButton

import typings.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import typings.materialSegmentedButton.segmentAdapterMod.MDCSegmentedButtonSegmentAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/segmented-button/segment", JSImport.Namespace)
@js.native
object segmentMod extends js.Object {
  
  @js.native
  class MDCSegmentedButtonSegment ()
    extends typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment
  /* static members */
  @js.native
  object MDCSegmentedButtonSegment extends js.Object {
    
    def attachTo(root: Element): typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = js.native
  }
  
  @js.native
  class MDCSegmentedButtonSegmentFoundation ()
    extends typings.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
  /* static members */
  @js.native
  object MDCSegmentedButtonSegmentFoundation extends js.Object {
    
    def defaultAdapter: MDCSegmentedButtonSegmentAdapter = js.native
  }
}
