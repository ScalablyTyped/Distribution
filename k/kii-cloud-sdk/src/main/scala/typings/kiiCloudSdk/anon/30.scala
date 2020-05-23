package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `30` extends js.Object {
  def failure(error: Error): js.Any
  def success(topic: KiiTopic): js.Any
}

object `30` {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiTopic => js.Any): `30` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`30`]
  }
}

