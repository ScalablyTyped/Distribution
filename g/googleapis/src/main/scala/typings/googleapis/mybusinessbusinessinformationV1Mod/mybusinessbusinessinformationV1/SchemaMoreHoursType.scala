package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMoreHoursType extends StObject {
  
  /**
    * Output only. The human-readable English display name for the hours type.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A stable ID provided by Google for this hours type.
    */
  var hoursTypeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The human-readable localized display name for the hours type.
    */
  var localizedDisplayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaMoreHoursType {
  
  inline def apply(): SchemaMoreHoursType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoreHoursType]
  }
  
  extension [Self <: SchemaMoreHoursType](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHoursTypeId(value: String): Self = StObject.set(x, "hoursTypeId", value.asInstanceOf[js.Any])
    
    inline def setHoursTypeIdNull: Self = StObject.set(x, "hoursTypeId", null)
    
    inline def setHoursTypeIdUndefined: Self = StObject.set(x, "hoursTypeId", js.undefined)
    
    inline def setLocalizedDisplayName(value: String): Self = StObject.set(x, "localizedDisplayName", value.asInstanceOf[js.Any])
    
    inline def setLocalizedDisplayNameNull: Self = StObject.set(x, "localizedDisplayName", null)
    
    inline def setLocalizedDisplayNameUndefined: Self = StObject.set(x, "localizedDisplayName", js.undefined)
  }
}
