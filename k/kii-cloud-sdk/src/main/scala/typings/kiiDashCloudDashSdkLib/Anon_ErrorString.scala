package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorString extends js.Object {
  def failure(user: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, errorString: java.lang.String): js.Any
  def success(user: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser): js.Any
}

object Anon_ErrorString {
  @scala.inline
  def apply(
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, java.lang.String) => js.Any,
    success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser => js.Any
  ): Anon_ErrorString = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorString]
  }
}

