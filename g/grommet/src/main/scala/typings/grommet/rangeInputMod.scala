package typings.grommet

import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.ColorType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeInputMod {
  
  @JSImport("grommet/components/RangeInput", "RangeInput")
  @js.native
  val RangeInput: FC[RangeInputExtendedProps] = js.native
  
  trait ColorInterface extends StObject {
    
    var color: ColorType
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var value: Double
  }
  object ColorInterface {
    
    inline def apply(value: Double): ColorInterface = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorInterface]
    }
    
    extension [Self <: ColorInterface](x: Self) {
      
      inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'color' | 'step' | 'value'> ]: react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait RangeInputExtendedProps
    extends StObject
       with RangeInputProps
  object RangeInputExtendedProps {
    
    inline def apply(): RangeInputExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeInputExtendedProps]
    }
  }
  
  trait RangeInputProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var color: js.UndefOr[ColorType | js.Array[ColorInterface]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object RangeInputProps {
    
    inline def apply(): RangeInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeInputProps]
    }
    
    extension [Self <: RangeInputProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setColor(value: ColorType | js.Array[ColorInterface]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: ColorInterface*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
