package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModifyLabelsResponse extends StObject {
  
  /**
    * This is always drive#modifyLabelsResponse
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of labels which were added or updated by the request.
    */
  var modifiedLabels: js.UndefOr[js.Array[SchemaLabel]] = js.undefined
}
object SchemaModifyLabelsResponse {
  
  inline def apply(): SchemaModifyLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyLabelsResponse]
  }
  
  extension [Self <: SchemaModifyLabelsResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setModifiedLabels(value: js.Array[SchemaLabel]): Self = StObject.set(x, "modifiedLabels", value.asInstanceOf[js.Any])
    
    inline def setModifiedLabelsUndefined: Self = StObject.set(x, "modifiedLabels", js.undefined)
    
    inline def setModifiedLabelsVarargs(value: SchemaLabel*): Self = StObject.set(x, "modifiedLabels", js.Array(value*))
  }
}
