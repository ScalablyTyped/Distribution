package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Firestore.Listen.
  */
@js.native
trait SchemaListenResponse extends js.Object {
  
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
  implicit class SchemaListenResponseOps[Self <: SchemaListenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentChange(value: SchemaDocumentChange): Self = this.set("documentChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentChange: Self = this.set("documentChange", js.undefined)
    
    @scala.inline
    def setDocumentDelete(value: SchemaDocumentDelete): Self = this.set("documentDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentDelete: Self = this.set("documentDelete", js.undefined)
    
    @scala.inline
    def setDocumentRemove(value: SchemaDocumentRemove): Self = this.set("documentRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentRemove: Self = this.set("documentRemove", js.undefined)
    
    @scala.inline
    def setFilter(value: SchemaExistenceFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setTargetChange(value: SchemaTargetChange): Self = this.set("targetChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetChange: Self = this.set("targetChange", js.undefined)
  }
}
