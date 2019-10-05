package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorString extends js.Object {
  def failure(user: KiiUser, errorString: String): js.Any
  def success(user: KiiUser): js.Any
}

object Anon_ErrorString {
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: KiiUser => js.Any): Anon_ErrorString = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorString]
  }
}

