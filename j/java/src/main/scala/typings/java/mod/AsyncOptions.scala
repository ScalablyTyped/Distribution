package typings.java.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncOptions extends js.Object {
  var asyncSuffix: js.UndefOr[String] = js.native
  var promiseSuffix: js.UndefOr[String] = js.native
  var promisify: js.UndefOr[Promisify] = js.native
  var syncSuffix: String = js.native
}

object AsyncOptions {
  @scala.inline
  def apply(syncSuffix: String): AsyncOptions = {
    val __obj = js.Dynamic.literal(syncSuffix = syncSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncOptions]
  }
  @scala.inline
  implicit class AsyncOptionsOps[Self <: AsyncOptions] (val x: Self) extends AnyVal {
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
    def setSyncSuffix(value: String): Self = this.set("syncSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsyncSuffix(value: String): Self = this.set("asyncSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncSuffix: Self = this.set("asyncSuffix", js.undefined)
    @scala.inline
    def setPromiseSuffix(value: String): Self = this.set("promiseSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromiseSuffix: Self = this.set("promiseSuffix", js.undefined)
    @scala.inline
    def setPromisify(value: (/* funct */ js.Function, /* receiver */ js.UndefOr[js.Any]) => js.Function): Self = this.set("promisify", js.Any.fromFunction2(value))
    @scala.inline
    def deletePromisify: Self = this.set("promisify", js.undefined)
  }
  
}

