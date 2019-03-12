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
  def apply(failure: stdLib.Error => js.Any, success: scala.Boolean => js.Any): Anon_ErrorExisted = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorExisted]
  }
}

