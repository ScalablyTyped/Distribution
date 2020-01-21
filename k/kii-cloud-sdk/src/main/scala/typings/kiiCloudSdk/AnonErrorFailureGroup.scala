package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiUser
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorFailureGroup extends js.Object {
  def failure(error: Error): js.Any
  def success(group: KiiUser): js.Any
}

object AnonErrorFailureGroup {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiUser => js.Any): AnonErrorFailureGroup = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonErrorFailureGroup]
  }
}

