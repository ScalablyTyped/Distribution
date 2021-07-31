package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define a parameter&#39;s name and location. The parameter may be passed as
  * either an HTTP header or a URL query parameter, and if both are passed the
  * behavior is implementation-dependent.
  */
trait SchemaSystemParameter extends StObject {
  
  /**
    * Define the HTTP header name to use for the parameter. It is case
    * insensitive.
    */
  var httpHeader: js.UndefOr[String] = js.undefined
  
  /**
    * Define the name of the parameter, such as &quot;api_key&quot; . It is
    * case sensitive.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Define the URL query parameter name to use for the parameter. It is case
    * sensitive.
    */
  var urlQueryParameter: js.UndefOr[String] = js.undefined
}
object SchemaSystemParameter {
  
  @scala.inline
  def apply(): SchemaSystemParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemParameter]
  }
  
  @scala.inline
  implicit class SchemaSystemParameterMutableBuilder[Self <: SchemaSystemParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpHeader(value: String): Self = StObject.set(x, "httpHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeaderUndefined: Self = StObject.set(x, "httpHeader", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrlQueryParameter(value: String): Self = StObject.set(x, "urlQueryParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlQueryParameterUndefined: Self = StObject.set(x, "urlQueryParameter", js.undefined)
  }
}
