package typings.javascriptObfuscator.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseNodeMetadata extends js.Object {
  var ignoredNode: js.UndefOr[Boolean] = js.native
}

object BaseNodeMetadata {
  @scala.inline
  def apply(): BaseNodeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseNodeMetadata]
  }
  @scala.inline
  implicit class BaseNodeMetadataOps[Self <: BaseNodeMetadata] (val x: Self) extends AnyVal {
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
    def setIgnoredNode(value: Boolean): Self = this.set("ignoredNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoredNode: Self = this.set("ignoredNode", js.undefined)
  }
  
}

