package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon4 extends js.Object {
  def failure(adminContext: KiiAppAdminContext, anErrorString: String): js.Any
  def success(adminContext: KiiAppAdminContext, theMatchedUser: KiiUser): js.Any
}

object Anon4 {
  @scala.inline
  def apply(failure: (KiiAppAdminContext, String) => js.Any, success: (KiiAppAdminContext, KiiUser) => js.Any): Anon4 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[Anon4]
  }
}

