package typings.mailparser.mod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleParserOptions extends TransformOptions {
  var keepCidLinks: js.UndefOr[Boolean] = js.native
}

object SimpleParserOptions {
  @scala.inline
  def apply(): SimpleParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleParserOptions]
  }
  @scala.inline
  implicit class SimpleParserOptionsOps[Self <: SimpleParserOptions] (val x: Self) extends AnyVal {
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
    def setKeepCidLinks(value: Boolean): Self = this.set("keepCidLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepCidLinks: Self = this.set("keepCidLinks", js.undefined)
  }
  
}

