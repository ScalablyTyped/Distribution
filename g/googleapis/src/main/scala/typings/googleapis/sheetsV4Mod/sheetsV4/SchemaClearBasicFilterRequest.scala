package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Clears the basic filter, if any exists on the sheet.
  */
trait SchemaClearBasicFilterRequest extends StObject {
  
  /**
    * The sheet ID on which the basic filter should be cleared.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object SchemaClearBasicFilterRequest {
  
  inline def apply(): SchemaClearBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearBasicFilterRequest]
  }
  
  extension [Self <: SchemaClearBasicFilterRequest](x: Self) {
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
