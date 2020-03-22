package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon37 extends js.Object {
  def failure(theUser: KiiUser, anErrorString: String): js.Any
  def success(theUser: KiiUser, groupList: js.Array[KiiGroup]): js.Any
}

object Anon37 {
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: (KiiUser, js.Array[KiiGroup]) => js.Any): Anon37 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon37]
  }
}

