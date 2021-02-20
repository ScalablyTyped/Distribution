package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the FHIR BigQuery schema. Determines how the server
  * generates the schema.
  */
@js.native
trait SchemaSchemaConfig extends StObject {
  
  /**
    * The depth for all recursive structures in the output analytics schema.
    * For example, `concept` in the CodeSystem resource is a recursive
    * structure; when the depth is 2, the CodeSystem table will have a column
    * called `concept.concept` but not `concept.concept.concept`. If not
    * specified or set to 0, the server will use the default value 2.
    */
  var recursiveStructureDepth: js.UndefOr[String] = js.native
  
  /**
    * Specifies the output schema type. If unspecified, the default is
    * `LOSSLESS`.
    */
  var schemaType: js.UndefOr[String] = js.native
}
object SchemaSchemaConfig {
  
  @scala.inline
  def apply(): SchemaSchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemaConfig]
  }
  
  @scala.inline
  implicit class SchemaSchemaConfigMutableBuilder[Self <: SchemaSchemaConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursiveStructureDepth(value: String): Self = StObject.set(x, "recursiveStructureDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveStructureDepthUndefined: Self = StObject.set(x, "recursiveStructureDepth", js.undefined)
    
    @scala.inline
    def setSchemaType(value: String): Self = StObject.set(x, "schemaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaTypeUndefined: Self = StObject.set(x, "schemaType", js.undefined)
  }
}
