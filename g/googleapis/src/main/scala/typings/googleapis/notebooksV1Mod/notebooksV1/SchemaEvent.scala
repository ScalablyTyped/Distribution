package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEvent extends StObject {
  
  /**
    * Optional. Event details. This field is used to pass event information.
    */
  var details: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Event report time.
    */
  var reportTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Event type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaEvent {
  
  inline def apply(): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvent]
  }
  
  extension [Self <: SchemaEvent](x: Self) {
    
    inline def setDetails(value: StringDictionary[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeNull: Self = StObject.set(x, "reportTime", null)
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
