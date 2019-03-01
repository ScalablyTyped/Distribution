package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheRefreshedUser extends js.Object {
  def failure(theUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, anErrorString: java.lang.String): js.Any
  def success(theRefreshedUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser): js.Any
}

object Anon_AnErrorStringFailureSuccessTheRefreshedUser {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, js.Any]
  ): Anon_AnErrorStringFailureSuccessTheRefreshedUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheRefreshedUser]
  }
}

