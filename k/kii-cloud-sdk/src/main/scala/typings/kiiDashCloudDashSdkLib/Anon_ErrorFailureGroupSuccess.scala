package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureGroupSuccess[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */] extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(thing: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing, group: T): js.Any
}

object Anon_ErrorFailureGroupSuccess {
  @scala.inline
  def apply[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */](
    failure: js.Function1[stdLib.Error, js.Any],
    success: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing, T, js.Any]
  ): Anon_ErrorFailureGroupSuccess[T] = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_ErrorFailureGroupSuccess[T]]
  }
}

