package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheSavedUser extends js.Object {
  def failure(theUser: KiiUser, anErrorString: String): js.Any
  def success(theSavedUser: KiiUser): js.Any
}

object Anon_AnErrorStringFailureSuccessTheSavedUser {
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: KiiUser => js.Any): Anon_AnErrorStringFailureSuccessTheSavedUser = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheSavedUser]
  }
}

