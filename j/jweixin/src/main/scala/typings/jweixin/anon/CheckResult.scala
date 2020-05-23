package typings.jweixin.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResult extends js.Object {
  var checkResult: StringDictionary[Boolean]
  var errMsg: String
}

object CheckResult {
  @scala.inline
  def apply(checkResult: StringDictionary[Boolean], errMsg: String): CheckResult = {
    val __obj = js.Dynamic.literal(checkResult = checkResult.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckResult]
  }
}

