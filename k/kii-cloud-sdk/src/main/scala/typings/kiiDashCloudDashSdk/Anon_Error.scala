package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiThingContext
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  def failure(error: Error): js.Any
  def success(thingContext: KiiThingContext): js.Any
}

object Anon_Error {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiThingContext => js.Any): Anon_Error = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_Error]
  }
}

