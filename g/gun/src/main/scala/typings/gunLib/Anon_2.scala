package typings
package gunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_2 extends js.Object {
  var ack: gunLib.gunLibNumbers.`2`
  var get: java.lang.String
  var put: Anon_Alias
  var sea: gunLib.gunMod.GunNs.CryptoKeyPair
  var soul: java.lang.String
  def on(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type [unknown, unknown, unknown] is not an array type */ args: js.Tuple3[_, _, _]
  ): js.Any
}

object Anon_2 {
  @scala.inline
  def apply(
    ack: gunLib.gunLibNumbers.`2`,
    get: java.lang.String,
    on: js.Tuple3[_, _, _] => js.Any,
    put: Anon_Alias,
    sea: gunLib.gunMod.GunNs.CryptoKeyPair,
    soul: java.lang.String
  ): Anon_2 = {
    val __obj = js.Dynamic.literal(ack = ack, get = get, on = js.Any.fromFunction1(on), put = put, sea = sea, soul = soul)
  
    __obj.asInstanceOf[Anon_2]
  }
}

