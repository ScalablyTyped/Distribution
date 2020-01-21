package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorFailureGroupSuccessThingAny extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing, group: KiiGroup): js.Any
}

object AnonErrorFailureGroupSuccessThingAny {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiGroup) => js.Any): AnonErrorFailureGroupSuccessThingAny = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[AnonErrorFailureGroupSuccessThingAny]
  }
}

