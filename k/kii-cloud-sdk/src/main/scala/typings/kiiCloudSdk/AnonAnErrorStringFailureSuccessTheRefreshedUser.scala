package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorStringFailureSuccessTheRefreshedUser extends js.Object {
  def failure(theUser: KiiUser, anErrorString: String): js.Any
  def success(theRefreshedUser: KiiUser): js.Any
}

object AnonAnErrorStringFailureSuccessTheRefreshedUser {
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: KiiUser => js.Any): AnonAnErrorStringFailureSuccessTheRefreshedUser = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonAnErrorStringFailureSuccessTheRefreshedUser]
  }
}

