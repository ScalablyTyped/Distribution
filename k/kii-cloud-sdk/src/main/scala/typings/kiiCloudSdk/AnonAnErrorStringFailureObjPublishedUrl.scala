package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorStringFailureObjPublishedUrl extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any
  def success(obj: KiiObject, publishedUrl: String): js.Any
}

object AnonAnErrorStringFailureObjPublishedUrl {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: (KiiObject, String) => js.Any): AnonAnErrorStringFailureObjPublishedUrl = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[AnonAnErrorStringFailureObjPublishedUrl]
  }
}

