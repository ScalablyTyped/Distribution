package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details for the tool used to call the API.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails extends js.Object {
  
  /**
    * Name of the tool, e.g. bazel.
    */
  var toolName: js.UndefOr[String] = js.native
  
  /**
    * Version of the tool used for the request, e.g. 5.0.3.
    */
  var toolVersion: js.UndefOr[String] = js.native
}
object SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testToolDetailsOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testToolDetails] (val x: Self) extends AnyVal {
    
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
    def setToolName(value: String): Self = this.set("toolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolName: Self = this.set("toolName", js.undefined)
    
    @scala.inline
    def setToolVersion(value: String): Self = this.set("toolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolVersion: Self = this.set("toolVersion", js.undefined)
  }
}
