package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon18 extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any
  def success(obj: KiiObject, publishedUrl: String): js.Any
}

object Anon18 {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: (KiiObject, String) => js.Any): Anon18 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon18]
  }
}

