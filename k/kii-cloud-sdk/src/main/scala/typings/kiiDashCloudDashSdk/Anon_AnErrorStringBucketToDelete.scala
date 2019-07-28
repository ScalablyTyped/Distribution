package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiBucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringBucketToDelete extends js.Object {
  def failure(bucketToDelete: KiiBucket, anErrorString: String): js.Any
  def success(deletedBucket: KiiBucket): js.Any
}

object Anon_AnErrorStringBucketToDelete {
  @scala.inline
  def apply(failure: (KiiBucket, String) => js.Any, success: KiiBucket => js.Any): Anon_AnErrorStringBucketToDelete = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringBucketToDelete]
  }
}

