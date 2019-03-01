package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminContextAnErrorString extends js.Object {
  def failure(
    adminContext: kiiDashCloudDashSdkLib.KiiCloudNs.KiiAppAdminContext,
    anErrorString: java.lang.String
  ): js.Any
  def success(
    adminContext: kiiDashCloudDashSdkLib.KiiCloudNs.KiiAppAdminContext,
    theMatchedUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser
  ): js.Any
}

object Anon_AdminContextAnErrorString {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiAppAdminContext, java.lang.String, js.Any],
    success: js.Function2[
      kiiDashCloudDashSdkLib.KiiCloudNs.KiiAppAdminContext, 
      kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, 
      js.Any
    ]
  ): Anon_AdminContextAnErrorString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AdminContextAnErrorString]
  }
}

