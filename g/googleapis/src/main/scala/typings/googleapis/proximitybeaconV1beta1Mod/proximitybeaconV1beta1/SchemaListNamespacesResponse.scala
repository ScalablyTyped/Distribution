package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to ListNamespacesRequest that contains all the project&#39;s
  * namespaces.
  */
@js.native
trait SchemaListNamespacesResponse extends js.Object {
  
  /**
    * The attachments that corresponded to the request params.
    */
  var namespaces: js.UndefOr[js.Array[SchemaNamespace]] = js.native
}
object SchemaListNamespacesResponse {
  
  @scala.inline
  def apply(): SchemaListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNamespacesResponse]
  }
  
  @scala.inline
  implicit class SchemaListNamespacesResponseOps[Self <: SchemaListNamespacesResponse] (val x: Self) extends AnyVal {
    
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
    def setNamespacesVarargs(value: SchemaNamespace*): Self = this.set("namespaces", js.Array(value :_*))
    
    @scala.inline
    def setNamespaces(value: js.Array[SchemaNamespace]): Self = this.set("namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaces: Self = this.set("namespaces", js.undefined)
  }
}
