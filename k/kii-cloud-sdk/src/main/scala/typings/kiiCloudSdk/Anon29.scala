package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon29 extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing, user: KiiGroup, isOwner: Boolean): js.Any
}

object Anon29 {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiGroup, Boolean) => js.Any): Anon29 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[Anon29]
  }
}

