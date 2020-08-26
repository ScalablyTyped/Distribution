package typings.jsonld.mod.Options

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.JsonLdObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Common extends DocLoader {
  var base: js.UndefOr[String] = js.native
  var expandContext: js.UndefOr[Context] = js.native
}

object Common {
  @scala.inline
  def apply(): Common = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Common]
  }
  @scala.inline
  implicit class CommonOps[Self <: Common] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setExpandContextVarargs(value: JsonLdObj*): Self = this.set("expandContext", js.Array(value :_*))
    @scala.inline
    def setExpandContext(value: Context): Self = this.set("expandContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandContext: Self = this.set("expandContext", js.undefined)
  }
  
}

