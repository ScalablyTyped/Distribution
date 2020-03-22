package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.kiiCloudSdk.KiiCloud.KiiUser
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon28 extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing, user: KiiUser, isOwner: Boolean): js.Any
}

object Anon28 {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiUser, Boolean) => js.Any): Anon28 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon28]
  }
}

