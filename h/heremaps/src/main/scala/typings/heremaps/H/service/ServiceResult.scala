package typings.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.anon.Context
import typings.heremaps.anon.Isolines
import typings.heremaps.anon.Items
import typings.heremaps.anon.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This type encapsulates a response object provider by a HERE platform service.
  */
@js.native
trait ServiceResult
  extends /* key */ StringDictionary[js.Any] {
  
  var Response: js.UndefOr[Isolines] = js.native
  
  var response: js.UndefOr[Language] = js.native
  
  var results: js.UndefOr[Items] = js.native
  
  var search: js.UndefOr[Context] = js.native
}
object ServiceResult {
  
  @scala.inline
  def apply(): ServiceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceResult]
  }
  
  @scala.inline
  implicit class ServiceResultMutableBuilder[Self <: ServiceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: Isolines): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "Response", js.undefined)
    
    @scala.inline
    def setResults(value: Items): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setSearch(value: Context): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
