package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `7` extends js.Object {
  def failure(bucketToDelete: KiiBucket, anErrorString: String): js.Any
  def success(deletedBucket: KiiBucket): js.Any
}

object `7` {
  @scala.inline
  def apply(failure: (KiiBucket, String) => js.Any, success: KiiBucket => js.Any): `7` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`7`]
  }
}

