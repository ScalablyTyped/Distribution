package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

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
  
  @scala.inline
  def apply(): SchemaResourceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceAnnotation]
  }
  
  @scala.inline
  implicit class SchemaResourceAnnotationMutableBuilder[Self <: SchemaResourceAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
