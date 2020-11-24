package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bind extends js.Object {
  
  var bind: js.Object = js.native
  
  var files: RelativeTo = js.native
}
object Bind {
  
  @scala.inline
  def apply(bind: js.Object, files: RelativeTo): Bind = {
    val __obj = js.Dynamic.literal(bind = bind.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bind]
  }
  
  @scala.inline
  implicit class BindOps[Self <: Bind] (val x: Self) extends AnyVal {
    
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
    def setBind(value: js.Object): Self = this.set("bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: RelativeTo): Self = this.set("files", value.asInstanceOf[js.Any])
  }
}
