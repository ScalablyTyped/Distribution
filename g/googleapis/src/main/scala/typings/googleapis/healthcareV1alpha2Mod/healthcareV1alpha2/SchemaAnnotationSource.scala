package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

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
  
  @scala.inline
  def apply(): SchemaAnnotationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotationSource]
  }
  
  @scala.inline
  implicit class SchemaAnnotationSourceMutableBuilder[Self <: SchemaAnnotationSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudHealthcareSource(value: SchemaCloudHealthcareSource): Self = StObject.set(x, "cloudHealthcareSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudHealthcareSourceUndefined: Self = StObject.set(x, "cloudHealthcareSource", js.undefined)
  }
}
