package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheUser extends js.Object {
  def failure(theUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, anErrorString: java.lang.String): js.Any
  def success(theUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser): js.Any
}

object Anon_AnErrorStringFailureSuccessTheUser {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, js.Any]
  ): Anon_AnErrorStringFailureSuccessTheUser = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheUser]
  }
}

