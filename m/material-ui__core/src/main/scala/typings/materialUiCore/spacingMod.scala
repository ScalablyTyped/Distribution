package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacingMod extends Shortcut {
  
  @JSImport("@material-ui/core/styles/spacing", JSImport.Default)
  @js.native
  val default: Spacing = js.native
  
  @js.native
  trait Spacing extends StObject {
    
    var unit: Double = js.native
  }
  object Spacing {
    
    @scala.inline
    def apply(unit: Double): Spacing = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spacing]
    }
    
    @scala.inline
    implicit class SpacingMutableBuilder[Self <: Spacing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnit(value: Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/spacing.Spacing> */
  @js.native
  trait SpacingOptions extends StObject {
    
    var unit: js.UndefOr[Double] = js.native
  }
  object SpacingOptions {
    
    @scala.inline
    def apply(): SpacingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpacingOptions]
    }
    
    @scala.inline
    implicit class SpacingOptionsMutableBuilder[Self <: SpacingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnit(value: Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  type _To = Spacing
  
  /* This means you don't have to write `default`, but can instead just say `spacingMod.foo` */
  override def _to: Spacing = default
}
