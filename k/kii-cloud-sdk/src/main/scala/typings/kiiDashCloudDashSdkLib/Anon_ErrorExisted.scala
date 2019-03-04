package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorExisted extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(existed: scala.Boolean): js.Any
}

object Anon_ErrorExisted {
  @scala.inline
  def apply(failure: js.Function1[stdLib.Error, js.Any], success: js.Function1[scala.Boolean, js.Any]): Anon_ErrorExisted = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_ErrorExisted]
  }
}

