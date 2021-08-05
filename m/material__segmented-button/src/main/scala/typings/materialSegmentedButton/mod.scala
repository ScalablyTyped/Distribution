package typings.materialSegmentedButton

import typings.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/segmented-button", "MDCSegmentedButton")
  @js.native
  class MDCSegmentedButton protected ()
    extends typings.materialSegmentedButton.indexMod.MDCSegmentedButton {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButton {
    
    @JSImport("@material/segmented-button", "MDCSegmentedButton")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialSegmentedButton.componentMod.MDCSegmentedButton = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSegmentedButton.componentMod.MDCSegmentedButton]
  }
  
  @JSImport("@material/segmented-button", "MDCSegmentedButtonFoundation")
  @js.native
  class MDCSegmentedButtonFoundation ()
    extends typings.materialSegmentedButton.indexMod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
  
  @JSImport("@material/segmented-button", "MDCSegmentedButtonSegment")
  @js.native
  class MDCSegmentedButtonSegment protected ()
    extends typings.materialSegmentedButton.segmentIndexMod.MDCSegmentedButtonSegment {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButtonSegment {
    
    @JSImport("@material/segmented-button", "MDCSegmentedButtonSegment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment]
  }
  
  @JSImport("@material/segmented-button", "MDCSegmentedButtonSegmentFoundation")
  @js.native
  class MDCSegmentedButtonSegmentFoundation ()
    extends typings.materialSegmentedButton.segmentIndexMod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
}
