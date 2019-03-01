package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringBucketToDelete extends js.Object {
  def failure(bucketToDelete: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, anErrorString: java.lang.String): js.Any
  def success(deletedBucket: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket): js.Any
}

object Anon_AnErrorStringBucketToDelete {
  @scala.inline
  def apply(
    failure: js.Function2[kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, java.lang.String, js.Any],
    success: js.Function1[kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, js.Any]
  ): Anon_AnErrorStringBucketToDelete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorStringBucketToDelete]
  }
}

