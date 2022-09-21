package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveStreamConfigurationIssue extends StObject {
  
  /**
    * The long-form description of the issue and how to resolve it.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The short-form reason for this issue.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How severe this issue is to the stream.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of error happening.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveStreamConfigurationIssue {
  
  inline def apply(): SchemaLiveStreamConfigurationIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamConfigurationIssue]
  }
  
  extension [Self <: SchemaLiveStreamConfigurationIssue](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
