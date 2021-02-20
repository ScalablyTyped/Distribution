package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of adding a sheet.
  */
@js.native
trait SchemaAddSheetResponse extends StObject {
  
  /**
    * The properties of the newly added sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
}
object SchemaAddSheetResponse {
  
  @scala.inline
  def apply(): SchemaAddSheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSheetResponse]
  }
  
  @scala.inline
  implicit class SchemaAddSheetResponseMutableBuilder[Self <: SchemaAddSheetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: SchemaSheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
