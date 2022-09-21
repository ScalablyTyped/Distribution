package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplicaInfo extends StObject {
  
  /**
    * If true, this location is designated as the default leader location where leader replicas are placed. See the [region types documentation](https://cloud.google.com/spanner/docs/instances#region_types) for more details.
    */
  var defaultLeaderLocation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The location of the serving resources, e.g. "us-central1".
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of replica.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplicaInfo {
  
  inline def apply(): SchemaReplicaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicaInfo]
  }
  
  extension [Self <: SchemaReplicaInfo](x: Self) {
    
    inline def setDefaultLeaderLocation(value: Boolean): Self = StObject.set(x, "defaultLeaderLocation", value.asInstanceOf[js.Any])
    
    inline def setDefaultLeaderLocationNull: Self = StObject.set(x, "defaultLeaderLocation", null)
    
    inline def setDefaultLeaderLocationUndefined: Self = StObject.set(x, "defaultLeaderLocation", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
