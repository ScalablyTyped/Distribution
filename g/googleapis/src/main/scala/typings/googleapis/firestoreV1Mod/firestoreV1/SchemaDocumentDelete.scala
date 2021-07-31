package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Document has been deleted.  May be the result of multiple writes,
  * including updates, the last of which deleted the Document.  Multiple
  * DocumentDelete messages may be returned for the same logical delete, if
  * multiple targets are affected.
  */
trait SchemaDocumentDelete extends StObject {
  
  /**
    * The resource name of the Document that was deleted.
    */
  var document: js.UndefOr[String] = js.undefined
  
  /**
    * The read timestamp at which the delete was observed.  Greater or equal to
    * the `commit_time` of the delete.
    */
  var readTime: js.UndefOr[String] = js.undefined
  
  /**
    * A set of target IDs for targets that previously matched this entity.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object SchemaDocumentDelete {
  
  @scala.inline
  def apply(): SchemaDocumentDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentDelete]
  }
  
  @scala.inline
  implicit class SchemaDocumentDeleteMutableBuilder[Self <: SchemaDocumentDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    @scala.inline
    def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value :_*))
  }
}
