package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelationshipNote extends StObject {
  
  /**
    * The type of relationship between the source and target SPDX elements
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelationshipNote {
  
  inline def apply(): SchemaRelationshipNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelationshipNote]
  }
  
  extension [Self <: SchemaRelationshipNote](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
