package typings.iobroker.mod.global.ioBroker

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Omit<iobroker.iobroker.<global>.ioBroker.State, 'val'>> & std.Pick<iobroker.iobroker.<global>.ioBroker.State, 'val'> */
@js.native
trait SettableState extends js.Object {
  var ack: js.UndefOr[Boolean] = js.native
  var c: js.UndefOr[String] = js.native
  var expire: js.UndefOr[Double] = js.native
  var from: js.UndefOr[String] = js.native
  var lc: js.UndefOr[Double] = js.native
  var q: js.UndefOr[StateQuality] = js.native
  var ts: js.UndefOr[Double] = js.native
  var user: js.UndefOr[String] = js.native
  var `val`: String | Double | Boolean | js.Array[_] | (Record[String, _]) | Null = js.native
}

object SettableState {
  @scala.inline
  def apply(): SettableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableState]
  }
  @scala.inline
  implicit class SettableStateOps[Self <: SettableState] (val x: Self) extends AnyVal {
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
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    @scala.inline
    def setExpire(value: Double): Self = this.set("expire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpire: Self = this.set("expire", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setLc(value: Double): Self = this.set("lc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLc: Self = this.set("lc", js.undefined)
    @scala.inline
    def setQ(value: StateQuality): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTs: Self = this.set("ts", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setValVarargs(value: js.Any*): Self = this.set("val", js.Array(value :_*))
    @scala.inline
    def setVal(value: String | Double | Boolean | js.Array[_] | (Record[String, _])): Self = this.set("val", value.asInstanceOf[js.Any])
    @scala.inline
    def setValNull: Self = this.set("val", null)
  }
  
}

