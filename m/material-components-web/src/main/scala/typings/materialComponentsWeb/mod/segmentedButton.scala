package typings.materialComponentsWeb.mod

import typings.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedButton {
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButton")
  @js.native
  class MDCSegmentedButton protected ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButton {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButton {
    
    @JSImport("material-components-web", "segmentedButton.MDCSegmentedButton.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialSegmentedButton.componentMod.MDCSegmentedButton = js.native
  }
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonFoundation")
  @js.native
  class MDCSegmentedButtonFoundation ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonSegment")
  @js.native
  class MDCSegmentedButtonSegment protected ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButtonSegment {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButtonSegment {
    
    @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonSegment.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = js.native
  }
  
  @JSImport("material-components-web", "segmentedButton.MDCSegmentedButtonSegmentFoundation")
  @js.native
  class MDCSegmentedButtonSegmentFoundation ()
    extends typings.materialSegmentedButton.mod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
}
