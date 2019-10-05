package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiGroup
import typings.kiiDashCloudDashSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheGroupTheOwner extends js.Object {
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  def success(theGroup: KiiGroup, theOwner: KiiUser): js.Any
}

object Anon_AnErrorStringFailureSuccessTheGroupTheOwner {
  @scala.inline
  def apply(failure: (KiiGroup, String) => js.Any, success: (KiiGroup, KiiUser) => js.Any): Anon_AnErrorStringFailureSuccessTheGroupTheOwner = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheGroupTheOwner]
  }
}

