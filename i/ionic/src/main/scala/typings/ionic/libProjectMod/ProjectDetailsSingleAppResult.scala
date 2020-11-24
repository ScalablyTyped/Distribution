package typings.ionic.libProjectMod

import typings.ionic.ionicStrings.app
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectDetailsSingleAppResult extends ProjectDetailsResultBase {
  
  val context: app = js.native
}
object ProjectDetailsSingleAppResult {
  
  @scala.inline
  def apply(context: app, errors: js.Array[ProjectDetailsError]): ProjectDetailsSingleAppResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsSingleAppResult]
  }
  
  @scala.inline
  implicit class ProjectDetailsSingleAppResultOps[Self <: ProjectDetailsSingleAppResult] (val x: Self) extends AnyVal {
    
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
    def setContext(value: app): Self = this.set("context", value.asInstanceOf[js.Any])
  }
}
