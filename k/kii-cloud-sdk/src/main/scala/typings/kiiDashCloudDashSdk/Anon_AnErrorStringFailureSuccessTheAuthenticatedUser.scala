package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheAuthenticatedUser extends js.Object {
  def failure(theUser: KiiUser, anErrorString: String): js.Any
  def success(theAuthenticatedUser: KiiUser): js.Any
}

object Anon_AnErrorStringFailureSuccessTheAuthenticatedUser {
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: KiiUser => js.Any): Anon_AnErrorStringFailureSuccessTheAuthenticatedUser = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheAuthenticatedUser]
  }
}

