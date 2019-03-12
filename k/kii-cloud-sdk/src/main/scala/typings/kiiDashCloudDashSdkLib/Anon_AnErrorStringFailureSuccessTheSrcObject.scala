package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheSrcObject extends js.Object {
  def failure(
    theSrcObject: kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject,
    theTgtObjectUri: java.lang.String,
    anErrorString: java.lang.String
  ): js.Any
  def success(theSrcObject: kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, theTgtObjectUri: java.lang.String): js.Any
}

object Anon_AnErrorStringFailureSuccessTheSrcObject {
  @scala.inline
  def apply(
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, java.lang.String, java.lang.String) => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, java.lang.String) => js.Any
  ): Anon_AnErrorStringFailureSuccessTheSrcObject = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheSrcObject]
  }
}

