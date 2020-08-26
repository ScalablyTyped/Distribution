package typings.javascriptObfuscator.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralNodeMetadata extends BaseNodeMetadata {
  var replacedLiteral: js.UndefOr[Boolean] = js.native
}

object LiteralNodeMetadata {
  @scala.inline
  def apply(): LiteralNodeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiteralNodeMetadata]
  }
  @scala.inline
  implicit class LiteralNodeMetadataOps[Self <: LiteralNodeMetadata] (val x: Self) extends AnyVal {
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
    def setReplacedLiteral(value: Boolean): Self = this.set("replacedLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacedLiteral: Self = this.set("replacedLiteral", js.undefined)
  }
  
}

