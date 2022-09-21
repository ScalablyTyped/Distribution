package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSystemParameter extends StObject {
  
  /**
    * Define the HTTP header name to use for the parameter. It is case insensitive.
    */
  var httpHeader: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Define the name of the parameter, such as "api_key" . It is case sensitive.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Define the URL query parameter name to use for the parameter. It is case sensitive.
    */
  var urlQueryParameter: js.UndefOr[String | Null] = js.undefined
}
object SchemaSystemParameter {
  
  inline def apply(): SchemaSystemParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemParameter]
  }
  
  extension [Self <: SchemaSystemParameter](x: Self) {
    
    inline def setHttpHeader(value: String): Self = StObject.set(x, "httpHeader", value.asInstanceOf[js.Any])
    
    inline def setHttpHeaderNull: Self = StObject.set(x, "httpHeader", null)
    
    inline def setHttpHeaderUndefined: Self = StObject.set(x, "httpHeader", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrlQueryParameter(value: String): Self = StObject.set(x, "urlQueryParameter", value.asInstanceOf[js.Any])
    
    inline def setUrlQueryParameterNull: Self = StObject.set(x, "urlQueryParameter", null)
    
    inline def setUrlQueryParameterUndefined: Self = StObject.set(x, "urlQueryParameter", js.undefined)
  }
}
