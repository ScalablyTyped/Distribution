package typings.jupyterlabLogconsole.anon

import typings.jupyterlabLogconsole.loggerMod.ILogOutput
import typings.jupyterlabLogconsole.loggerMod.ILogOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastModel extends js.Object {
  
  var lastModel: ILogOutputModel = js.native
  
  var value: ILogOutput = js.native
}
object LastModel {
  
  @scala.inline
  def apply(lastModel: ILogOutputModel, value: ILogOutput): LastModel = {
    val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastModel]
  }
  
  @scala.inline
  implicit class LastModelOps[Self <: LastModel] (val x: Self) extends AnyVal {
    
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
    def setLastModel(value: ILogOutputModel): Self = this.set("lastModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ILogOutput): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
