package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureSuccess extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(thing: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing): js.Any
}

object Anon_ErrorFailureSuccess {
  @scala.inline
  def apply(
    failure: js.Function1[stdLib.Error, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing, js.Any]
  ): Anon_ErrorFailureSuccess = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_ErrorFailureSuccess]
  }
}

