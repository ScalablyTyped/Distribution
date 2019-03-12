package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddMembersArrayAnErrorString extends js.Object {
  def failure(
    theGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup,
    anErrorString: java.lang.String,
    addMembersArray: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser],
    removeMembersArray: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser]
  ): js.Any
  def success(theSavedGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup): js.Any
}

object Anon_AddMembersArrayAnErrorString {
  @scala.inline
  def apply(
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, java.lang.String, js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser], js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser]) => js.Any,
    success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup => js.Any
  ): Anon_AddMembersArrayAnErrorString = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AddMembersArrayAnErrorString]
  }
}

