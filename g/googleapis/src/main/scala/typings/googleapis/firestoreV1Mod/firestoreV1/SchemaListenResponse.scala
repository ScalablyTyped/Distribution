package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Firestore.Listen.
  */
@js.native
trait SchemaListenResponse extends StObject {
  
  /**
    * A Document has changed.
    */
  var documentChange: js.UndefOr[SchemaDocumentChange] = js.native
  
  /**
    * A Document has been deleted.
    */
  var documentDelete: js.UndefOr[SchemaDocumentDelete] = js.native
  
  /**
    * A Document has been removed from a target (because it is no longer
    * relevant to that target).
    */
  var documentRemove: js.UndefOr[SchemaDocumentRemove] = js.native
  
  /**
    * A filter to apply to the set of documents previously returned for the
    * given target.  Returned when documents may have been removed from the
    * given target, but the exact documents are unknown.
    */
  var filter: js.UndefOr[SchemaExistenceFilter] = js.native
  
  /**
    * Targets have changed.
    */
  var targetChange: js.UndefOr[SchemaTargetChange] = js.native
}
object SchemaListenResponse {
  
  @scala.inline
  def apply(): SchemaListenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListenResponse]
  }
  
  @scala.inline
  implicit class SchemaListenResponseMutableBuilder[Self <: SchemaListenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentChange(value: SchemaDocumentChange): Self = StObject.set(x, "documentChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentChangeUndefined: Self = StObject.set(x, "documentChange", js.undefined)
    
    @scala.inline
    def setDocumentDelete(value: SchemaDocumentDelete): Self = StObject.set(x, "documentDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentDeleteUndefined: Self = StObject.set(x, "documentDelete", js.undefined)
    
    @scala.inline
    def setDocumentRemove(value: SchemaDocumentRemove): Self = StObject.set(x, "documentRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentRemoveUndefined: Self = StObject.set(x, "documentRemove", js.undefined)
    
    @scala.inline
    def setFilter(value: SchemaExistenceFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setTargetChange(value: SchemaTargetChange): Self = StObject.set(x, "targetChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetChangeUndefined: Self = StObject.set(x, "targetChange", js.undefined)
  }
}
