package typings.inputMoment.anon

import typings.inputMoment.mod.OnChangeListener
import typings.inputMoment.mod.OnSaveListener
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<input-moment.input-moment.InputMomentProps> */
@js.native
trait ReadonlyInputMomentProps extends js.Object {
  
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
  implicit class ReadonlyInputMomentPropsOps[Self <: ReadonlyInputMomentProps] (val x: Self) extends AnyVal {
    
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
