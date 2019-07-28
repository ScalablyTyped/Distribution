package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiObject
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringBodyBlob extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any
  def success(obj: KiiObject, bodyBlob: Blob): js.Any
}

object Anon_AnErrorStringBodyBlob {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: (KiiObject, Blob) => js.Any): Anon_AnErrorStringBodyBlob = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringBodyBlob]
  }
}

