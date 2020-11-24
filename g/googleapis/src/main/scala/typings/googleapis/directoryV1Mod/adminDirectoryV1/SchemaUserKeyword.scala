package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a keyword entry.
  */
@js.native
trait SchemaUserKeyword extends js.Object {
  
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  
  /**
    * Each entry can have a type which indicates standard type of that entry.
    * For example, keyword could be of type occupation or outlook. In addition
    * to the standard type, an entry can have a custom type and can give it any
    * name. Such types should have the CUSTOM value as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Keyword.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaUserKeyword {
  
  @scala.inline
  def apply(): SchemaUserKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserKeyword]
  }
  
  @scala.inline
  implicit class SchemaUserKeywordOps[Self <: SchemaUserKeyword] (val x: Self) extends AnyVal {
    
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
    def setCustomType(value: String): Self = this.set("customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
