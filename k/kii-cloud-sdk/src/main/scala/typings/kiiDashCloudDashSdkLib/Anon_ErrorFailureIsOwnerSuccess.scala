package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureIsOwnerSuccess extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(
    thing: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing,
    user: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup,
    isOwner: scala.Boolean
  ): js.Any
}

object Anon_ErrorFailureIsOwnerSuccess {
  @scala.inline
  def apply(
    failure: stdLib.Error => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing, kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup, scala.Boolean) => js.Any
  ): Anon_ErrorFailureIsOwnerSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureIsOwnerSuccess]
  }
}

