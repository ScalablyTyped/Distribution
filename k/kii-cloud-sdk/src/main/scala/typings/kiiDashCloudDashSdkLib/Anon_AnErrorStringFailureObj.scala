package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureObj extends js.Object {
  def failure(obj: kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, anErrorString: java.lang.String): js.Any
  def success(theDeletedObject: kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject): js.Any
}

object Anon_AnErrorStringFailureObj {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, js.Any]
  ): Anon_AnErrorStringFailureObj = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureObj]
  }
}

