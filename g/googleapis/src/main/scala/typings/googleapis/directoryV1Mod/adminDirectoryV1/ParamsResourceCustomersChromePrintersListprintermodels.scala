package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersChromePrintersListprintermodels
  extends StObject
     with StandardParameters {
  
  /**
    * Filer to list only models by a given manufacturer in format: "manufacturer:Brother". Search syntax is shared between this api and Admin Console printers pages.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of objects to return. The service may return fewer than this value.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the customer who owns this collection of printers. Format: customers/{customer_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersChromePrintersListprintermodels {
  
  inline def apply(): ParamsResourceCustomersChromePrintersListprintermodels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersChromePrintersListprintermodels]
  }
  
  extension [Self <: ParamsResourceCustomersChromePrintersListprintermodels](x: Self) {
    
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
