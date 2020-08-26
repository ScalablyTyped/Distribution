package typings.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncOptions extends js.Object {
  /** Set a specific timeout in milliseconds (disabled) */
  var timeout: js.UndefOr[Double] = js.native
}

object AsyncOptions {
  @scala.inline
  def apply(): AsyncOptions = {
    val __obj = js.Dynamic.literal()
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
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

