package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrString extends js.Object {
  def failure(errString: java.lang.String): js.Any
  def success(): js.Any
}

object Anon_ErrString {
  @scala.inline
  def apply(failure: js.Function1[java.lang.String, js.Any], success: js.Function0[js.Any]): Anon_ErrString = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_ErrString]
  }
}

