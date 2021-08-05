package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ### System parameter configuration  A system parameter is a special kind of
  * parameter defined by the API system, not by an individual API. It is
  * typically mapped to an HTTP header and/or a URL query parameter. This
  * configuration specifies which methods change the names of the system
  * parameters.
  */
trait SchemaSystemParameters extends StObject {
  
  /**
    * Define system parameters.  The parameters defined here will override the
    * default parameters implemented by the system. If this field is missing
    * from the service config, default system parameters will be used. Default
    * system parameters and names is implementation-dependent.  Example: define
    * api key for all methods      system_parameters       rules:         -
    * selector: &quot;*&quot;           parameters:             - name: api_key
    * url_query_parameter: api_key   Example: define 2 api key names for a
    * specific method.      system_parameters       rules:         - selector:
    * &quot;/ListShelves&quot;           parameters:             - name:
    * api_key               http_header: Api-Key1             - name: api_key
    * http_header: Api-Key2  **NOTE:** All service configuration rules follow
    * &quot;last one wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaSystemParameterRule]] = js.undefined
}
object SchemaSystemParameters {
  
  inline def apply(): SchemaSystemParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemParameters]
  }
  
  extension [Self <: SchemaSystemParameters](x: Self) {
    
    inline def setRules(value: js.Array[SchemaSystemParameterRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaSystemParameterRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
