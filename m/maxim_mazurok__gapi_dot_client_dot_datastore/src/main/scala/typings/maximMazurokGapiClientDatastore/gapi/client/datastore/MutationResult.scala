package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationResult extends StObject {
  
  /** Whether a conflict was detected for this mutation. Always false when a conflict detection strategy field is not set in the mutation. */
  var conflictDetected: js.UndefOr[Boolean] = js.undefined
  
  /** The automatically allocated key. Set only when the mutation allocated a key. */
  var key: js.UndefOr[Key] = js.undefined
  
  /**
    * The update time of the entity on the server after processing the mutation. If the mutation doesn't change anything on the server, then the timestamp will be the update timestamp of
    * the current entity. This field will not be set after a 'delete'.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the entity on the server after processing the mutation. If the mutation doesn't change anything on the server, then the version will be the version of the current
    * entity or, if no entity is present, a version that is strictly greater than the version of any previous entity and less than the version of any possible future entity.
    */
  var version: js.UndefOr[String] = js.undefined
}
object MutationResult {
  
  inline def apply(): MutationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationResult]
  }
  
  extension [Self <: MutationResult](x: Self) {
    
    inline def setConflictDetected(value: Boolean): Self = StObject.set(x, "conflictDetected", value.asInstanceOf[js.Any])
    
    inline def setConflictDetectedUndefined: Self = StObject.set(x, "conflictDetected", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
