package typings.atHapiIron.atHapiIronMod

import org.scalablytyped.runtime.TopLevel
import typings.atHapiIron.Anon_IvBits
import typings.atHapiIron.Anon_KeyBits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithms extends js.Object {
  var `aes-128-ctr`: Anon_IvBits
  var `aes-256-cbc`: Anon_IvBits
  var sha256: Anon_KeyBits
}

object Algorithms {
  @scala.inline
  def apply(`aes-128-ctr`: Anon_IvBits, `aes-256-cbc`: Anon_IvBits, sha256: Anon_KeyBits): Algorithms = {
    val __obj = js.Dynamic.literal(sha256 = sha256)
    __obj.updateDynamic("aes-128-ctr")(`aes-128-ctr`)
    __obj.updateDynamic("aes-256-cbc")(`aes-256-cbc`)
    __obj.asInstanceOf[Algorithms]
  }
}

@JSImport("@hapi/iron", "algorithms")
@js.native
object algorithms extends TopLevel[Algorithms]

