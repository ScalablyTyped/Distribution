package typings.materialSegmentedButton

import typings.materialBase.Element
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/segmented-button", "MDCSegmentedButton")
  @js.native
  open class MDCSegmentedButton protected ()
    extends typings.materialSegmentedButton.segmentedButtonMod.MDCSegmentedButton {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.segmentedButtonFoundationMod.MDCSegmentedButtonFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButton {
    
    @JSImport("@material/segmented-button", "MDCSegmentedButton")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSegmentedButton.segmentedButtonComponentMod.MDCSegmentedButton = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSegmentedButton.segmentedButtonComponentMod.MDCSegmentedButton]
  }
  
  @JSImport("@material/segmented-button", "MDCSegmentedButtonFoundation")
  @js.native
  open class MDCSegmentedButtonFoundation ()
    extends typings.materialSegmentedButton.segmentedButtonMod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
  
  @JSImport("@material/segmented-button", "MDCSegmentedButtonSegment")
  @js.native
  open class MDCSegmentedButtonSegment protected ()
    extends typings.materialSegmentedButton.segmentMod.MDCSegmentedButtonSegment {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButtonSegment {
    
    @JSImport("@material/segmented-button", "MDCSegmentedButtonSegment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment]
  }
  
  @JSImport("@material/segmented-button", "MDCSegmentedButtonSegmentFoundation")
  @js.native
  open class MDCSegmentedButtonSegmentFoundation ()
    extends typings.materialSegmentedButton.segmentMod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
}
