package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheGroup extends js.Object {
  def failure(theGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, anErrorString: java.lang.String): js.Any
  def success(theRefreshedGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup): js.Any
}

object Anon_AnErrorStringFailureSuccessTheGroup {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, js.Any]
  ): Anon_AnErrorStringFailureSuccessTheGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheGroup]
  }
}

