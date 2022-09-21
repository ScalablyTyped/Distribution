package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2RevisionScaling extends StObject {
  
  /**
    * Maximum number of serving instances that this resource should have.
    */
  var maxInstanceCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum number of serving instances that this resource should have.
    */
  var minInstanceCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRunV2RevisionScaling {
  
  inline def apply(): SchemaGoogleCloudRunV2RevisionScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2RevisionScaling]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2RevisionScaling](x: Self) {
    
    inline def setMaxInstanceCount(value: Double): Self = StObject.set(x, "maxInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setMaxInstanceCountNull: Self = StObject.set(x, "maxInstanceCount", null)
    
    inline def setMaxInstanceCountUndefined: Self = StObject.set(x, "maxInstanceCount", js.undefined)
    
    inline def setMinInstanceCount(value: Double): Self = StObject.set(x, "minInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setMinInstanceCountNull: Self = StObject.set(x, "minInstanceCount", null)
    
    inline def setMinInstanceCountUndefined: Self = StObject.set(x, "minInstanceCount", js.undefined)
  }
}
