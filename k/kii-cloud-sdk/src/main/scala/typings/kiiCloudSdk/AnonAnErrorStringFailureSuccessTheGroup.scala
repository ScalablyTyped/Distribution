package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorStringFailureSuccessTheGroup extends js.Object {
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  def success(theRefreshedGroup: KiiGroup): js.Any
}

object AnonAnErrorStringFailureSuccessTheGroup {
  @scala.inline
  def apply(failure: (KiiGroup, String) => js.Any, success: KiiGroup => js.Any): AnonAnErrorStringFailureSuccessTheGroup = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonAnErrorStringFailureSuccessTheGroup]
  }
}

