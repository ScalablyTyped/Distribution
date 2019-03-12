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
    failure: stdLib.Error => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing, T, scala.Boolean) => js.Any
  ): Anon_ErrorFailureIsOwner[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureIsOwner[T]]
  }
}

