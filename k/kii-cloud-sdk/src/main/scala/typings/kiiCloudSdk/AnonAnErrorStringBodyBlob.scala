package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiObject
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorStringBodyBlob extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any
  def success(obj: KiiObject, bodyBlob: Blob): js.Any
}

object AnonAnErrorStringBodyBlob {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: (KiiObject, Blob) => js.Any): AnonAnErrorStringBodyBlob = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[AnonAnErrorStringBodyBlob]
  }
}

