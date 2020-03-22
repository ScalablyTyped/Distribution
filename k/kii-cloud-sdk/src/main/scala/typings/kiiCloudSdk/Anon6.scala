package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiUser
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon6 extends js.Object {
  def failure(error: Error): js.Any
  def success(group: KiiUser): js.Any
}

object Anon6 {
  @scala.inline
  def apply(failure: Error => js.Any, success: KiiUser => js.Any): Anon6 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon6]
  }
}

