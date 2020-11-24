package typings.highlightJs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageDetail extends js.Object {
  
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  var case_insensitive: js.UndefOr[Boolean] = js.native
  
  var classNameAliases: js.UndefOr[Record[String, String]] = js.native
  
  var compiled: js.UndefOr[Boolean] = js.native
  
  var contains: js.Array[Mode] = js.native
  
  var disableAutodetect: js.UndefOr[Boolean] = js.native
  
  var exports: js.UndefOr[js.Any] = js.native
  
  var keywords: js.UndefOr[(Record[String, _]) | String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var rawDefinition: js.UndefOr[js.Function0[Language]] = js.native
}
object LanguageDetail {
  
  @scala.inline
  def apply(contains: js.Array[Mode]): LanguageDetail = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetail]
  }
  
  @scala.inline
  implicit class LanguageDetailOps[Self <: LanguageDetail] (val x: Self) extends AnyVal {
    
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
    def setContainsVarargs(value: Mode*): Self = this.set("contains", js.Array(value :_*))
    
    @scala.inline
    def setContains(value: js.Array[Mode]): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setCase_insensitive(value: Boolean): Self = this.set("case_insensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCase_insensitive: Self = this.set("case_insensitive", js.undefined)
    
    @scala.inline
    def setClassNameAliases(value: Record[String, String]): Self = this.set("classNameAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNameAliases: Self = this.set("classNameAliases", js.undefined)
    
    @scala.inline
    def setCompiled(value: Boolean): Self = this.set("compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiled: Self = this.set("compiled", js.undefined)
    
    @scala.inline
    def setDisableAutodetect(value: Boolean): Self = this.set("disableAutodetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutodetect: Self = this.set("disableAutodetect", js.undefined)
    
    @scala.inline
    def setExports(value: js.Any): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExports: Self = this.set("exports", js.undefined)
    
    @scala.inline
    def setKeywords(value: (Record[String, _]) | String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRawDefinition(value: () => Language): Self = this.set("rawDefinition", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRawDefinition: Self = this.set("rawDefinition", js.undefined)
  }
}
