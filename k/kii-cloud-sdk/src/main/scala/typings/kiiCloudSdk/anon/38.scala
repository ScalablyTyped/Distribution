package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `38` extends js.Object {
  def failure(anErrorString: String): js.Any
  def success(theMatchedUser: KiiUser): js.Any
}

object `38` {
  @scala.inline
  def apply(failure: String => js.Any, success: KiiUser => js.Any): `38` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`38`]
  }
}

