package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `31`[T] extends js.Object {
  def failure(error: Error): js.Any
  def success(topic: KiiTopic, message: T): js.Any
}

object `31` {
  @scala.inline
  def apply[T](failure: Error => js.Any, success: (KiiTopic, T) => js.Any): `31`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`31`[T]]
  }
}

