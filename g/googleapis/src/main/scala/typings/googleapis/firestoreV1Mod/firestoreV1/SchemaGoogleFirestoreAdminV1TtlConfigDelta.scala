package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1TtlConfigDelta extends StObject {
  
  /**
    * Specifies how the TTL configuration is changing.
    */
  var changeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1TtlConfigDelta {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1TtlConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1TtlConfigDelta]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1TtlConfigDelta](x: Self) {
    
    inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeNull: Self = StObject.set(x, "changeType", null)
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
  }
}
