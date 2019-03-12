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
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket, java.lang.String) => js.Any,
    success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiBucket => js.Any
  ): Anon_AnErrorStringBucketToDelete = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringBucketToDelete]
  }
}

