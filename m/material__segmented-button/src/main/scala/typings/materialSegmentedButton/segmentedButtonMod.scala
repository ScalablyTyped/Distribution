package typings.materialSegmentedButton

import typings.materialBase.Element
import typings.materialSegmentedButton.anon.PartialMDCSegmentedButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedButtonMod {
  
  @JSImport("@material/segmented-button/segmented-button", "MDCSegmentedButton")
  @js.native
  open class MDCSegmentedButton protected ()
    extends typings.materialSegmentedButton.componentMod.MDCSegmentedButton {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButton {
    
    @JSImport("@material/segmented-button/segmented-button", "MDCSegmentedButton")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSegmentedButton.componentMod.MDCSegmentedButton = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSegmentedButton.componentMod.MDCSegmentedButton]
  }
  
  @JSImport("@material/segmented-button/segmented-button", "MDCSegmentedButtonFoundation")
  @js.native
  open class MDCSegmentedButtonFoundation ()
    extends typings.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
}
