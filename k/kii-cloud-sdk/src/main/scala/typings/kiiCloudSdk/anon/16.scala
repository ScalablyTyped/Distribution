package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGcmInstallationResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `16` extends js.Object {
  def failure(error: Error): js.Any
  def success(response: KiiGcmInstallationResponse): js.Any
}

object `16` {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiGcmInstallationResponse => js.Any): `16` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`16`]
  }
}

