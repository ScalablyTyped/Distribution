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
    failure: stdLib.Error => js.Any,
    success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThingContext => js.Any
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_Error]
  }
}

