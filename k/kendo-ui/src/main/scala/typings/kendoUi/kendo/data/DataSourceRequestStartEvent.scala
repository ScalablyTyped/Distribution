package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceRequestStartEvent extends DataSourceEvent {
  var `type`: js.UndefOr[String] = js.native
  def preventDefault(): Unit = js.native
}

object DataSourceRequestStartEvent {
  @scala.inline
  def apply(preventDefault: () => Unit): DataSourceRequestStartEvent = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[DataSourceRequestStartEvent]
  }
  @scala.inline
  implicit class DataSourceRequestStartEventOps[Self <: DataSourceRequestStartEvent] (val x: Self) extends AnyVal {
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
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

