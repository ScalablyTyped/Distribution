package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2TrafficTargetStatus extends StObject {
  
  /**
    * Specifies percent of the traffic to this Revision.
    */
  var percent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Revision to which this traffic is sent.
    */
  var revision: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the string used in the URI to exclusively reference this target.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The allocation type for this traffic target.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Displays the target URI.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRunV2TrafficTargetStatus {
  
  inline def apply(): SchemaGoogleCloudRunV2TrafficTargetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2TrafficTargetStatus]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2TrafficTargetStatus](x: Self) {
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentNull: Self = StObject.set(x, "percent", null)
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
