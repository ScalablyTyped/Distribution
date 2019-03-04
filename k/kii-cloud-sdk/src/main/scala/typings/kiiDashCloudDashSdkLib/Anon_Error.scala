package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(thingContext: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThingContext): js.Any
}

object Anon_Error {
  @scala.inline
  def apply(
    failure: js.Function1[stdLib.Error, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiThingContext, js.Any]
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

