package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEventImpressionAnnotation extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventImpressionAnnotation". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The path impression ID. Use this field to annotate the impression associated with the pathImpressionId. */
  var pathImpressionId: js.UndefOr[String] = js.undefined
}
object CustomEventImpressionAnnotation {
  
  inline def apply(): CustomEventImpressionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventImpressionAnnotation]
  }
  
  extension [Self <: CustomEventImpressionAnnotation](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPathImpressionId(value: String): Self = StObject.set(x, "pathImpressionId", value.asInstanceOf[js.Any])
    
    inline def setPathImpressionIdUndefined: Self = StObject.set(x, "pathImpressionId", js.undefined)
  }
}
