package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureObj extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any
  def success(theDeletedObject: KiiObject): js.Any
}

object Anon_AnErrorStringFailureObj {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: KiiObject => js.Any): Anon_AnErrorStringFailureObj = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureObj]
  }
}

