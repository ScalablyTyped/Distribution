package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes the requested sheet.
  */
trait SchemaDeleteSheetRequest extends StObject {
  
  /**
    * The ID of the sheet to delete.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object SchemaDeleteSheetRequest {
  
  @scala.inline
  def apply(): SchemaDeleteSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteSheetRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteSheetRequestMutableBuilder[Self <: SchemaDeleteSheetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
