package typings.gtmetrix.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<gtmetrix.gtmetrix.TestBasicInfo> */
trait ReadonlyTestBasicInfo extends js.Object {
  val credits_left: Double
  val poll_state_url: String
  val test_id: String
}

object ReadonlyTestBasicInfo {
  @scala.inline
  def apply(credits_left: Double, poll_state_url: String, test_id: String): ReadonlyTestBasicInfo = {
    val __obj = js.Dynamic.literal(credits_left = credits_left.asInstanceOf[js.Any], poll_state_url = poll_state_url.asInstanceOf[js.Any], test_id = test_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyTestBasicInfo]
  }
}

