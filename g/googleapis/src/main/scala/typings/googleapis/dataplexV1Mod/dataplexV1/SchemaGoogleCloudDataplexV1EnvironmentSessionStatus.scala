package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1EnvironmentSessionStatus extends StObject {
  
  /**
    * Output only. Queries over sessions to mark whether the environment is currently active or not
    */
  var active: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1EnvironmentSessionStatus {
  
  inline def apply(): SchemaGoogleCloudDataplexV1EnvironmentSessionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1EnvironmentSessionStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1EnvironmentSessionStatus](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveNull: Self = StObject.set(x, "active", null)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
  }
}
