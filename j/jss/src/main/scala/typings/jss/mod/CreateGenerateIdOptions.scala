package typings.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGenerateIdOptions extends js.Object {
  var minify: js.UndefOr[Boolean] = js.native
}

object CreateGenerateIdOptions {
  @scala.inline
  def apply(): CreateGenerateIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGenerateIdOptions]
  }
  @scala.inline
  implicit class CreateGenerateIdOptionsOps[Self <: CreateGenerateIdOptions] (val x: Self) extends AnyVal {
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
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
  }
  
}

