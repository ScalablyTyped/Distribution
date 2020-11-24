package typings.knockoutMapping.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutMappingStandardOptions extends js.Object {
  
  var copy: js.UndefOr[js.Array[String]] = js.native
  
   // Undocumented
  var deferEvaluation: js.UndefOr[Boolean] = js.native
  
  var ignore: js.UndefOr[js.Array[String]] = js.native
  
  var include: js.UndefOr[js.Array[String]] = js.native
  
  var mappedProperties: js.UndefOr[js.Array[String]] = js.native
  
  var observe: js.UndefOr[js.Array[String]] = js.native
}
object KnockoutMappingStandardOptions {
  
  @scala.inline
  def apply(): KnockoutMappingStandardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutMappingStandardOptions]
  }
  
  @scala.inline
  implicit class KnockoutMappingStandardOptionsOps[Self <: KnockoutMappingStandardOptions] (val x: Self) extends AnyVal {
    
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
    def setCopyVarargs(value: String*): Self = this.set("copy", js.Array(value :_*))
    
    @scala.inline
    def setCopy(value: js.Array[String]): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setDeferEvaluation(value: Boolean): Self = this.set("deferEvaluation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferEvaluation: Self = this.set("deferEvaluation", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setMappedPropertiesVarargs(value: String*): Self = this.set("mappedProperties", js.Array(value :_*))
    
    @scala.inline
    def setMappedProperties(value: js.Array[String]): Self = this.set("mappedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMappedProperties: Self = this.set("mappedProperties", js.undefined)
    
    @scala.inline
    def setObserveVarargs(value: String*): Self = this.set("observe", js.Array(value :_*))
    
    @scala.inline
    def setObserve(value: js.Array[String]): Self = this.set("observe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObserve: Self = this.set("observe", js.undefined)
  }
}
