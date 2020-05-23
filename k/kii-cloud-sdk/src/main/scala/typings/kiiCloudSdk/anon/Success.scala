package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success extends js.Object {
  def failure(theACL: KiiACL, anErrorString: String): js.Any
  def success(theSavedACL: KiiACL): js.Any
}

object Success {
  @scala.inline
  def apply(failure: (KiiACL, String) => js.Any, success: KiiACL => js.Any): Success = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Success]
  }
}

