package typings.kiiCloudSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrString extends js.Object {
  def failure(errString: String): js.Any
  def success(): js.Any
}

object AnonErrString {
  @scala.inline
  def apply(failure: String => js.Any, success: () => js.Any): AnonErrString = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
  
    __obj.asInstanceOf[AnonErrString]
  }
}

