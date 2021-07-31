package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpellResult extends StObject {
  
  /** The suggested spelling of the query. */
  var suggestedQuery: js.UndefOr[String] = js.undefined
}
object SpellResult {
  
  @scala.inline
  def apply(): SpellResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpellResult]
  }
  
  @scala.inline
  implicit class SpellResultMutableBuilder[Self <: SpellResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestedQuery(value: String): Self = StObject.set(x, "suggestedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedQueryUndefined: Self = StObject.set(x, "suggestedQuery", js.undefined)
  }
}
