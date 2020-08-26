package typings.javascriptObfuscator.estreeMod

import typings.javascriptObfuscator.escodegenMod.XVerbatimProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleLiteral extends BaseNode {
  @JSName("metadata")
  var metadata_SimpleLiteral: js.UndefOr[LiteralNodeMetadata] = js.native
  var `x-verbatim-property`: js.UndefOr[XVerbatimProperty] = js.native
}

object SimpleLiteral {
  @scala.inline
  def apply(): SimpleLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleLiteral]
  }
  @scala.inline
  implicit class SimpleLiteralOps[Self <: SimpleLiteral] (val x: Self) extends AnyVal {
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
    def setMetadata(value: LiteralNodeMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def `setX-verbatim-property`(value: XVerbatimProperty): Self = this.set("x-verbatim-property", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-verbatim-property`: Self = this.set("x-verbatim-property", js.undefined)
  }
  
}

