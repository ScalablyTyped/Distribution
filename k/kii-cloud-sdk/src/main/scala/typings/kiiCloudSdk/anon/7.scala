package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `7` extends js.Object {
  def failure(bucketToDelete: KiiBucket, anErrorString: String): js.Any = js.native
  def success(deletedBucket: KiiBucket): js.Any = js.native
}

object `7` {
  @scala.inline
  def apply(failure: (KiiBucket, String) => js.Any, success: KiiBucket => js.Any): `7` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`7`]
  }
  @scala.inline
  implicit class `7Ops`[Self <: `7`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailure(value: (KiiBucket, String) => js.Any): Self = this.set("failure", js.Any.fromFunction2(value))
    @scala.inline
    def setSuccess(value: KiiBucket => js.Any): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

