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
    failure: js.Function3[
      kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, 
      java.lang.String, 
      java.lang.String, 
      js.Any
    ],
    success: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, java.lang.String, js.Any]
  ): Anon_AnErrorStringFailureSuccessTheSrcObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheSrcObject]
  }
}

