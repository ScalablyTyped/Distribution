package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSpacingMod {
  
  @JSImport("@material-ui/core/styles/createSpacing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(spacing: SpacingOptions): Spacing = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(spacing.asInstanceOf[js.Any]).asInstanceOf[Spacing]
  
  @js.native
  trait Spacing extends StObject {
    
    def apply(): Double = js.native
    def apply(topBottom: SpacingArgument, rightLeft: SpacingArgument): String = js.native
    def apply(top: SpacingArgument, rightLeft: SpacingArgument, bottom: SpacingArgument): String = js.native
    def apply(top: SpacingArgument, right: SpacingArgument, bottom: SpacingArgument, left: SpacingArgument): String = js.native
    def apply(value: Double): Double = js.native
  }
  
  type SpacingArgument = Double | String
  
  type SpacingOptions = Double | (js.Function1[/* factor */ Double, String | Double]) | js.Array[Double]
}
