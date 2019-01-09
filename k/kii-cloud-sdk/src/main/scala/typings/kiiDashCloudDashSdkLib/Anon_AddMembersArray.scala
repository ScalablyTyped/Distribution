package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddMembersArray extends js.Object {
  def failure(
    theGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup,
    anErrorString: java.lang.String,
    addMembersArray: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser],
    removeMembersArray: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser]
  ): js.Any
  def success(adminContext: kiiDashCloudDashSdkLib.KiiCloudNs.KiiAppAdminContext): js.Any
}

