package typings.kafkajs.kafkajsMod

import typings.kafkajs.kafkajsStrings.`scram-sha-256`
import typings.kafkajs.kafkajsStrings.`scram-sha-512`
import typings.kafkajs.kafkajsStrings.plain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SASLOptions extends js.Object {
  var mechanism: plain | `scram-sha-256` | `scram-sha-512`
  var password: String
  var username: String
}

object SASLOptions {
  @scala.inline
  def apply(mechanism: plain | `scram-sha-256` | `scram-sha-512`, password: String, username: String): SASLOptions = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], password = password, username = username)
  
    __obj.asInstanceOf[SASLOptions]
  }
}

