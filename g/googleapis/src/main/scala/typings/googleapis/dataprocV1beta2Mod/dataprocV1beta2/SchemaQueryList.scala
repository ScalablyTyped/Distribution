package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of queries to run on a cluster.
  */
@js.native
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
  var queries: js.UndefOr[js.Array[String]] = js.native
}
object SchemaQueryList {
  
  @scala.inline
  def apply(): SchemaQueryList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryList]
  }
  
  @scala.inline
  implicit class SchemaQueryListMutableBuilder[Self <: SchemaQueryList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
