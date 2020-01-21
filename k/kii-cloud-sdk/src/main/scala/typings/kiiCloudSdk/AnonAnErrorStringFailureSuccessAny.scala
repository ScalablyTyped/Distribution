package typings.kiiCloudSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorStringFailureSuccessAny extends js.Object {
  def failure(anErrorString: String): js.Any
  def success(): js.Any
}

object AnonAnErrorStringFailureSuccessAny {
  @scala.inline
  def apply(failure: String => js.Any, success: () => js.Any): AnonAnErrorStringFailureSuccessAny = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
  
    __obj.asInstanceOf[AnonAnErrorStringFailureSuccessAny]
  }
}

