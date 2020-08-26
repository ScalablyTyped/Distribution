package typings.jointjs.mod.Vectorizer

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBBoxOptions extends js.Object {
  var recursive: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[SVGElement | typings.jointjs.mod.Vectorizer] = js.native
}

object GetBBoxOptions {
  @scala.inline
  def apply(): GetBBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBBoxOptions]
  }
  @scala.inline
  implicit class GetBBoxOptionsOps[Self <: GetBBoxOptions] (val x: Self) extends AnyVal {
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
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    @scala.inline
    def setTarget(value: SVGElement | typings.jointjs.mod.Vectorizer): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

