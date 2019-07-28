package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheSrcObject extends js.Object {
  def failure(theSrcObject: KiiObject, theTgtObjectUri: String, anErrorString: String): js.Any
  def success(theSrcObject: KiiObject, theTgtObjectUri: String): js.Any
}

object Anon_AnErrorStringFailureSuccessTheSrcObject {
  @scala.inline
  def apply(failure: (KiiObject, String, String) => js.Any, success: (KiiObject, String) => js.Any): Anon_AnErrorStringFailureSuccessTheSrcObject = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheSrcObject]
  }
}

