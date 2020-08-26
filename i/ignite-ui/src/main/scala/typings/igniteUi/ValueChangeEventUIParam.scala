package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueChangeEventUIParam extends js.Object {
  /**
    * Gets the previously selected value.
    */
  var oldValue: js.UndefOr[Double] = js.native
  /**
    * Gets the new selected value.
    */
  var value: js.UndefOr[Double] = js.native
}

object ValueChangeEventUIParam {
  @scala.inline
  def apply(): ValueChangeEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueChangeEventUIParam]
  }
  @scala.inline
  implicit class ValueChangeEventUIParamOps[Self <: ValueChangeEventUIParam] (val x: Self) extends AnyVal {
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
    def setOldValue(value: Double): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

