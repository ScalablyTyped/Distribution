package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorStringFailureSuccessTheObject extends js.Object {
  def failure(theObject: KiiObject, anErrorString: String): js.Any
  def success(theRefreshedObject: KiiObject): js.Any
}

object AnonAnErrorStringFailureSuccessTheObject {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: KiiObject => js.Any): AnonAnErrorStringFailureSuccessTheObject = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonAnErrorStringFailureSuccessTheObject]
  }
}

