package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureObjPublishedUrl extends js.Object {
  def failure(obj: kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, anErrorString: java.lang.String): js.Any
  def success(obj: kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, publishedUrl: java.lang.String): js.Any
}

object Anon_AnErrorStringFailureObjPublishedUrl {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, java.lang.String, js.Any],
    success: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiObject, java.lang.String, js.Any]
  ): Anon_AnErrorStringFailureObjPublishedUrl = {
    val __obj = js.Dynamic.literal(failure = failure, success = success)
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureObjPublishedUrl]
  }
}

