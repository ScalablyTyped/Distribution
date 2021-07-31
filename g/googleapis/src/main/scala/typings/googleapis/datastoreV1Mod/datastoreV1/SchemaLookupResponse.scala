package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Datastore.Lookup.
  */
trait SchemaLookupResponse extends StObject {
  
  /**
    * A list of keys that were not looked up due to resource constraints. The
    * order of results in this field is undefined and has no relation to the
    * order of the keys in the input.
    */
  var deferred: js.UndefOr[js.Array[SchemaKey]] = js.undefined
  
  /**
    * Entities found as `ResultType.FULL` entities. The order of results in
    * this field is undefined and has no relation to the order of the keys in
    * the input.
    */
  var found: js.UndefOr[js.Array[SchemaEntityResult]] = js.undefined
  
  /**
    * Entities not found as `ResultType.KEY_ONLY` entities. The order of
    * results in this field is undefined and has no relation to the order of
    * the keys in the input.
    */
  var missing: js.UndefOr[js.Array[SchemaEntityResult]] = js.undefined
}
object SchemaLookupResponse {
  
  @scala.inline
  def apply(): SchemaLookupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupResponse]
  }
  
  @scala.inline
  implicit class SchemaLookupResponseMutableBuilder[Self <: SchemaLookupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferred(value: js.Array[SchemaKey]): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
    
    @scala.inline
    def setDeferredVarargs(value: SchemaKey*): Self = StObject.set(x, "deferred", js.Array(value :_*))
    
    @scala.inline
    def setFound(value: js.Array[SchemaEntityResult]): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
    
    @scala.inline
    def setFoundVarargs(value: SchemaEntityResult*): Self = StObject.set(x, "found", js.Array(value :_*))
    
    @scala.inline
    def setMissing(value: js.Array[SchemaEntityResult]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    @scala.inline
    def setMissingVarargs(value: SchemaEntityResult*): Self = StObject.set(x, "missing", js.Array(value :_*))
  }
}
