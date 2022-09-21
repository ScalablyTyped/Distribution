package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomEventClickAnnotation extends StObject {
  
  /**
    * The Google click ID. Use this field to annotate the click associated with the gclid.
    */
  var gclid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventClickAnnotation".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomEventClickAnnotation {
  
  inline def apply(): SchemaCustomEventClickAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomEventClickAnnotation]
  }
  
  extension [Self <: SchemaCustomEventClickAnnotation](x: Self) {
    
    inline def setGclid(value: String): Self = StObject.set(x, "gclid", value.asInstanceOf[js.Any])
    
    inline def setGclidNull: Self = StObject.set(x, "gclid", null)
    
    inline def setGclidUndefined: Self = StObject.set(x, "gclid", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
