package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorString extends js.Object {
  def failure(user: KiiUser, errorString: String): js.Any
  def success(user: KiiUser): js.Any
}

object AnonErrorString {
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: KiiUser => js.Any): AnonErrorString = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonErrorString]
  }
}

