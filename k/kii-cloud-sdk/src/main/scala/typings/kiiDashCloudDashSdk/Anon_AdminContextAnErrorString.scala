package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiAppAdminContext
import typings.kiiDashCloudDashSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminContextAnErrorString extends js.Object {
  def failure(adminContext: KiiAppAdminContext, anErrorString: String): js.Any
  def success(adminContext: KiiAppAdminContext, theMatchedUser: KiiUser): js.Any
}

object Anon_AdminContextAnErrorString {
  @scala.inline
  def apply(failure: (KiiAppAdminContext, String) => js.Any, success: (KiiAppAdminContext, KiiUser) => js.Any): Anon_AdminContextAnErrorString = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AdminContextAnErrorString]
  }
}

