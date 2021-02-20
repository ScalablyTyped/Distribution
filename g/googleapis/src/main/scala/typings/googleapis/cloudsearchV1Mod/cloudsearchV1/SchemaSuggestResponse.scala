package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of the suggest API.
  */
@js.native
trait SchemaSuggestResponse extends StObject {
  
  /**
    * List of suggestion results.
    */
  var suggestResults: js.UndefOr[js.Array[SchemaSuggestResult]] = js.native
}
object SchemaSuggestResponse {
  
  @scala.inline
  def apply(): SchemaSuggestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestResponse]
  }
  
  @scala.inline
  implicit class SchemaSuggestResponseMutableBuilder[Self <: SchemaSuggestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestResults(value: js.Array[SchemaSuggestResult]): Self = StObject.set(x, "suggestResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestResultsUndefined: Self = StObject.set(x, "suggestResults", js.undefined)
    
    @scala.inline
    def setSuggestResultsVarargs(value: SchemaSuggestResult*): Self = StObject.set(x, "suggestResults", js.Array(value :_*))
  }
}
