package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureIsOwner[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */] extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(thing: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing, user: T, isOwner: scala.Boolean): js.Any
}

object Anon_ErrorFailureIsOwner {
  @scala.inline
  def apply[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */](
    failure: js.Function1[stdLib.Error, js.Any],
    success: js.Function3[kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing, T, scala.Boolean, js.Any]
  ): Anon_ErrorFailureIsOwner[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_ErrorFailureIsOwner[T]]
  }
}

