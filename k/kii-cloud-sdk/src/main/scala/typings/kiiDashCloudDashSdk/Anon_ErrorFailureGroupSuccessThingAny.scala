package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiGroup
import typings.kiiDashCloudDashSdk.KiiCloud.KiiThing
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureGroupSuccessThingAny extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing, group: KiiGroup): js.Any
}

object Anon_ErrorFailureGroupSuccessThingAny {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiGroup) => js.Any): Anon_ErrorFailureGroupSuccessThingAny = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureGroupSuccessThingAny]
  }
}

