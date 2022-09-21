package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCombinedAudience extends StObject {
  
  /**
    * Output only. The unique ID of the combined audience. Assigned by the system.
    */
  var combinedAudienceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The display name of the combined audience. .
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the combined audience.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaCombinedAudience {
  
  inline def apply(): SchemaCombinedAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCombinedAudience]
  }
  
  extension [Self <: SchemaCombinedAudience](x: Self) {
    
    inline def setCombinedAudienceId(value: String): Self = StObject.set(x, "combinedAudienceId", value.asInstanceOf[js.Any])
    
    inline def setCombinedAudienceIdNull: Self = StObject.set(x, "combinedAudienceId", null)
    
    inline def setCombinedAudienceIdUndefined: Self = StObject.set(x, "combinedAudienceId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
