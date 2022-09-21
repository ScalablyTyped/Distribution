package typings.googleapis.ideahubV1alphaMod.ideahubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIdeasList
  extends StObject
     with StandardParameters {
  
  /**
    * Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions are implicitly combined, as if the `AND` operator was always used. The `OR` operator is currently unsupported. * Supported functions: - `saved(bool)`: If set to true, fetches only saved ideas. If set to false, fetches all except saved ideas. Can't be simultaneously used with `dismissed(bool)`. - `dismissed(bool)`: If set to true, fetches only dismissed ideas. Can't be simultaneously used with `saved(bool)`. The `false` value is currently unsupported. Examples: * `saved(true)` * `saved(false)` * `dismissed(true)` The length of this field should be no more than 500 characters.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Order semantics described below.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of ideas per page. If unspecified, at most 10 ideas will be returned. The maximum value is 2000; values above 2000 will be coerced to 2000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Used to fetch next page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * If defined, specifies the creator for which to filter by. Format: publishers/{publisher\}/properties/{property\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceIdeasList {
  
  inline def apply(): ParamsResourceIdeasList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIdeasList]
  }
  
  extension [Self <: ParamsResourceIdeasList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
