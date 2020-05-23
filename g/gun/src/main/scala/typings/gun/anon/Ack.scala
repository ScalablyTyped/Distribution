package typings.gun.anon

import typings.gun.gunNumbers.`2`
import typings.gun.mod.Gun.CryptoKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ack extends js.Object {
  var ack: `2`
  var get: String
  var put: Alias
  var sea: CryptoKeyPair
  var soul: String
  def on(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [unknown, unknown, unknown] is not an array type */ args: js.Tuple3[_, _, _]
  ): js.Any
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
}

