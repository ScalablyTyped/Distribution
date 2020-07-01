package typings.gtmetrix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestBasicInfo extends js.Object {
  var credits_left: Double
  var poll_state_url: String
  var test_id: String
}

object TestBasicInfo {
  @scala.inline
  def apply(credits_left: Double, poll_state_url: String, test_id: String): TestBasicInfo = {
    val __obj = js.Dynamic.literal(credits_left = credits_left.asInstanceOf[js.Any], poll_state_url = poll_state_url.asInstanceOf[js.Any], test_id = test_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestBasicInfo]
  }
}

