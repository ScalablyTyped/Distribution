package typings.hapiIron.mod

import typings.hapiIron.anon.IvBits
import typings.hapiIron.anon.KeyBits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithms_ extends js.Object {
  var `aes-128-ctr`: IvBits
  var `aes-256-cbc`: IvBits
  var sha256: KeyBits
}

object Algorithms_ {
  @scala.inline
  def apply(`aes-128-ctr`: IvBits, `aes-256-cbc`: IvBits, sha256: KeyBits): Algorithms_ = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
    __obj.updateDynamic("aes-128-ctr")(`aes-128-ctr`.asInstanceOf[js.Any])
    __obj.updateDynamic("aes-256-cbc")(`aes-256-cbc`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithms_]
  }
}

