package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how de-identification of a FHIR store should be handled.
  */
@js.native
trait SchemaFhirConfig extends StObject {
  
  /**
    * Specifies FHIR paths to match and how to transform them. Any field that
    * is not matched by a FieldMetadata will be passed through to the output
    * dataset unmodified. All extensions are removed in the output.
    */
  var fieldMetadataList: js.UndefOr[js.Array[SchemaFieldMetadata]] = js.native
}
object SchemaFhirConfig {
  
  @scala.inline
  def apply(): SchemaFhirConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFhirConfig]
  }
  
  @scala.inline
  implicit class SchemaFhirConfigMutableBuilder[Self <: SchemaFhirConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldMetadataList(value: js.Array[SchemaFieldMetadata]): Self = StObject.set(x, "fieldMetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMetadataListUndefined: Self = StObject.set(x, "fieldMetadataList", js.undefined)
    
    @scala.inline
    def setFieldMetadataListVarargs(value: SchemaFieldMetadata*): Self = StObject.set(x, "fieldMetadataList", js.Array(value :_*))
  }
}
