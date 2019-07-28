package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccess extends js.Object {
  def failure(theACL: KiiACL, anErrorString: String): js.Any
  def success(theSavedACL: KiiACL): js.Any
}

object Anon_AnErrorStringFailureSuccess {
  @scala.inline
  def apply(failure: (KiiACL, String) => js.Any, success: KiiACL => js.Any): Anon_AnErrorStringFailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccess]
  }
}

