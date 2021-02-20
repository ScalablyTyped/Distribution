package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an index configuration change.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1IndexConfigDelta extends StObject {
  
  /**
    * Specifies how the index is changing.
    */
  var changeType: js.UndefOr[String] = js.native
  
  /**
    * The index being changed.
    */
  var index: js.UndefOr[SchemaGoogleFirestoreAdminV1Index] = js.native
}
object SchemaGoogleFirestoreAdminV1IndexConfigDelta {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1IndexConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1IndexConfigDelta]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1IndexConfigDeltaMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1IndexConfigDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    @scala.inline
    def setIndex(value: SchemaGoogleFirestoreAdminV1Index): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
