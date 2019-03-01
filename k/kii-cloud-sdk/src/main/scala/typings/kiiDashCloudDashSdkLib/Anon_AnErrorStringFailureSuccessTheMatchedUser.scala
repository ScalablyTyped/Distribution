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
  def apply(
    failure: js.Function1[java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, js.Any]
  ): Anon_AnErrorStringFailureSuccessTheMatchedUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheMatchedUser]
  }
}

