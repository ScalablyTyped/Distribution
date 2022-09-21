package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceObjectReferences extends StObject {
  
  /**
    * The references.
    */
  var references: js.UndefOr[js.Array[SchemaDataSourceObjectReference]] = js.undefined
}
object SchemaDataSourceObjectReferences {
  
  inline def apply(): SchemaDataSourceObjectReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceObjectReferences]
  }
  
  extension [Self <: SchemaDataSourceObjectReferences](x: Self) {
    
    inline def setReferences(value: js.Array[SchemaDataSourceObjectReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setReferencesVarargs(value: SchemaDataSourceObjectReference*): Self = StObject.set(x, "references", js.Array(value*))
  }
}
