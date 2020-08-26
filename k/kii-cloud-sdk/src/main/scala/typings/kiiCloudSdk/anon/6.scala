package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import typings.kiiCloudSdk.KiiCloud.KiiQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `6` extends js.Object {
  def failure(bucket: KiiBucket, errorString: String): js.Any = js.native
  def success(bucket: KiiBucket, query: KiiQuery, count: Double): js.Any = js.native
}

object `6` {
  @scala.inline
  def apply(failure: (KiiBucket, String) => js.Any, success: (KiiBucket, KiiQuery, Double) => js.Any): `6` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`6`]
  }
  @scala.inline
  implicit class `6Ops`[Self <: `6`] (val x: Self) extends AnyVal {
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
    def setSuccess(value: (KiiBucket, KiiQuery, Double) => js.Any): Self = this.set("success", js.Any.fromFunction3(value))
  }
  
}

