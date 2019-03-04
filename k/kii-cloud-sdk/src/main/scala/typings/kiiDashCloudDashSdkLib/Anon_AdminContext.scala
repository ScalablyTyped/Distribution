package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminContext extends js.Object {
  def failure(error: java.lang.String, statusCode: scala.Double): js.Any
  def success(adminContext: kiiDashCloudDashSdkLib.KiiCloudNs.KiiAppAdminContext): js.Any
}

object Anon_AdminContext {
  @scala.inline
  def apply(
    failure: js.Function2[java.lang.String, scala.Double, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiAppAdminContext, js.Any]
  ): Anon_AdminContext = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_AdminContext]
  }
}

