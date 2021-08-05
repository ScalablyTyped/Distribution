package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AnnotationSource holds the source information of the annotation.
  */
trait SchemaAnnotationSource extends StObject {
  
  /**
    * Cloud Healthcare API resource.
    */
  var cloudHealthcareSource: js.UndefOr[SchemaCloudHealthcareSource] = js.undefined
}
object SchemaAnnotationSource {
  
  inline def apply(): SchemaAnnotationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotationSource]
  }
  
  extension [Self <: SchemaAnnotationSource](x: Self) {
    
    inline def setCloudHealthcareSource(value: SchemaCloudHealthcareSource): Self = StObject.set(x, "cloudHealthcareSource", value.asInstanceOf[js.Any])
    
    inline def setCloudHealthcareSourceUndefined: Self = StObject.set(x, "cloudHealthcareSource", js.undefined)
  }
}
