package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheDeletedGroup extends js.Object {
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  def success(theDeletedGroup: KiiGroup): js.Any
}

object Anon_AnErrorStringFailureSuccessTheDeletedGroup {
  @scala.inline
  def apply(failure: (KiiGroup, String) => js.Any, success: KiiGroup => js.Any): Anon_AnErrorStringFailureSuccessTheDeletedGroup = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheDeletedGroup]
  }
}

