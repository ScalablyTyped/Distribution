package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateMetadata extends StObject {
  
  /** Optional. A description of the template. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the template. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The parameters for the template. */
  var parameters: js.UndefOr[js.Array[ParameterMetadata]] = js.undefined
}
object TemplateMetadata {
  
  inline def apply(): TemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateMetadata]
  }
  
  extension [Self <: TemplateMetadata](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: js.Array[ParameterMetadata]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: ParameterMetadata*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
