package typings.grommet

import typings.grommet.utilsMod.A11yTitleType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeInputMod {
  
  @JSImport("grommet/components/RangeInput", "RangeInput")
  @js.native
  val RangeInput: FC[
    RangeInputProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])
  ] = js.native
  
  trait RangeInputProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double | String] = js.undefined
    
    var min: js.UndefOr[Double | String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object RangeInputProps {
    
    @scala.inline
    def apply(): RangeInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeInputProps]
    }
    
    @scala.inline
    implicit class RangeInputPropsMutableBuilder[Self <: RangeInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
