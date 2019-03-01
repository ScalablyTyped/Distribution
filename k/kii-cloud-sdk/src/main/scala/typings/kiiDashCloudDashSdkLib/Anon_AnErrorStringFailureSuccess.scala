package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccess extends js.Object {
  def failure(theACL: kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL, anErrorString: java.lang.String): js.Any
  def success(theSavedACL: kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL): js.Any
}

object Anon_AnErrorStringFailureSuccess {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL, java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL, js.Any]
  ): Anon_AnErrorStringFailureSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccess]
  }
}

