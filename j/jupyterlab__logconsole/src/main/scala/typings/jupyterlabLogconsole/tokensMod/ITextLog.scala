package typings.jupyterlabLogconsole.tokensMod

import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextLog
  extends ILogPayloadBase
     with ILogPayload {
  
  /**
    * Log data as plain text.
    */
  @JSName("data")
  var data_ITextLog: String = js.native
  
  /**
    * Type of log data.
    */
  @JSName("type")
  var type_ITextLog: text = js.native
}
object ITextLog {
  
  @scala.inline
  def apply(data: String, level: LogLevel, `type`: text): ITextLog = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextLog]
  }
  
  @scala.inline
  implicit class ITextLogOps[Self <: ITextLog] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: text): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
