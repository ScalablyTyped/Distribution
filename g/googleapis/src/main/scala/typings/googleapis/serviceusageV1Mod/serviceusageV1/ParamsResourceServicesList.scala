package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesList
  extends StObject
     with StandardParameters {
  
  /**
    * Only list services that conform to the given filter. The allowed filter strings are `state:ENABLED` and `state:DISABLED`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Requested size of the next page of data. Requested page size cannot exceed 200. If not set, the default page size is 50.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token identifying which result to start with, which is returned by a previous list call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Parent to search for services on. An example name would be: `projects/123` where `123` is the project number.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesList {
  
  inline def apply(): ParamsResourceServicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesList]
  }
  
  extension [Self <: ParamsResourceServicesList](x: Self) {
    
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
