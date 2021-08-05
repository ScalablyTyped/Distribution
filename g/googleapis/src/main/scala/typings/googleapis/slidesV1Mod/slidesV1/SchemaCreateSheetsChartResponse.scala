package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of creating an embedded Google Sheets chart.
  */
trait SchemaCreateSheetsChartResponse extends StObject {
  
  /**
    * The object ID of the created chart.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object SchemaCreateSheetsChartResponse {
  
  inline def apply(): SchemaCreateSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSheetsChartResponse]
  }
  
  extension [Self <: SchemaCreateSheetsChartResponse](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
