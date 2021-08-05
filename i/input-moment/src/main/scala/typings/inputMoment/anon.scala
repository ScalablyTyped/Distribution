package typings.inputMoment

import typings.inputMoment.mod.OnChangeListener
import typings.inputMoment.mod.OnSaveListener
import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<input-moment.input-moment.InputMomentProps> */
  trait ReadonlyInputMomentProps extends StObject {
    
    val hourStep: js.UndefOr[Double] = js.undefined
    
    val minStep: js.UndefOr[Double] = js.undefined
    
    val moment: Moment
    
    val nextMonthIcon: js.UndefOr[String] = js.undefined
    
    val onChange: js.UndefOr[OnChangeListener] = js.undefined
    
    val onSave: js.UndefOr[OnSaveListener] = js.undefined
    
    val prevMonthIcon: js.UndefOr[String] = js.undefined
  }
  object ReadonlyInputMomentProps {
    
    inline def apply(moment: Moment): ReadonlyInputMomentProps = {
      val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyInputMomentProps]
    }
    
    extension [Self <: ReadonlyInputMomentProps](x: Self) {
      
      inline def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      inline def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      inline def setMinStep(value: Double): Self = StObject.set(x, "minStep", value.asInstanceOf[js.Any])
      
      inline def setMinStepUndefined: Self = StObject.set(x, "minStep", js.undefined)
      
      inline def setMoment(value: Moment): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
      
      inline def setNextMonthIcon(value: String): Self = StObject.set(x, "nextMonthIcon", value.asInstanceOf[js.Any])
      
      inline def setNextMonthIconUndefined: Self = StObject.set(x, "nextMonthIcon", js.undefined)
      
      inline def setOnChange(value: /* m */ Moment => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSave(value: () => Unit): Self = StObject.set(x, "onSave", js.Any.fromFunction0(value))
      
      inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      inline def setPrevMonthIcon(value: String): Self = StObject.set(x, "prevMonthIcon", value.asInstanceOf[js.Any])
      
      inline def setPrevMonthIconUndefined: Self = StObject.set(x, "prevMonthIcon", js.undefined)
    }
  }
}
