package typings.highlightJs.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModeBase extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.native
  var begin: js.UndefOr[String | RegExp] = js.native
  var beginKeyword: js.UndefOr[String] = js.native
  var case_insensitive: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var end: js.UndefOr[String | RegExp] = js.native
  var endsWithParent: js.UndefOr[Boolean] = js.native
  var excludeBegin: js.UndefOr[Boolean] = js.native
  var excludeEnd: js.UndefOr[Boolean] = js.native
  var illegal: js.UndefOr[String] = js.native
  var lexems: js.UndefOr[String] = js.native
  var relevance: js.UndefOr[Double] = js.native
  var returnBegin: js.UndefOr[Boolean] = js.native
  var returnEnd: js.UndefOr[Boolean] = js.native
  var starts: js.UndefOr[String] = js.native
  var subLanguage: js.UndefOr[String] = js.native
  var subLanguageMode: js.UndefOr[String] = js.native
  var variants: js.UndefOr[js.Array[IMode]] = js.native
}

object IModeBase {
  @scala.inline
  def apply(): IModeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModeBase]
  }
  @scala.inline
  implicit class IModeBaseOps[Self <: IModeBase] (val x: Self) extends AnyVal {
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
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    @scala.inline
    def setBegin(value: String | RegExp): Self = this.set("begin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    @scala.inline
    def setBeginKeyword(value: String): Self = this.set("beginKeyword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginKeyword: Self = this.set("beginKeyword", js.undefined)
    @scala.inline
    def setCase_insensitive(value: Boolean): Self = this.set("case_insensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCase_insensitive: Self = this.set("case_insensitive", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEnd(value: String | RegExp): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEndsWithParent(value: Boolean): Self = this.set("endsWithParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndsWithParent: Self = this.set("endsWithParent", js.undefined)
    @scala.inline
    def setExcludeBegin(value: Boolean): Self = this.set("excludeBegin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeBegin: Self = this.set("excludeBegin", js.undefined)
    @scala.inline
    def setExcludeEnd(value: Boolean): Self = this.set("excludeEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeEnd: Self = this.set("excludeEnd", js.undefined)
    @scala.inline
    def setIllegal(value: String): Self = this.set("illegal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIllegal: Self = this.set("illegal", js.undefined)
    @scala.inline
    def setLexems(value: String): Self = this.set("lexems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLexems: Self = this.set("lexems", js.undefined)
    @scala.inline
    def setRelevance(value: Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelevance: Self = this.set("relevance", js.undefined)
    @scala.inline
    def setReturnBegin(value: Boolean): Self = this.set("returnBegin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnBegin: Self = this.set("returnBegin", js.undefined)
    @scala.inline
    def setReturnEnd(value: Boolean): Self = this.set("returnEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnEnd: Self = this.set("returnEnd", js.undefined)
    @scala.inline
    def setStarts(value: String): Self = this.set("starts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarts: Self = this.set("starts", js.undefined)
    @scala.inline
    def setSubLanguage(value: String): Self = this.set("subLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubLanguage: Self = this.set("subLanguage", js.undefined)
    @scala.inline
    def setSubLanguageMode(value: String): Self = this.set("subLanguageMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubLanguageMode: Self = this.set("subLanguageMode", js.undefined)
    @scala.inline
    def setVariantsVarargs(value: IMode*): Self = this.set("variants", js.Array(value :_*))
    @scala.inline
    def setVariants(value: js.Array[IMode]): Self = this.set("variants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
  
}

