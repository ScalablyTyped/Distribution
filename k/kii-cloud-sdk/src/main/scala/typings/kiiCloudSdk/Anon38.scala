package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon38 extends js.Object {
  def failure(anErrorString: String): js.Any
  def success(theMatchedUser: KiiUser): js.Any
}

object Anon38 {
  @scala.inline
  def apply(failure: String => js.Any, success: KiiUser => js.Any): Anon38 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Anon38]
  }
}

