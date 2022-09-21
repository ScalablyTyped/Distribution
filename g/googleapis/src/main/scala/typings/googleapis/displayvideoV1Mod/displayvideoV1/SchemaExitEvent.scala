package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExitEvent extends StObject {
  
  /**
    * The name of the click tag of the exit event. The name must be unique within one creative. Leave it empty or unset for creatives containing image assets only.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name used to identify this event in reports. Leave it empty or unset for creatives containing image assets only.
    */
  var reportingName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of the exit event.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The click through URL of the exit event. This is required when type is: * `EXIT_EVENT_TYPE_DEFAULT` * `EXIT_EVENT_TYPE_BACKUP`
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaExitEvent {
  
  inline def apply(): SchemaExitEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExitEvent]
  }
  
  extension [Self <: SchemaExitEvent](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingName(value: String): Self = StObject.set(x, "reportingName", value.asInstanceOf[js.Any])
    
    inline def setReportingNameNull: Self = StObject.set(x, "reportingName", null)
    
    inline def setReportingNameUndefined: Self = StObject.set(x, "reportingName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
