package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiThing
import typings.kiiDashCloudDashSdk.KiiCloud.KiiUser
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureGroupSuccessThing extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing, group: KiiUser): js.Any
}

object Anon_ErrorFailureGroupSuccessThing {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiUser) => js.Any): Anon_ErrorFailureGroupSuccessThing = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureGroupSuccessThing]
  }
}

