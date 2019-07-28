package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureObjPublishedUrl extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any
  def success(obj: KiiObject, publishedUrl: String): js.Any
}

object Anon_AnErrorStringFailureObjPublishedUrl {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: (KiiObject, String) => js.Any): Anon_AnErrorStringFailureObjPublishedUrl = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureObjPublishedUrl]
  }
}

