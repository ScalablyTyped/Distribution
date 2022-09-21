package typings.inputMoment

import typings.inputMoment.anon.ReadonlyInputMomentProps
import typings.moment.mod.Moment
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("input-moment", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[InputMomentProps, js.Object, Any] {
    def this(props: ReadonlyInputMomentProps) = this()
  }
  
  type InputMoment = Component[InputMomentProps, js.Object, Any]
  
  trait InputMomentProps extends StObject {
    
    var hourStep: js.UndefOr[Double] = js.undefined
    
    var minStep: js.UndefOr[Double] = js.undefined
    
    var moment: Moment
    
    var nextMonthIcon: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[OnChangeListener] = js.undefined
    
    var onSave: js.UndefOr[OnSaveListener] = js.undefined
    
    var prevMonthIcon: js.UndefOr[String] = js.undefined
  }
  object InputMomentProps {
    
    inline def apply(moment: Moment): InputMomentProps = {
      val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputMomentProps]
    }
    
    extension [Self <: InputMomentProps](x: Self) {
      
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
  
  type OnChangeListener = js.Function1[/* m */ Moment, Unit]
  
  type OnSaveListener = js.Function0[Unit]
}
