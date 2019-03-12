package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheMatchedUser extends js.Object {
  def failure(anErrorString: java.lang.String): js.Any
  def success(theMatchedUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser): js.Any
}

object Anon_AnErrorStringFailureSuccessTheMatchedUser {
  @scala.inline
  def apply(failure: java.lang.String => js.Any, success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser => js.Any): Anon_AnErrorStringFailureSuccessTheMatchedUser = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheMatchedUser]
  }
}

