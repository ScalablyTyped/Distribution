package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureGroupList extends js.Object {
  def failure(theUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, anErrorString: java.lang.String): js.Any
  def success(
    theUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser,
    groupList: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup]
  ): js.Any
}

object Anon_AnErrorStringFailureGroupList {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, java.lang.String, js.Any],
    success: js.Function2[
      kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, 
      js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup], 
      js.Any
    ]
  ): Anon_AnErrorStringFailureGroupList = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureGroupList]
  }
}

