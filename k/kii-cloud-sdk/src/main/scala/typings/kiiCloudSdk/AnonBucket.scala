package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import typings.kiiCloudSdk.KiiCloud.KiiQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBucket extends js.Object {
  def failure(bucket: KiiBucket, errorString: String): js.Any
  def success(bucket: KiiBucket, query: KiiQuery, count: Double): js.Any
}

object AnonBucket {
  @scala.inline
  def apply(failure: (KiiBucket, String) => js.Any, success: (KiiBucket, KiiQuery, Double) => js.Any): AnonBucket = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[AnonBucket]
  }
}

