package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  def failure(error: Error): js.Any
  def success(group: KiiGroup): js.Any
}

object `3` {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiGroup => js.Any): `3` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`3`]
  }
}

