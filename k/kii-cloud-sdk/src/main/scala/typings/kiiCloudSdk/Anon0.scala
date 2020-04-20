package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiACL
import typings.kiiCloudSdk.KiiCloud.KiiACLEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  def failure(theACL: KiiACL, anErrorString: String): js.Any
  def success(theACL: KiiACL, theEntries: js.Array[KiiACLEntry]): js.Any
}

object Anon0 {
  @scala.inline
  def apply(failure: (KiiACL, String) => js.Any, success: (KiiACL, js.Array[KiiACLEntry]) => js.Any): Anon0 = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[Anon0]
  }
}

