package typings.materialSegmentedButton

import typings.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentIndexMod {
  
  @JSImport("@material/segmented-button/segment/index", "MDCSegmentedButtonSegment")
  @js.native
  class MDCSegmentedButtonSegment protected ()
    extends typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButtonSegment {
    
    @JSImport("@material/segmented-button/segment/index", "MDCSegmentedButtonSegment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment]
  }
  
  @JSImport("@material/segmented-button/segment/index", "MDCSegmentedButtonSegmentFoundation")
  @js.native
  class MDCSegmentedButtonSegmentFoundation ()
    extends typings.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
}
