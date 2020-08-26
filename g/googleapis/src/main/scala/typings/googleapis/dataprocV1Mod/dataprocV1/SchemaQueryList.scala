package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of queries to run on a cluster.
  */
@js.native
trait SchemaQueryList extends js.Object {
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
  implicit class SchemaQueryListOps[Self <: SchemaQueryList] (val x: Self) extends AnyVal {
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
    def setQueriesVarargs(value: String*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: js.Array[String]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
  }
  
}

