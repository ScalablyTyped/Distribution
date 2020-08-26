package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.StateQuality
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined iobroker.iobroker.<global>.ioBroker.State & {  id :string | undefined} */
@js.native
trait Stateidstringundefined extends js.Object {
  /** Direction flag: false for desired value and true for actual value. Default: false. */
  var ack: Boolean = js.native
  /** Optional comment */
  var c: js.UndefOr[String] = js.native
  /** Optional time in seconds after which the state is reset to null */
  var expire: js.UndefOr[Double] = js.native
  /** Name of the adapter instance which set the value, e.g. "system.adapter.web.0" */
  var from: String = js.native
  var id: js.UndefOr[String] = js.native
  /** Unix timestamp of the last time the value changed */
  var lc: Double = js.native
  /** Optional quality of the state value */
  var q: js.UndefOr[StateQuality] = js.native
  /** Unix timestamp. Default: current time */
  var ts: Double = js.native
  /** The user who set this value */
  var user: js.UndefOr[String] = js.native
  /** The value of the state. */
  var `val`: String | Double | Boolean | js.Array[_] | (Record[String, _]) | Null = js.native
}

object Stateidstringundefined {
  @scala.inline
  def apply(ack: Boolean, from: String, lc: Double, ts: Double): Stateidstringundefined = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], lc = lc.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stateidstringundefined]
  }
  @scala.inline
  implicit class StateidstringundefinedOps[Self <: Stateidstringundefined] (val x: Self) extends AnyVal {
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setLc(value: Double): Self = this.set("lc", value.asInstanceOf[js.Any])
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    @scala.inline
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    @scala.inline
    def setExpire(value: Double): Self = this.set("expire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpire: Self = this.set("expire", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setQ(value: StateQuality): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
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

