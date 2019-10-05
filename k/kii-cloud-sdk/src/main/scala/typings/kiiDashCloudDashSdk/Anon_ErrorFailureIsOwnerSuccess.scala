package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiGroup
import typings.kiiDashCloudDashSdk.KiiCloud.KiiThing
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureIsOwnerSuccess extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing, user: KiiGroup, isOwner: Boolean): js.Any
}

object Anon_ErrorFailureIsOwnerSuccess {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiGroup, Boolean) => js.Any): Anon_ErrorFailureIsOwnerSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureIsOwnerSuccess]
  }
}

