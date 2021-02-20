package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of duplicating a sheet.
  */
@js.native
trait SchemaDuplicateSheetResponse extends StObject {
  
  /**
    * The properties of the duplicate sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
}
object SchemaDuplicateSheetResponse {
  
  @scala.inline
  def apply(): SchemaDuplicateSheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateSheetResponse]
  }
  
  @scala.inline
  implicit class SchemaDuplicateSheetResponseMutableBuilder[Self <: SchemaDuplicateSheetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: SchemaSheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
