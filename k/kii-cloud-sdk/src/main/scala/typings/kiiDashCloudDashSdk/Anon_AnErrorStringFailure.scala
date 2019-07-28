package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACL
import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiACLEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailure extends js.Object {
  def failure(theACL: KiiACL, anErrorString: String): js.Any
  def success(theACL: KiiACL, theEntries: js.Array[KiiACLEntry]): js.Any
}

object Anon_AnErrorStringFailure {
  @scala.inline
  def apply(failure: (KiiACL, String) => js.Any, success: (KiiACL, js.Array[KiiACLEntry]) => js.Any): Anon_AnErrorStringFailure = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailure]
  }
}

