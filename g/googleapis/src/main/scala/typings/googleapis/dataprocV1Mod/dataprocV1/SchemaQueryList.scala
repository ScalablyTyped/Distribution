package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of queries to run on a cluster.
  */
trait SchemaQueryList extends StObject {
  
  /**
    * Required. The queries to execute. You do not need to terminate a query
    * with a semicolon. Multiple queries can be specified in one string by
    * separating each with a semicolon. Here is an example of an Cloud Dataproc
    * API snippet that uses a QueryList to specify a HiveJob:
    * &quot;hiveJob&quot;: {   &quot;queryList&quot;: { &quot;queries&quot;: [
    * &quot;query1&quot;,       &quot;query2&quot;, &quot;query3;query4&quot;,
    * ]   } }
    */
  var queries: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaQueryList {
  
  inline def apply(): SchemaQueryList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryList]
  }
  
  extension [Self <: SchemaQueryList](x: Self) {
    
    inline def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
