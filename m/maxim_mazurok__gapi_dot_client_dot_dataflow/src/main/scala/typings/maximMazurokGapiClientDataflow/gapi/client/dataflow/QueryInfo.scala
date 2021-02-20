package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInfo extends StObject {
  
  /** Includes an entry for each satisfied QueryProperty. */
  var queryProperty: js.UndefOr[js.Array[String]] = js.native
}
object QueryInfo {
  
  @scala.inline
  def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  
  @scala.inline
  implicit class QueryInfoMutableBuilder[Self <: QueryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryProperty(value: js.Array[String]): Self = StObject.set(x, "queryProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryPropertyUndefined: Self = StObject.set(x, "queryProperty", js.undefined)
    
    @scala.inline
    def setQueryPropertyVarargs(value: String*): Self = StObject.set(x, "queryProperty", js.Array(value :_*))
  }
}
