package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schema extends js.Object {
  
  /** The list of top-level objects for the data source. The maximum number of elements is 10. */
  var objectDefinitions: js.UndefOr[js.Array[ObjectDefinition]] = js.native
  
  /** IDs of the Long Running Operations (LROs) currently running for this schema. After modifying the schema, wait for operations to complete before indexing additional content. */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
}
object Schema {
  
  @scala.inline
  def apply(): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
    
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
    def setObjectDefinitionsVarargs(value: ObjectDefinition*): Self = this.set("objectDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setObjectDefinitions(value: js.Array[ObjectDefinition]): Self = this.set("objectDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectDefinitions: Self = this.set("objectDefinitions", js.undefined)
    
    @scala.inline
    def setOperationIdsVarargs(value: String*): Self = this.set("operationIds", js.Array(value :_*))
    
    @scala.inline
    def setOperationIds(value: js.Array[String]): Self = this.set("operationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationIds: Self = this.set("operationIds", js.undefined)
  }
}
