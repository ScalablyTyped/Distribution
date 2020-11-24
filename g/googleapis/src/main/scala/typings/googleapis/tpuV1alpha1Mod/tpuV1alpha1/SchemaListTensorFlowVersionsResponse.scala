package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for ListTensorFlowVersions.
  */
@js.native
trait SchemaListTensorFlowVersionsResponse extends js.Object {
  
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The listed nodes.
    */
  var tensorflowVersions: js.UndefOr[js.Array[SchemaTensorFlowVersion]] = js.native
}
object SchemaListTensorFlowVersionsResponse {
  
  @scala.inline
  def apply(): SchemaListTensorFlowVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTensorFlowVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTensorFlowVersionsResponseOps[Self <: SchemaListTensorFlowVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTensorflowVersionsVarargs(value: SchemaTensorFlowVersion*): Self = this.set("tensorflowVersions", js.Array(value :_*))
    
    @scala.inline
    def setTensorflowVersions(value: js.Array[SchemaTensorFlowVersion]): Self = this.set("tensorflowVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensorflowVersions: Self = this.set("tensorflowVersions", js.undefined)
  }
}
