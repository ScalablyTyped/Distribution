package typings.gun.anon

import typings.gun.gunNumbers.`2`
import typings.gun.mod.Gun.CryptoKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ack extends js.Object {
  var ack: `2` = js.native
  var get: String = js.native
  var put: Alias = js.native
  var sea: CryptoKeyPair = js.native
  var soul: String = js.native
  def on(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [unknown, unknown, unknown] is not an array type */ args: js.Tuple3[_, _, _]
  ): js.Any = js.native
}

object Ack {
  @scala.inline
  def apply(
    ack: `2`,
    get: String,
    on: js.Tuple3[_, _, _] => js.Any,
    put: Alias,
    sea: CryptoKeyPair,
    soul: String
  ): Ack = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], on = js.Any.fromFunction1(on), put = put.asInstanceOf[js.Any], sea = sea.asInstanceOf[js.Any], soul = soul.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ack]
  }
  @scala.inline
  implicit class AckOps[Self <: Ack] (val x: Self) extends AnyVal {
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
    def setAck(value: `2`): Self = this.set("ack", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: String): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn(value: js.Tuple3[_, _, _] => js.Any): Self = this.set("on", js.Any.fromFunction1(value))
    @scala.inline
    def setPut(value: Alias): Self = this.set("put", value.asInstanceOf[js.Any])
    @scala.inline
    def setSea(value: CryptoKeyPair): Self = this.set("sea", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoul(value: String): Self = this.set("soul", value.asInstanceOf[js.Any])
  }
  
}

