package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersSavedqueriesList
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the matter to get the saved queries for.
    */
  var matterId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of saved queries to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The pagination token as returned in the previous response. An empty token means start from the beginning.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceMattersSavedqueriesList {
  
  inline def apply(): ParamsResourceMattersSavedqueriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersSavedqueriesList]
  }
  
  extension [Self <: ParamsResourceMattersSavedqueriesList](x: Self) {
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
