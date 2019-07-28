package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiBucket
import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucket extends js.Object {
  def failure(bucket: KiiBucket, errorString: String): js.Any
  def success(bucket: KiiBucket, query: KiiQuery, count: Double): js.Any
}

object Anon_Bucket {
  @scala.inline
  def apply(failure: (KiiBucket, String) => js.Any, success: (KiiBucket, KiiQuery, Double) => js.Any): Anon_Bucket = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_Bucket]
  }
}

