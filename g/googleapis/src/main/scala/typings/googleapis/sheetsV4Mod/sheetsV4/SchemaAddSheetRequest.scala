package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a new sheet. When a sheet is added at a given index, all subsequent
  * sheets&#39; indexes are incremented. To add an object sheet, use
  * AddChartRequest instead and specify EmbeddedObjectPosition.sheetId or
  * EmbeddedObjectPosition.newSheet.
  */
@js.native
trait SchemaAddSheetRequest extends StObject {
  
  /**
    * The properties the new sheet should have. All properties are optional.
    * The sheetId field is optional; if one is not set, an id will be randomly
    * generated. (It is an error to specify the ID of a sheet that already
    * exists.)
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
}
object SchemaAddSheetRequest {
  
  @scala.inline
  def apply(): SchemaAddSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSheetRequest]
  }
  
  @scala.inline
  implicit class SchemaAddSheetRequestMutableBuilder[Self <: SchemaAddSheetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: SchemaSheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
