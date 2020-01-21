package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorStringFailureSuccessTheMatchedUser extends js.Object {
  def failure(anErrorString: String): js.Any
  def success(theMatchedUser: KiiUser): js.Any
}

object AnonAnErrorStringFailureSuccessTheMatchedUser {
  @scala.inline
  def apply(failure: String => js.Any, success: KiiUser => js.Any): AnonAnErrorStringFailureSuccessTheMatchedUser = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonAnErrorStringFailureSuccessTheMatchedUser]
  }
}

