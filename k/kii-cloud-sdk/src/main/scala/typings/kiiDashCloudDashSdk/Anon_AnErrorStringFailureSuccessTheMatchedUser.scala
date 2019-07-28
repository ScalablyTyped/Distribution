package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheMatchedUser extends js.Object {
  def failure(anErrorString: String): js.Any
  def success(theMatchedUser: KiiUser): js.Any
}

object Anon_AnErrorStringFailureSuccessTheMatchedUser {
  @scala.inline
  def apply(failure: String => js.Any, success: KiiUser => js.Any): Anon_AnErrorStringFailureSuccessTheMatchedUser = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheMatchedUser]
  }
}

