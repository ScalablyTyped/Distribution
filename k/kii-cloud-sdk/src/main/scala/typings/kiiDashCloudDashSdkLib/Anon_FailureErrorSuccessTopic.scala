package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureErrorSuccessTopic[T] extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(topic: kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic, message: T): js.Any
}

