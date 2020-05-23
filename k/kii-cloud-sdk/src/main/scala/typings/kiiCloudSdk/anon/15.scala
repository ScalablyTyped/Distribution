package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `15` extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any
  def success(obj: KiiObject, publishedUrl: String): js.Any
}

object `15` {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: (KiiObject, String) => js.Any): `15` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`15`]
  }
}

