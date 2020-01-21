package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorStringFailureSuccessTheSavedUser extends js.Object {
  def failure(theUser: KiiUser, anErrorString: String): js.Any
  def success(theSavedUser: KiiUser): js.Any
}

object AnonAnErrorStringFailureSuccessTheSavedUser {
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: KiiUser => js.Any): AnonAnErrorStringFailureSuccessTheSavedUser = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonAnErrorStringFailureSuccessTheSavedUser]
  }
}

