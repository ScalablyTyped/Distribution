package typings.linkifyMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkifyOptions extends js.Object {
  var repository: js.UndefOr[String] = js.native
  var strong: js.UndefOr[Boolean] = js.native
}

object LinkifyOptions {
  @scala.inline
  def apply(): LinkifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkifyOptions]
  }
  @scala.inline
  implicit class LinkifyOptionsOps[Self <: LinkifyOptions] (val x: Self) extends AnyVal {
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
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    @scala.inline
    def setStrong(value: Boolean): Self = this.set("strong", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
  }
  
}

