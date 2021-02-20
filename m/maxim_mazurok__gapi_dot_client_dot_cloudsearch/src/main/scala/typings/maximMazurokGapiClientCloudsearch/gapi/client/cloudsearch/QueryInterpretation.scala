package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInterpretation extends StObject {
  
  var interpretationType: js.UndefOr[String] = js.native
  
  /**
    * The interpretation of the query used in search. For example, queries with natural language intent like "email from john" will be interpreted as "from:john source:mail". This field
    * will not be filled when the reason is NOT_ENOUGH_RESULTS_FOUND_FOR_USER_QUERY.
    */
  var interpretedQuery: js.UndefOr[String] = js.native
  
  /** The reason for interpretation of the query. This field will not be UNSPECIFIED if the interpretation type is not NONE. */
  var reason: js.UndefOr[String] = js.native
}
object QueryInterpretation {
  
  @scala.inline
  def apply(): QueryInterpretation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInterpretation]
  }
  
  @scala.inline
  implicit class QueryInterpretationMutableBuilder[Self <: QueryInterpretation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterpretationType(value: String): Self = StObject.set(x, "interpretationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpretationTypeUndefined: Self = StObject.set(x, "interpretationType", js.undefined)
    
    @scala.inline
    def setInterpretedQuery(value: String): Self = StObject.set(x, "interpretedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpretedQueryUndefined: Self = StObject.set(x, "interpretedQuery", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
