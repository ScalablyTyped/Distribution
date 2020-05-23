package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiMqttEndpoint
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `18` extends js.Object {
  def failure(error: Error): js.Any
  def success(response: KiiMqttEndpoint): js.Any
}

object `18` {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiMqttEndpoint => js.Any): `18` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`18`]
  }
}

