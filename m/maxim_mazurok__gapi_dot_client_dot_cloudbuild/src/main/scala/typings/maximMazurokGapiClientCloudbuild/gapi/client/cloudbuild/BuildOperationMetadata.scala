package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildOperationMetadata extends js.Object {
  
  /** The build that the operation is tracking. */
  var build: js.UndefOr[Build] = js.native
}
object BuildOperationMetadata {
  
  @scala.inline
  def apply(): BuildOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOperationMetadata]
  }
  
  @scala.inline
  implicit class BuildOperationMetadataOps[Self <: BuildOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: Build): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
  }
}
