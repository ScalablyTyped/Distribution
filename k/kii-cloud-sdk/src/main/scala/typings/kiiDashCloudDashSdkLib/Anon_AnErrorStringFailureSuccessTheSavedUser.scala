package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheSavedUser extends js.Object {
  def failure(theUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, anErrorString: java.lang.String): js.Any
  def success(theSavedUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser): js.Any
}

object Anon_AnErrorStringFailureSuccessTheSavedUser {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, js.Any]
  ): Anon_AnErrorStringFailureSuccessTheSavedUser = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheSavedUser]
  }
}

