package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheDeletedObject extends js.Object {
  def failure(theObject: KiiObject, anErrorString: String): js.Any
  def success(theDeletedObject: KiiObject): js.Any
}

object Anon_AnErrorStringFailureSuccessTheDeletedObject {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: KiiObject => js.Any): Anon_AnErrorStringFailureSuccessTheDeletedObject = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheDeletedObject]
  }
}

