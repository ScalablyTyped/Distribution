package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMode extends IModeBase {
  var contains: js.UndefOr[js.Array[IMode]] = js.native
  var keywords: js.UndefOr[js.Any] = js.native
}

object IMode {
  @scala.inline
  def apply(): IMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMode]
  }
  @scala.inline
  implicit class IModeOps[Self <: IMode] (val x: Self) extends AnyVal {
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
    def setContainsVarargs(value: IMode*): Self = this.set("contains", js.Array(value :_*))
    @scala.inline
    def setContains(value: js.Array[IMode]): Self = this.set("contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setKeywords(value: js.Any): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
  }
  
}

