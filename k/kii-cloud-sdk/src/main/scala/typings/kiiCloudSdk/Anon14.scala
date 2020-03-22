package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon14 extends js.Object {
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  def success(theGroup: KiiGroup, theOwner: KiiUser): js.Any
}

object Anon14 {
  @scala.inline
  def apply(failure: (KiiGroup, String) => js.Any, success: (KiiGroup, KiiUser) => js.Any): Anon14 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon14]
  }
}

