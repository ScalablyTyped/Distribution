package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorFailureSuccess extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing): js.Any
}

object AnonErrorFailureSuccess {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiThing => js.Any): AnonErrorFailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonErrorFailureSuccess]
  }
}

