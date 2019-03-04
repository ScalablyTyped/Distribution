package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailure extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(): js.Any
}

object Anon_ErrorFailure {
  @scala.inline
  def apply(failure: js.Function1[stdLib.Error, js.Any], success: js.Function0[js.Any]): Anon_ErrorFailure = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_ErrorFailure]
  }
}

