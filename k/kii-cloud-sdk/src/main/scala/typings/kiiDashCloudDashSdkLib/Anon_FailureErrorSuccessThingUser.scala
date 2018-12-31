package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureErrorSuccessThingUser[T /* <: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser | kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup */] extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(thing: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing, user: T, isOwner: scala.Boolean): js.Any
}

