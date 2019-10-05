package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiGroup
import typings.kiiDashCloudDashSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureGroupList extends js.Object {
  def failure(theUser: KiiUser, anErrorString: String): js.Any
  def success(theUser: KiiUser, groupList: js.Array[KiiGroup]): js.Any
}

object Anon_AnErrorStringFailureGroupList {
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: (KiiUser, js.Array[KiiGroup]) => js.Any): Anon_AnErrorStringFailureGroupList = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureGroupList]
  }
}

