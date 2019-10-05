package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiThing
import typings.kiiDashCloudDashSdk.KiiCloud.KiiUser
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureIsOwner extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing, user: KiiUser, isOwner: Boolean): js.Any
}

object Anon_ErrorFailureIsOwner {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiUser, Boolean) => js.Any): Anon_ErrorFailureIsOwner = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureIsOwner]
  }
}

