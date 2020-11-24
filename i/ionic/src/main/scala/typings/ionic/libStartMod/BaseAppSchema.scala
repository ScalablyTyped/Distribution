package typings.ionic.libStartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAppSchema extends js.Object {
  
  var appflowId: js.UndefOr[String] = js.native
  
  var packageId: js.UndefOr[String] = js.native
  
  var projectDir: String = js.native
  
  var projectId: String = js.native
}
object BaseAppSchema {
  
  @scala.inline
  def apply(projectDir: String, projectId: String): BaseAppSchema = {
    val __obj = js.Dynamic.literal(projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAppSchema]
  }
  
  @scala.inline
  implicit class BaseAppSchemaOps[Self <: BaseAppSchema] (val x: Self) extends AnyVal {
    
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
    def setProjectDir(value: String): Self = this.set("projectDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppflowId(value: String): Self = this.set("appflowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppflowId: Self = this.set("appflowId", js.undefined)
    
    @scala.inline
    def setPackageId(value: String): Self = this.set("packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageId: Self = this.set("packageId", js.undefined)
  }
}
