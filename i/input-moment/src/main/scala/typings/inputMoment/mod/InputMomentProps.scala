package typings.inputMoment.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputMomentProps extends js.Object {
  
  var hourStep: js.UndefOr[Double] = js.native
  
  var minStep: js.UndefOr[Double] = js.native
  
  var moment: Moment = js.native
  
  var nextMonthIcon: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[OnChangeListener] = js.native
  
  var onSave: js.UndefOr[OnSaveListener] = js.native
  
  var prevMonthIcon: js.UndefOr[String] = js.native
}
object InputMomentProps {
  
  @scala.inline
  def apply(moment: Moment): InputMomentProps = {
    val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMomentProps]
  }
  
  @scala.inline
  implicit class InputMomentPropsOps[Self <: InputMomentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMoment(value: Moment): Self = this.set("moment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourStep(value: Double): Self = this.set("hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourStep: Self = this.set("hourStep", js.undefined)
    
    @scala.inline
    def setMinStep(value: Double): Self = this.set("minStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinStep: Self = this.set("minStep", js.undefined)
    
    @scala.inline
    def setNextMonthIcon(value: String): Self = this.set("nextMonthIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMonthIcon: Self = this.set("nextMonthIcon", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* m */ Moment => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnSave(value: () => Unit): Self = this.set("onSave", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSave: Self = this.set("onSave", js.undefined)
    
    @scala.inline
    def setPrevMonthIcon(value: String): Self = this.set("prevMonthIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevMonthIcon: Self = this.set("prevMonthIcon", js.undefined)
  }
}
