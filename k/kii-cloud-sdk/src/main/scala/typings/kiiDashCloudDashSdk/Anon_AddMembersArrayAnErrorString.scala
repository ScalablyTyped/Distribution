package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiGroup
import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddMembersArrayAnErrorString extends js.Object {
  def failure(
    theGroup: KiiGroup,
    anErrorString: String,
    addMembersArray: js.Array[KiiUser],
    removeMembersArray: js.Array[KiiUser]
  ): js.Any
  def success(theSavedGroup: KiiGroup): js.Any
}

object Anon_AddMembersArrayAnErrorString {
  @scala.inline
  def apply(
    failure: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => js.Any,
    success: KiiGroup => js.Any
  ): Anon_AddMembersArrayAnErrorString = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AddMembersArrayAnErrorString]
  }
}

