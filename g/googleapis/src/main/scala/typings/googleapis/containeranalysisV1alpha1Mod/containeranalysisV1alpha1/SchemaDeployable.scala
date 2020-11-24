package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An artifact that can be deployed in some runtime.
  */
@js.native
trait SchemaDeployable extends js.Object {
  
  /**
    * Resource URI for the artifact being deployed.
    */
  var resourceUri: js.UndefOr[js.Array[String]] = js.native
}
object SchemaDeployable {
  
  @scala.inline
  def apply(): SchemaDeployable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployable]
  }
  
  @scala.inline
  implicit class SchemaDeployableOps[Self <: SchemaDeployable] (val x: Self) extends AnyVal {
    
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
    def setResourceUriVarargs(value: String*): Self = this.set("resourceUri", js.Array(value :_*))
    
    @scala.inline
    def setResourceUri(value: js.Array[String]): Self = this.set("resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUri: Self = this.set("resourceUri", js.undefined)
  }
}
