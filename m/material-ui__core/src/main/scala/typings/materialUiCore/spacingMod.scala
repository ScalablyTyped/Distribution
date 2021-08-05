package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacingMod extends Shortcut {
  
  @JSImport("@material-ui/core/styles/spacing", JSImport.Default)
  @js.native
  val default: Spacing = js.native
  
  trait Spacing extends StObject {
    
    var unit: Double
  }
  object Spacing {
    
    inline def apply(unit: Double): Spacing = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spacing]
    }
    
    extension [Self <: Spacing](x: Self) {
      
      inline def setUnit(value: Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/spacing.Spacing> */
  trait SpacingOptions extends StObject {
    
    var unit: js.UndefOr[Double] = js.undefined
  }
  object SpacingOptions {
    
    inline def apply(): SpacingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpacingOptions]
    }
    
    extension [Self <: SpacingOptions](x: Self) {
      
      inline def setUnit(value: Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  type _To = Spacing
  
  /* This means you don't have to write `default`, but can instead just say `spacingMod.foo` */
  override def _to: Spacing = default
}
