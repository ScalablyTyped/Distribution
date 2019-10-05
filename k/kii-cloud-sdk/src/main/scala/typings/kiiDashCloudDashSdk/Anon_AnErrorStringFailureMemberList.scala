package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiGroup
import typings.kiiDashCloudDashSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureMemberList extends js.Object {
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  def success(theGroup: KiiGroup, memberList: js.Array[KiiUser]): js.Any
}

object Anon_AnErrorStringFailureMemberList {
  @scala.inline
  def apply(failure: (KiiGroup, String) => js.Any, success: (KiiGroup, js.Array[KiiUser]) => js.Any): Anon_AnErrorStringFailureMemberList = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureMemberList]
  }
}

