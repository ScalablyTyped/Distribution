package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates properties of a spreadsheet.
  */
@js.native
trait SchemaUpdateSpreadsheetPropertiesRequest extends js.Object {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root &#39;properties&#39; is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The properties to update.
    */
  var properties: js.UndefOr[SchemaSpreadsheetProperties] = js.native
}
object SchemaUpdateSpreadsheetPropertiesRequest {
  
  @scala.inline
  def apply(): SchemaUpdateSpreadsheetPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSpreadsheetPropertiesRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateSpreadsheetPropertiesRequestOps[Self <: SchemaUpdateSpreadsheetPropertiesRequest] (val x: Self) extends AnyVal {
    
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setProperties(value: SchemaSpreadsheetProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
