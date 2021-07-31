package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata describing a template.
  */
trait SchemaTemplateMetadata extends StObject {
  
  /**
    * Optional. A description of the template.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the template.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The parameters for the template.
    */
  var parameters: js.UndefOr[js.Array[SchemaParameterMetadata]] = js.undefined
}
object SchemaTemplateMetadata {
  
  @scala.inline
  def apply(): SchemaTemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplateMetadata]
  }
  
  @scala.inline
  implicit class SchemaTemplateMetadataMutableBuilder[Self <: SchemaTemplateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[SchemaParameterMetadata]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: SchemaParameterMetadata*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
