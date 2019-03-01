package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureMemberList extends js.Object {
  def failure(theGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, anErrorString: java.lang.String): js.Any
  def success(
    theGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup,
    memberList: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser]
  ): js.Any
}

object Anon_AnErrorStringFailureMemberList {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, java.lang.String, js.Any],
    success: js.Function2[
      kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, 
      js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser], 
      js.Any
    ]
  ): Anon_AnErrorStringFailureMemberList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringFailureMemberList]
  }
}

