package typings.gun

import typings.gun.gunNumbers.`2`
import typings.gun.mod.Gun.CryptoKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var ack: `2`
  var get: String
  var put: AnonAlias
  var sea: CryptoKeyPair
  var soul: String
  def on(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [unknown, unknown, unknown] is not an array type */ args: js.Tuple3[_, _, _]
  ): js.Any
}

object Anon2 {
  @scala.inline
  def apply(
    ack: `2`,
    get: String,
    on: js.Tuple3[_, _, _] => js.Any,
    put: AnonAlias,
    sea: CryptoKeyPair,
    soul: String
  ): Anon2 = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], on = js.Any.fromFunction1(on), put = put.asInstanceOf[js.Any], sea = sea.asInstanceOf[js.Any], soul = soul.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon2]
  }
}

