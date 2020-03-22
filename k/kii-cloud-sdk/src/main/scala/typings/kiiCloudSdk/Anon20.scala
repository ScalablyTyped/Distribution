package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiMqttInstallationResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon20 extends js.Object {
  def failure(error: Error): js.Any
  def success(response: KiiMqttInstallationResponse): js.Any
}

object Anon20 {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiMqttInstallationResponse => js.Any): Anon20 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon20]
  }
}

