package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessageStoragePolicy extends StObject {
  
  /**
    * A list of IDs of GCP regions where messages that are published to the topic may be persisted in storage. Messages published by publishers running in non-allowed GCP regions (or running outside of GCP altogether) will be routed for storage in one of the allowed regions. An empty list means that no regions are allowed, and is not a valid configuration.
    */
  var allowedPersistenceRegions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaMessageStoragePolicy {
  
  inline def apply(): SchemaMessageStoragePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageStoragePolicy]
  }
  
  extension [Self <: SchemaMessageStoragePolicy](x: Self) {
    
    inline def setAllowedPersistenceRegions(value: js.Array[String]): Self = StObject.set(x, "allowedPersistenceRegions", value.asInstanceOf[js.Any])
    
    inline def setAllowedPersistenceRegionsNull: Self = StObject.set(x, "allowedPersistenceRegions", null)
    
    inline def setAllowedPersistenceRegionsUndefined: Self = StObject.set(x, "allowedPersistenceRegions", js.undefined)
    
    inline def setAllowedPersistenceRegionsVarargs(value: String*): Self = StObject.set(x, "allowedPersistenceRegions", js.Array(value*))
  }
}
