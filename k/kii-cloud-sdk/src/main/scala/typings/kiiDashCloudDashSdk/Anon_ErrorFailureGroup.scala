package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiUser
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureGroup extends js.Object {
  def failure(error: Error): js.Any
  def success(group: KiiUser): js.Any
}

object Anon_ErrorFailureGroup {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiUser => js.Any): Anon_ErrorFailureGroup = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureGroup]
  }
}

