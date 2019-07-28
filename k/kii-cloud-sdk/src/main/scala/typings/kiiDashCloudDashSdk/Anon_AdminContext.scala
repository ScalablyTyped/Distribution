package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiAppAdminContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminContext extends js.Object {
  def failure(error: String, statusCode: Double): js.Any
  def success(adminContext: KiiAppAdminContext): js.Any
}

object Anon_AdminContext {
  @scala.inline
  def apply(failure: (String, Double) => js.Any, success: KiiAppAdminContext => js.Any): Anon_AdminContext = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AdminContext]
  }
}

