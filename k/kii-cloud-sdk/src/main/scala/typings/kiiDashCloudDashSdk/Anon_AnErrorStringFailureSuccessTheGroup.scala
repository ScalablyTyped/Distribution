package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheGroup extends js.Object {
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  def success(theRefreshedGroup: KiiGroup): js.Any
}

object Anon_AnErrorStringFailureSuccessTheGroup {
  @scala.inline
  def apply(failure: (KiiGroup, String) => js.Any, success: KiiGroup => js.Any): Anon_AnErrorStringFailureSuccessTheGroup = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheGroup]
  }
}

