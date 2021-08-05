package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Document has changed.  May be the result of multiple writes, including
  * deletes, that ultimately resulted in a new value for the Document. Multiple
  * DocumentChange messages may be returned for the same logical change, if
  * multiple targets are affected.
  */
trait SchemaDocumentChange extends StObject {
  
  /**
    * The new state of the Document.  If `mask` is set, contains only fields
    * that were updated or added.
    */
  var document: js.UndefOr[SchemaDocument] = js.undefined
  
  /**
    * A set of target IDs for targets that no longer match this document.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * A set of target IDs of targets that match this document.
    */
  var targetIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object SchemaDocumentChange {
  
  inline def apply(): SchemaDocumentChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentChange]
  }
  
  extension [Self <: SchemaDocumentChange](x: Self) {
    
    inline def setDocument(value: SchemaDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setRemovedTargetIds(value: js.Array[Double]): Self = StObject.set(x, "removedTargetIds", value.asInstanceOf[js.Any])
    
    inline def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    inline def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value :_*))
    
    inline def setTargetIds(value: js.Array[Double]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsUndefined: Self = StObject.set(x, "targetIds", js.undefined)
    
    inline def setTargetIdsVarargs(value: Double*): Self = StObject.set(x, "targetIds", js.Array(value :_*))
  }
}
