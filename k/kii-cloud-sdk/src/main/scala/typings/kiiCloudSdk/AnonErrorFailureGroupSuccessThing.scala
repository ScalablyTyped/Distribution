package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.kiiCloudSdk.KiiCloud.KiiUser
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorFailureGroupSuccessThing extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing, group: KiiUser): js.Any
}

object AnonErrorFailureGroupSuccessThing {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiUser) => js.Any): AnonErrorFailureGroupSuccessThing = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[AnonErrorFailureGroupSuccessThing]
  }
}

