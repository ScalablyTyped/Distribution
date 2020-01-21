package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdminContext extends js.Object {
  def failure(error: String, statusCode: Double): js.Any
  def success(adminContext: KiiAppAdminContext): js.Any
}

object AnonAdminContext {
  @scala.inline
  def apply(failure: (String, Double) => js.Any, success: KiiAppAdminContext => js.Any): AnonAdminContext = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonAdminContext]
  }
}

