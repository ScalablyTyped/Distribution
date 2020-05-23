package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiThing
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `28` extends js.Object {
  def failure(error: Error): js.Any
  def success(thing: KiiThing, group: KiiGroup): js.Any
}

object `28` {
  @scala.inline
  def apply(failure: Error => js.Any, success: (KiiThing, KiiGroup) => js.Any): `28` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`28`]
  }
}

