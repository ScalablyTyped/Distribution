package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureGroup[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */] extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(group: T): js.Any
}

object Anon_ErrorFailureGroup {
  @scala.inline
  def apply[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */](failure: js.Function1[stdLib.Error, js.Any], success: js.Function1[T, js.Any]): Anon_ErrorFailureGroup[T] = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_ErrorFailureGroup[T]]
  }
}

