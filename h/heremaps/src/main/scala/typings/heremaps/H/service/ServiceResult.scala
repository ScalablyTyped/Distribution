package typings.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.anon.Context
import typings.heremaps.anon.Isolines
import typings.heremaps.anon.Items
import typings.heremaps.anon.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This type encapsulates a response object provider by a HERE platform service.
  */
trait ServiceResult
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var Response: js.UndefOr[Isolines] = js.undefined
  
  var response: js.UndefOr[Language] = js.undefined
  
  var results: js.UndefOr[Items] = js.undefined
  
  var search: js.UndefOr[Context] = js.undefined
}
object ServiceResult {
  
  inline def apply(): ServiceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceResult]
  }
  
  extension [Self <: ServiceResult](x: Self) {
    
    inline def setResponse(value: Isolines): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "Response", js.undefined)
    
    inline def setResults(value: Items): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setSearch(value: Context): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
