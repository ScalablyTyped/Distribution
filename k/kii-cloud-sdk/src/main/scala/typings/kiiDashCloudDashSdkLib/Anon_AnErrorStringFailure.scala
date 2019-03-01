package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailure extends js.Object {
  def failure(theACL: kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL, anErrorString: java.lang.String): js.Any
  def success(
    theACL: kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL,
    theEntries: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLEntry]
  ): js.Any
}

object Anon_AnErrorStringFailure {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL, java.lang.String, js.Any],
    success: js.Function2[
      kiiDashCloudDashSdkLib.KiiCloudNs.KiiACL, 
      js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiACLEntry], 
      js.Any
    ]
  ): Anon_AnErrorStringFailure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringFailure]
  }
}

