package typings.istanbulReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectOptions extends js.Object {
  
  var projectRoot: String = js.native
}
object ProjectOptions {
  
  @scala.inline
  def apply(projectRoot: String): ProjectOptions = {
    val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectOptions]
  }
  
  @scala.inline
  implicit class ProjectOptionsOps[Self <: ProjectOptions] (val x: Self) extends AnyVal {
    
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
    def setProjectRoot(value: String): Self = this.set("projectRoot", value.asInstanceOf[js.Any])
  }
}
