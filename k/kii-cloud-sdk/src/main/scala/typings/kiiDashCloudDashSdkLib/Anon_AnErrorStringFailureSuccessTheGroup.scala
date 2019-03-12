package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheGroup extends js.Object {
  def failure(theGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, anErrorString: java.lang.String): js.Any
  def success(theRefreshedGroup: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup): js.Any
}

object Anon_AnErrorStringFailureSuccessTheGroup {
  @scala.inline
  def apply(
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, java.lang.String) => js.Any,
    success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup => js.Any
  ): Anon_AnErrorStringFailureSuccessTheGroup = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheGroup]
  }
}

