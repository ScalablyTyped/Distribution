package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceAnnotation extends StObject {
  
  /**
    * A description of the annotation record.
    */
  var label: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceAnnotation {
  
  inline def apply(): SchemaResourceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceAnnotation]
  }
  
  extension [Self <: SchemaResourceAnnotation](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
