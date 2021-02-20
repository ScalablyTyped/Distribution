package typings.materialSegmentedButton

import typings.materialSegmentedButton.anon.PartialMDCSegmentedButton
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@material/segmented-button/segmented-button/index", "MDCSegmentedButton")
  @js.native
  class MDCSegmentedButton protected ()
    extends typings.materialSegmentedButton.componentMod.MDCSegmentedButton {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButton {
    
    @JSImport("@material/segmented-button/segmented-button/index", "MDCSegmentedButton.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialSegmentedButton.componentMod.MDCSegmentedButton = js.native
  }
  
  @JSImport("@material/segmented-button/segmented-button/index", "MDCSegmentedButtonFoundation")
  @js.native
  class MDCSegmentedButtonFoundation ()
    extends typings.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation {
    def this(adapter: PartialMDCSegmentedButton) = this()
  }
}
