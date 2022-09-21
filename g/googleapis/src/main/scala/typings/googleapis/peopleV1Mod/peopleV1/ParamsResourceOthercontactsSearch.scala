package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOthercontactsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The number of results to return. Defaults to 10 if field is not set, or set to 0. Values greater than 30 will be capped to 30.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. The plain-text query for the request. The query is used to match prefix phrases of the fields on a person. For example, a person with name "foo name" matches queries such as "f", "fo", "foo", "foo n", "nam", etc., but not "oo n".
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are: * emailAddresses * metadata * names * phoneNumbers
    */
  var readMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceOthercontactsSearch {
  
  inline def apply(): ParamsResourceOthercontactsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOthercontactsSearch]
  }
  
  extension [Self <: ParamsResourceOthercontactsSearch](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
  }
}
