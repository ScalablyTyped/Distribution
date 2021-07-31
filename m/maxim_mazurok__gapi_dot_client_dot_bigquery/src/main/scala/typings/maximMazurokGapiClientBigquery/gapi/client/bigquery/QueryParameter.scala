package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameter extends StObject {
  
  /** [Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query. */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Required] The type of this parameter. */
  var parameterType: js.UndefOr[QueryParameterType] = js.undefined
  
  /** [Required] The value of this parameter. */
  var parameterValue: js.UndefOr[QueryParameterValue] = js.undefined
}
object QueryParameter {
  
  @scala.inline
  def apply(): QueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameter]
  }
  
  @scala.inline
  implicit class QueryParameterMutableBuilder[Self <: QueryParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameterType(value: QueryParameterType): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterTypeUndefined: Self = StObject.set(x, "parameterType", js.undefined)
    
    @scala.inline
    def setParameterValue(value: QueryParameterValue): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValueUndefined: Self = StObject.set(x, "parameterValue", js.undefined)
  }
}
