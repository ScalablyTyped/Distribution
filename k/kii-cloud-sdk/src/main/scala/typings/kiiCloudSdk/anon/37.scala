package typings.kiiCloudSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `37` extends js.Object {
  def failure(errString: String): js.Any
  def success(): js.Any
}

object `37` {
  @scala.inline
  def apply(failure: String => js.Any, success: () => js.Any): `37` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
    __obj.asInstanceOf[`37`]
  }
}

