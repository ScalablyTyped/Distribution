package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.average
import typings.iobroker.iobrokerStrings.count
import typings.iobroker.iobrokerStrings.max
import typings.iobroker.iobrokerStrings.min
import typings.iobroker.iobrokerStrings.minmax
import typings.iobroker.iobrokerStrings.none
import typings.iobroker.iobrokerStrings.total
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHistoryOptions extends js.Object {
  var ack: js.UndefOr[Boolean] = js.native
  var addID: js.UndefOr[Boolean] = js.native
  var aggregate: js.UndefOr[minmax | min | max | average | total | count | none] = js.native
  var count: js.UndefOr[Double] = js.native
  var end: js.UndefOr[Double] = js.native
  var from: js.UndefOr[Boolean] = js.native
  var ignoreNull: js.UndefOr[Boolean] = js.native
  var instance: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var q: js.UndefOr[Boolean] = js.native
  var sessionId: js.UndefOr[js.Any] = js.native
  var start: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
}

object GetHistoryOptions {
  @scala.inline
  def apply(): GetHistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHistoryOptions]
  }
  @scala.inline
  implicit class GetHistoryOptionsOps[Self <: GetHistoryOptions] (val x: Self) extends AnyVal {
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
    def setAck(value: Boolean): Self = this.set("ack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAck: Self = this.set("ack", js.undefined)
    @scala.inline
    def setAddID(value: Boolean): Self = this.set("addID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddID: Self = this.set("addID", js.undefined)
    @scala.inline
    def setAggregate(value: minmax | min | max | average | total | count | none): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFrom(value: Boolean): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setIgnoreNull(value: Boolean): Self = this.set("ignoreNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreNull: Self = this.set("ignoreNull", js.undefined)
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setQ(value: Boolean): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setSessionId(value: js.Any): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

