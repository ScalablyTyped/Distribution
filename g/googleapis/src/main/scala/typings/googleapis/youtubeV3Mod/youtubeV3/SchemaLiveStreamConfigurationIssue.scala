package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveStreamConfigurationIssue extends StObject {
  
  /**
    * The long-form description of the issue and how to resolve it.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The short-form reason for this issue.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * How severe this issue is to the stream.
    */
  var severity: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of error happening.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaLiveStreamConfigurationIssue {
  
  @scala.inline
  def apply(): SchemaLiveStreamConfigurationIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamConfigurationIssue]
  }
  
  @scala.inline
  implicit class SchemaLiveStreamConfigurationIssueMutableBuilder[Self <: SchemaLiveStreamConfigurationIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
