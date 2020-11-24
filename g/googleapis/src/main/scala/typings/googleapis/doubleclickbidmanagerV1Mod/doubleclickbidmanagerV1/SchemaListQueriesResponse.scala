package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List queries response.
  */
@js.native
trait SchemaListQueriesResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#listQueriesResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Retrieved queries.
    */
  var queries: js.UndefOr[js.Array[SchemaQuery]] = js.native
}
object SchemaListQueriesResponse {
  
  @scala.inline
  def apply(): SchemaListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListQueriesResponse]
  }
  
  @scala.inline
  implicit class SchemaListQueriesResponseOps[Self <: SchemaListQueriesResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setQueriesVarargs(value: SchemaQuery*): Self = this.set("queries", js.Array(value :_*))
    
    @scala.inline
    def setQueries(value: js.Array[SchemaQuery]): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
  }
}
