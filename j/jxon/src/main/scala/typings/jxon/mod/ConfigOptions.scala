package typings.jxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends js.Object {
  
  var attrKey: js.UndefOr[String] = js.native
  
  var attrPrefix: js.UndefOr[String] = js.native
  
  var autoDate: js.UndefOr[Boolean] = js.native
  
  var ignorePrefixedNodes: js.UndefOr[Boolean] = js.native
  
  var lowerCaseTags: js.UndefOr[Boolean] = js.native
  
  var parseValues: js.UndefOr[Boolean] = js.native
  
  var trueIsEmpty: js.UndefOr[Boolean] = js.native
  
  var valueKey: js.UndefOr[String] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setAttrKey(value: String): Self = this.set("attrKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrKey: Self = this.set("attrKey", js.undefined)
    
    @scala.inline
    def setAttrPrefix(value: String): Self = this.set("attrPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrPrefix: Self = this.set("attrPrefix", js.undefined)
    
    @scala.inline
    def setAutoDate(value: Boolean): Self = this.set("autoDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDate: Self = this.set("autoDate", js.undefined)
    
    @scala.inline
    def setIgnorePrefixedNodes(value: Boolean): Self = this.set("ignorePrefixedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePrefixedNodes: Self = this.set("ignorePrefixedNodes", js.undefined)
    
    @scala.inline
    def setLowerCaseTags(value: Boolean): Self = this.set("lowerCaseTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCaseTags: Self = this.set("lowerCaseTags", js.undefined)
    
    @scala.inline
    def setParseValues(value: Boolean): Self = this.set("parseValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseValues: Self = this.set("parseValues", js.undefined)
    
    @scala.inline
    def setTrueIsEmpty(value: Boolean): Self = this.set("trueIsEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrueIsEmpty: Self = this.set("trueIsEmpty", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
  }
}
