package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationPreference extends StObject {
  
  /**
    * The App Engine application to follow, it must be in the same region as the Cloud SQL instance.
    */
  var followGaeApplication: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always *sql#locationPreference*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.).
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocationPreference {
  
  inline def apply(): SchemaLocationPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationPreference]
  }
  
  extension [Self <: SchemaLocationPreference](x: Self) {
    
    inline def setFollowGaeApplication(value: String): Self = StObject.set(x, "followGaeApplication", value.asInstanceOf[js.Any])
    
    inline def setFollowGaeApplicationNull: Self = StObject.set(x, "followGaeApplication", null)
    
    inline def setFollowGaeApplicationUndefined: Self = StObject.set(x, "followGaeApplication", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
