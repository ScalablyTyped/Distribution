package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource level annotation.
  */
trait SchemaResourceAnnotation extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
}
object SchemaResourceAnnotation {
  
  inline def apply(): SchemaResourceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceAnnotation]
  }
  
  extension [Self <: SchemaResourceAnnotation](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
