package typings.hapiIron.mod

import typings.hapiIron.AnonIvBits
import typings.hapiIron.AnonKeyBits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithms_ extends js.Object {
  var `aes-128-ctr`: AnonIvBits
  var `aes-256-cbc`: AnonIvBits
  var sha256: AnonKeyBits
}

object Algorithms_ {
  @scala.inline
  def apply(`aes-128-ctr`: AnonIvBits, `aes-256-cbc`: AnonIvBits, sha256: AnonKeyBits): Algorithms_ = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
    __obj.updateDynamic("aes-128-ctr")(`aes-128-ctr`.asInstanceOf[js.Any])
    __obj.updateDynamic("aes-256-cbc")(`aes-256-cbc`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithms_]
  }
}

