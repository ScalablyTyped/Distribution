package typings.jweixin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Api extends js.Object {
  var checkResult: StringDictionary[Boolean]
  var errMsg: String
}

object Anon_Api {
  @scala.inline
  def apply(checkResult: StringDictionary[Boolean], errMsg: String): Anon_Api = {
    val __obj = js.Dynamic.literal(checkResult = checkResult.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Api]
  }
}

