package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheGroupTheOwner extends js.Object {
  def failure(theGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, anErrorString: java.lang.String): js.Any
  def success(
    theGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup,
    theOwner: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser
  ): js.Any
}

object Anon_AnErrorStringFailureSuccessTheGroupTheOwner {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, java.lang.String, js.Any],
    success: js.Function2[
      kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, 
      kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, 
      js.Any
    ]
  ): Anon_AnErrorStringFailureSuccessTheGroupTheOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheGroupTheOwner]
  }
}

