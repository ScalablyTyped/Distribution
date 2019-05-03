package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureGroupSuccessThingAny extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(
    thing: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing,
    group: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup
  ): js.Any
}

object Anon_ErrorFailureGroupSuccessThingAny {
  @scala.inline
  def apply(
    failure: stdLib.Error => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing, kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup) => js.Any
  ): Anon_ErrorFailureGroupSuccessThingAny = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureGroupSuccessThingAny]
  }
}

