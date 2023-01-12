package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryList extends StObject {
  
  /**
    * Required. The queries to execute. You do not need to end a query expression with a semicolon. Multiple queries can be specified in one string by separating each with a semicolon.
    * Here is an example of a Dataproc API snippet that uses a QueryList to specify a HiveJob: "hiveJob": { "queryList": { "queries": [ "query1", "query2", "query3;query4", ] } }
    */
  var queries: js.UndefOr[js.Array[String]] = js.undefined
}
object QueryList {
  
  inline def apply(): QueryList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryList] (val x: Self) extends AnyVal {
    
    inline def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value*))
  }
}
