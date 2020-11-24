package typings.jupyterlabLogconsole.tokensMod

import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.output
import typings.jupyterlabNbformat.mod.IOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOutputLog
  extends ILogPayloadBase
     with ILogPayload {
  
  /**
    * Log data as Notebook kernel output.
    */
  @JSName("data")
  var data_IOutputLog: IOutput = js.native
  
  /**
    * Type of log data.
    */
  @JSName("type")
  var type_IOutputLog: output = js.native
}
object IOutputLog {
  
  @scala.inline
  def apply(data: IOutput, level: LogLevel, `type`: output): IOutputLog = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutputLog]
  }
  
  @scala.inline
  implicit class IOutputLogOps[Self <: IOutputLog] (val x: Self) extends AnyVal {
    
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
    def setData(value: IOutput): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: output): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
