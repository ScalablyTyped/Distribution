package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccess extends js.Object {
  def failure(theACL: kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL, anErrorString: java.lang.String): js.Any
  def success(theSavedACL: kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL): js.Any
}

object Anon_AnErrorStringFailureSuccess {
  @scala.inline
  def apply(
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL, java.lang.String) => js.Any,
    success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL => js.Any
  ): Anon_AnErrorStringFailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccess]
  }
}

