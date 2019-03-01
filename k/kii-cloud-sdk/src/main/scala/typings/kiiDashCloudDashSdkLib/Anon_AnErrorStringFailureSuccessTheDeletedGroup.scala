package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheDeletedGroup extends js.Object {
  def failure(theGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, anErrorString: java.lang.String): js.Any
  def success(theDeletedGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup): js.Any
}

object Anon_AnErrorStringFailureSuccessTheDeletedGroup {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, js.Any]
  ): Anon_AnErrorStringFailureSuccessTheDeletedGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheDeletedGroup]
  }
}

