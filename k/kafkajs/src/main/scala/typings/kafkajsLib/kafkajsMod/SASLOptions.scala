package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SASLOptions extends js.Object {
  var mechanism: kafkajsLib.kafkajsLibStrings.plain | kafkajsLib.kafkajsLibStrings.`scram-sha-256` | kafkajsLib.kafkajsLibStrings.`scram-sha-512`
  var password: java.lang.String
  var username: java.lang.String
}

object SASLOptions {
  @scala.inline
  def apply(
    mechanism: kafkajsLib.kafkajsLibStrings.plain | kafkajsLib.kafkajsLibStrings.`scram-sha-256` | kafkajsLib.kafkajsLibStrings.`scram-sha-512`,
    password: java.lang.String,
    username: java.lang.String
  ): SASLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mechanism")(mechanism.asInstanceOf[js.Any])
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[SASLOptions]
  }
}

