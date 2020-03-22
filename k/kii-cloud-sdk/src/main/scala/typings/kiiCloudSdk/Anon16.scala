package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon16 extends js.Object {
  def failure(theSrcObject: KiiObject, theTgtObjectUri: String, anErrorString: String): js.Any
  def success(theSrcObject: KiiObject, theTgtObjectUri: String): js.Any
}

object Anon16 {
  @scala.inline
  def apply(failure: (KiiObject, String, String) => js.Any, success: (KiiObject, String) => js.Any): Anon16 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon16]
  }
}

