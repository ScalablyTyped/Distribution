package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorStringFailureSuccess extends js.Object {
  def failure(theACL: KiiACL, anErrorString: String): js.Any
  def success(theSavedACL: KiiACL): js.Any
}

object AnonAnErrorStringFailureSuccess {
  @scala.inline
  def apply(failure: (KiiACL, String) => js.Any, success: KiiACL => js.Any): AnonAnErrorStringFailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonAnErrorStringFailureSuccess]
  }
}

