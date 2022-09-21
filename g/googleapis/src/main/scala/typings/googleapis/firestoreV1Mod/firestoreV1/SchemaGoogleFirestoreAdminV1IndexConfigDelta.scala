package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1IndexConfigDelta extends StObject {
  
  /**
    * Specifies how the index is changing.
    */
  var changeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The index being changed.
    */
  var index: js.UndefOr[SchemaGoogleFirestoreAdminV1Index] = js.undefined
}
object SchemaGoogleFirestoreAdminV1IndexConfigDelta {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1IndexConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1IndexConfigDelta]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1IndexConfigDelta](x: Self) {
    
    inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeNull: Self = StObject.set(x, "changeType", null)
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    inline def setIndex(value: SchemaGoogleFirestoreAdminV1Index): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
