package typings.kiiCloudSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon36 extends js.Object {
  def failure(errString: String): js.Any
  def success(): js.Any
}

object Anon36 {
  @scala.inline
  def apply(failure: String => js.Any, success: () => js.Any): Anon36 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
  
    __obj.asInstanceOf[Anon36]
  }
}

