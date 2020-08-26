package typings.javascriptObfuscator.estreeMod

import typings.javascriptObfuscator.escodegenMod.XVerbatimProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpLiteral extends BaseNode {
  @JSName("metadata")
  var metadata_RegExpLiteral: js.UndefOr[LiteralNodeMetadata] = js.native
  var `x-verbatim-property`: js.UndefOr[XVerbatimProperty] = js.native
}

object RegExpLiteral {
  @scala.inline
  def apply(): RegExpLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegExpLiteral]
  }
  @scala.inline
  implicit class RegExpLiteralOps[Self <: RegExpLiteral] (val x: Self) extends AnyVal {
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

