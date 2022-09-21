package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOpenInfo extends StObject {
  
  /**
    * Output only. Indicates whether this business is eligible for re-open.
    */
  var canReopen: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The date on which the location first opened. If the exact day is not known, month and year only can be provided. The date must be in the past or be no more than one year in the future.
    */
  var openingDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Required. Indicates whether or not the Location is currently open for business. All locations are open by default, unless updated to be closed.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaOpenInfo {
  
  inline def apply(): SchemaOpenInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOpenInfo]
  }
  
  extension [Self <: SchemaOpenInfo](x: Self) {
    
    inline def setCanReopen(value: Boolean): Self = StObject.set(x, "canReopen", value.asInstanceOf[js.Any])
    
    inline def setCanReopenNull: Self = StObject.set(x, "canReopen", null)
    
    inline def setCanReopenUndefined: Self = StObject.set(x, "canReopen", js.undefined)
    
    inline def setOpeningDate(value: SchemaDate): Self = StObject.set(x, "openingDate", value.asInstanceOf[js.Any])
    
    inline def setOpeningDateUndefined: Self = StObject.set(x, "openingDate", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
