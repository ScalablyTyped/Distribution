package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMutationResult extends StObject {
  
  /**
    * Whether a conflict was detected for this mutation. Always false when a conflict detection strategy field is not set in the mutation.
    */
  var conflictDetected: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The automatically allocated key. Set only when the mutation allocated a key.
    */
  var key: js.UndefOr[SchemaKey] = js.undefined
  
  /**
    * The update time of the entity on the server after processing the mutation. If the mutation doesn't change anything on the server, then the timestamp will be the update timestamp of the current entity. This field will not be set after a 'delete'.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the entity on the server after processing the mutation. If the mutation doesn't change anything on the server, then the version will be the version of the current entity or, if no entity is present, a version that is strictly greater than the version of any previous entity and less than the version of any possible future entity.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaMutationResult {
  
  inline def apply(): SchemaMutationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutationResult]
  }
  
  extension [Self <: SchemaMutationResult](x: Self) {
    
    inline def setConflictDetected(value: Boolean): Self = StObject.set(x, "conflictDetected", value.asInstanceOf[js.Any])
    
    inline def setConflictDetectedNull: Self = StObject.set(x, "conflictDetected", null)
    
    inline def setConflictDetectedUndefined: Self = StObject.set(x, "conflictDetected", js.undefined)
    
    inline def setKey(value: SchemaKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
