package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  var classPrefix: js.UndefOr[String] = js.native
  var languages: js.UndefOr[js.Array[String]] = js.native
  var tabReplace: js.UndefOr[String] = js.native
  var useBR: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setClassPrefix(value: String): Self = this.set("classPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassPrefix: Self = this.set("classPrefix", js.undefined)
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    @scala.inline
    def setTabReplace(value: String): Self = this.set("tabReplace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabReplace: Self = this.set("tabReplace", js.undefined)
    @scala.inline
    def setUseBR(value: Boolean): Self = this.set("useBR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseBR: Self = this.set("useBR", js.undefined)
  }
  
}

