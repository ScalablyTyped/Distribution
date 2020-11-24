package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The access controls set on the resource.
  */
@js.native
trait SchemaResourceAccessControl extends js.Object {
  
  /**
    * The GCP IAM Policy to set on the resource.
    */
  var gcpIamPolicy: js.UndefOr[String] = js.native
}
object SchemaResourceAccessControl {
  
  @scala.inline
  def apply(): SchemaResourceAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceAccessControl]
  }
  
  @scala.inline
  implicit class SchemaResourceAccessControlOps[Self <: SchemaResourceAccessControl] (val x: Self) extends AnyVal {
    
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
    def setGcpIamPolicy(value: String): Self = this.set("gcpIamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcpIamPolicy: Self = this.set("gcpIamPolicy", js.undefined)
  }
}
