package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheDeletedObject extends js.Object {
  def failure(theObject: kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, anErrorString: java.lang.String): js.Any
  def success(theDeletedObject: kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject): js.Any
}

object Anon_AnErrorStringFailureSuccessTheDeletedObject {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, js.Any]
  ): Anon_AnErrorStringFailureSuccessTheDeletedObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheDeletedObject]
  }
}

