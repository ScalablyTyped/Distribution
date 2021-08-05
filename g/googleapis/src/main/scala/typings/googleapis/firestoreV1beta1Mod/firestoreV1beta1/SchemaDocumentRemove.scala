package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Document has been removed from the view of the targets.  Sent if the
  * document is no longer relevant to a target and is out of view. Can be sent
  * instead of a DocumentDelete or a DocumentChange if the server can not send
  * the new value of the document.  Multiple DocumentRemove messages may be
  * returned for the same logical write or delete, if multiple targets are
  * affected.
  */
trait SchemaDocumentRemove extends StObject {
  
  /**
    * The resource name of the Document that has gone out of view.
    */
  var document: js.UndefOr[String] = js.undefined
  
  /**
    * The read timestamp at which the remove was observed.  Greater or equal to
    * the `commit_time` of the change/delete/remove.
    */
  var readTime: js.UndefOr[String] = js.undefined
  
  /**
    * A set of target IDs for targets that previously matched this document.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object SchemaDocumentRemove {
  
  inline def apply(): SchemaDocumentRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentRemove]
  }
  
  extension [Self <: SchemaDocumentRemove](x: Self) {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    inline def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    inline def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value :_*))
  }
}
