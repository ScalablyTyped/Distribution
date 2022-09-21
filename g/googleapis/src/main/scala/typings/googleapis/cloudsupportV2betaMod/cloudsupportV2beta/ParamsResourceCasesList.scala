package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCasesList
  extends StObject
     with StandardParameters {
  
  /**
    * An expression written in filter language. If non-empty, the query returns the cases that match the filter. Else, the query doesn't filter the cases. Filter expressions use the following fields with the operators equals (`=`) and `AND`: - `state`: The accepted values are `OPEN` or `CLOSED`. - `priority`: The accepted values are `P0`, `P1`, `P2`, `P3`, or `P4`. You can specify multiple values for priority using the `OR` operator. For example, `priority=P1 OR priority=P2`. - [DEPRECATED] `severity`: The accepted values are `S0`, `S1`, `S2`, `S3`, or `S4`. - `creator.email`: The email address of the case creator. Examples: - `state=CLOSED` - `state=OPEN AND creator.email="tester@example.com"` - `state=OPEN AND (priority=P0 OR priority=P1)`
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of cases fetched with each request. Defaults to 10.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying the page of results to return. If unspecified, the first page is retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The fully qualified name of parent resource to list cases under.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceCasesList {
  
  inline def apply(): ParamsResourceCasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCasesList]
  }
  
  extension [Self <: ParamsResourceCasesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
