package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterMetadata extends StObject {
  
  /** Required. The help text to display for the parameter. */
  var helpText: js.UndefOr[String] = js.native
  
  /** Optional. Whether the parameter is optional. Defaults to false. */
  var isOptional: js.UndefOr[Boolean] = js.native
  
  /** Required. The label to display for the parameter. */
  var label: js.UndefOr[String] = js.native
  
  /** Required. The name of the parameter. */
  var name: js.UndefOr[String] = js.native
  
  /** Optional. The type of the parameter. Used for selecting input picker. */
  var paramType: js.UndefOr[String] = js.native
  
  /** Optional. Regexes that the parameter must match. */
  var regexes: js.UndefOr[js.Array[String]] = js.native
}
object ParameterMetadata {
  
  @scala.inline
  def apply(): ParameterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterMetadata]
  }
  
  @scala.inline
  implicit class ParameterMetadataMutableBuilder[Self <: ParameterMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHelpText(value: String): Self = StObject.set(x, "helpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpTextUndefined: Self = StObject.set(x, "helpText", js.undefined)
    
    @scala.inline
    def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParamType(value: String): Self = StObject.set(x, "paramType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamTypeUndefined: Self = StObject.set(x, "paramType", js.undefined)
    
    @scala.inline
    def setRegexes(value: js.Array[String]): Self = StObject.set(x, "regexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexesUndefined: Self = StObject.set(x, "regexes", js.undefined)
    
    @scala.inline
    def setRegexesVarargs(value: String*): Self = StObject.set(x, "regexes", js.Array(value :_*))
  }
}
