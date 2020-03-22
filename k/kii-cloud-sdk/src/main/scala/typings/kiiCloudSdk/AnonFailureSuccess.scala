package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiThingContext
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailureSuccess extends js.Object {
  def failure(error: Error): js.Any
  def success(thingContext: KiiThingContext): js.Any
}

object AnonFailureSuccess {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiThingContext => js.Any): AnonFailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonFailureSuccess]
  }
}

