package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedButton {
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButton")
  @js.native
  open class MDCSegmentedButton protected ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButton {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButton {
    
    @JSImport("material-components-web", "segmentedButton.MDCSegmentedButton")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSegmentedButton.componentMod.MDCSegmentedButton = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSegmentedButton.componentMod.MDCSegmentedButton]
  }
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonFoundation")
  @js.native
  open class MDCSegmentedButtonFoundation ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonSegment")
  @js.native
  open class MDCSegmentedButtonSegment protected ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButtonSegment {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButtonSegment {
    
    @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonSegment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment]
  }
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonSegmentFoundation")
  @js.native
  open class MDCSegmentedButtonSegmentFoundation ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
}
