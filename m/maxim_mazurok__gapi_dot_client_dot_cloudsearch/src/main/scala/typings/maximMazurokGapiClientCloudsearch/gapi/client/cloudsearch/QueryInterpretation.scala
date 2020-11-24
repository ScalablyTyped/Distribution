package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInterpretation extends js.Object {
  
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
  implicit class QueryInterpretationOps[Self <: QueryInterpretation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInterpretationType(value: String): Self = this.set("interpretationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpretationType: Self = this.set("interpretationType", js.undefined)
    
    @scala.inline
    def setInterpretedQuery(value: String): Self = this.set("interpretedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpretedQuery: Self = this.set("interpretedQuery", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
