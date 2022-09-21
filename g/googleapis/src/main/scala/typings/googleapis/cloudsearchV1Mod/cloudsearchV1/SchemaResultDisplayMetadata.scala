package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultDisplayMetadata extends StObject {
  
  /**
    * The metalines content to be displayed with the result.
    */
  var metalines: js.UndefOr[js.Array[SchemaResultDisplayLine]] = js.undefined
  
  /**
    * The display label for the object.
    */
  var objectTypeLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaResultDisplayMetadata {
  
  inline def apply(): SchemaResultDisplayMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayMetadata]
  }
  
  extension [Self <: SchemaResultDisplayMetadata](x: Self) {
    
    inline def setMetalines(value: js.Array[SchemaResultDisplayLine]): Self = StObject.set(x, "metalines", value.asInstanceOf[js.Any])
    
    inline def setMetalinesUndefined: Self = StObject.set(x, "metalines", js.undefined)
    
    inline def setMetalinesVarargs(value: SchemaResultDisplayLine*): Self = StObject.set(x, "metalines", js.Array(value*))
    
    inline def setObjectTypeLabel(value: String): Self = StObject.set(x, "objectTypeLabel", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeLabelNull: Self = StObject.set(x, "objectTypeLabel", null)
    
    inline def setObjectTypeLabelUndefined: Self = StObject.set(x, "objectTypeLabel", js.undefined)
  }
}
