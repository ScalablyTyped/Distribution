package typings.jweixin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApi extends js.Object {
  var checkResult: StringDictionary[Boolean]
  var errMsg: String
}

object AnonApi {
  @scala.inline
  def apply(checkResult: StringDictionary[Boolean], errMsg: String): AnonApi = {
    val __obj = js.Dynamic.literal(checkResult = checkResult.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApi]
  }
}

