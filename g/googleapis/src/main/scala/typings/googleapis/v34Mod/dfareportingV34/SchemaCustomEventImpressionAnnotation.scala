package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomEventImpressionAnnotation extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventImpressionAnnotation".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The path impression ID. Use this field to annotate the impression associated with the pathImpressionId.
    */
  var pathImpressionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomEventImpressionAnnotation {
  
  inline def apply(): SchemaCustomEventImpressionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomEventImpressionAnnotation]
  }
  
  extension [Self <: SchemaCustomEventImpressionAnnotation](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPathImpressionId(value: String): Self = StObject.set(x, "pathImpressionId", value.asInstanceOf[js.Any])
    
    inline def setPathImpressionIdNull: Self = StObject.set(x, "pathImpressionId", null)
    
    inline def setPathImpressionIdUndefined: Self = StObject.set(x, "pathImpressionId", js.undefined)
  }
}
