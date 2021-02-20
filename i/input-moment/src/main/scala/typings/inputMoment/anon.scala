package typings.inputMoment

import typings.inputMoment.mod.OnChangeListener
import typings.inputMoment.mod.OnSaveListener
import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<input-moment.input-moment.InputMomentProps> */
  @js.native
  trait ReadonlyInputMomentProps extends StObject {
    
    val hourStep: js.UndefOr[Double] = js.native
    
    val minStep: js.UndefOr[Double] = js.native
    
    val moment: Moment = js.native
    
    val nextMonthIcon: js.UndefOr[String] = js.native
    
    val onChange: js.UndefOr[OnChangeListener] = js.native
    
    val onSave: js.UndefOr[OnSaveListener] = js.native
    
    val prevMonthIcon: js.UndefOr[String] = js.native
  }
  object ReadonlyInputMomentProps {
    
    @scala.inline
    def apply(moment: Moment): ReadonlyInputMomentProps = {
      val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyInputMomentProps]
    }
    
    @scala.inline
    implicit class ReadonlyInputMomentPropsMutableBuilder[Self <: ReadonlyInputMomentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setMinStep(value: Double): Self = StObject.set(x, "minStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinStepUndefined: Self = StObject.set(x, "minStep", js.undefined)
      
      @scala.inline
      def setMoment(value: Moment): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonthIcon(value: String): Self = StObject.set(x, "nextMonthIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMonthIconUndefined: Self = StObject.set(x, "nextMonthIcon", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* m */ Moment => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnSave(value: () => Unit): Self = StObject.set(x, "onSave", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      @scala.inline
      def setPrevMonthIcon(value: String): Self = StObject.set(x, "prevMonthIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevMonthIconUndefined: Self = StObject.set(x, "prevMonthIcon", js.undefined)
    }
  }
}
