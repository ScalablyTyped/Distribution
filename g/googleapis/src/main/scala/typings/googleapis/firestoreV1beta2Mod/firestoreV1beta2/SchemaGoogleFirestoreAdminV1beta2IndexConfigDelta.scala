package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an index configuration change.
  */
trait SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta extends StObject {
  
  /**
    * Specifies how the index is changing.
    */
  var changeType: js.UndefOr[String] = js.undefined
  
  /**
    * The index being changed.
    */
  var index: js.UndefOr[SchemaGoogleFirestoreAdminV1beta2Index] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta](x: Self) {
    
    inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    inline def setIndex(value: SchemaGoogleFirestoreAdminV1beta2Index): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
