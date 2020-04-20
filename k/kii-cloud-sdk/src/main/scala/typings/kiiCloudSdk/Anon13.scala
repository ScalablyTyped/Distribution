package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon13 extends js.Object {
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  def success(theDeletedGroup: KiiGroup): js.Any
}

object Anon13 {
  @scala.inline
  def apply(failure: (KiiGroup, String) => js.Any, success: KiiGroup => js.Any): Anon13 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Anon13]
  }
}

