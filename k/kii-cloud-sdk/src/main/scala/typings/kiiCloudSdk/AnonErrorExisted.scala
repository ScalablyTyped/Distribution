package typings.kiiCloudSdk

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorExisted extends js.Object {
  def failure(error: Error): js.Any
  def success(existed: Boolean): js.Any
}

object AnonErrorExisted {
  @scala.inline
  def apply(failure: Error => js.Any, success: Boolean => js.Any): AnonErrorExisted = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonErrorExisted]
  }
}

