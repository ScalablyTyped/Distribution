package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  def failure(
    theGroup: KiiGroup,
    anErrorString: String,
    addMembersArray: js.Array[KiiUser],
    removeMembersArray: js.Array[KiiUser]
  ): js.Any
  def success(adminContext: KiiAppAdminContext): js.Any
}

object Anon3 {
  @scala.inline
  def apply(
    failure: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => js.Any,
    success: KiiAppAdminContext => js.Any
  ): Anon3 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon3]
  }
}

