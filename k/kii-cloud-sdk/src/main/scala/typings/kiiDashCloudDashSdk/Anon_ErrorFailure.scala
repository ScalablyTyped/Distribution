package typings.kiiDashCloudDashSdk

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailure extends js.Object {
  def failure(error: Error): js.Any
  def success(): js.Any
}

object Anon_ErrorFailure {
  @scala.inline
  def apply(failure: Error => js.Any, success: () => js.Any): Anon_ErrorFailure = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
  
    __obj.asInstanceOf[Anon_ErrorFailure]
  }
}

