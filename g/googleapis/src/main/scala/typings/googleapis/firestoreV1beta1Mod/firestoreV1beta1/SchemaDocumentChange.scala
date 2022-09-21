package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocumentChange extends StObject {
  
  /**
    * The new state of the Document. If `mask` is set, contains only fields that were updated or added.
    */
  var document: js.UndefOr[SchemaDocument] = js.undefined
  
  /**
    * A set of target IDs for targets that no longer match this document.
    */
  var removedTargetIds: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * A set of target IDs of targets that match this document.
    */
  var targetIds: js.UndefOr[js.Array[Double] | Null] = js.undefined
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
    
    inline def setRemovedTargetIdsNull: Self = StObject.set(x, "removedTargetIds", null)
    
    inline def setRemovedTargetIdsUndefined: Self = StObject.set(x, "removedTargetIds", js.undefined)
    
    inline def setRemovedTargetIdsVarargs(value: Double*): Self = StObject.set(x, "removedTargetIds", js.Array(value*))
    
    inline def setTargetIds(value: js.Array[Double]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsNull: Self = StObject.set(x, "targetIds", null)
    
    inline def setTargetIdsUndefined: Self = StObject.set(x, "targetIds", js.undefined)
    
    inline def setTargetIdsVarargs(value: Double*): Self = StObject.set(x, "targetIds", js.Array(value*))
  }
}
