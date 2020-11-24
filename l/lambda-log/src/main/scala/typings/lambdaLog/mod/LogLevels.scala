package typings.lambdaLog.mod

import org.scalablytyped.runtime.StringDictionary
import typings.lambdaLog.lambdaLogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLevels
  extends /* key */ StringDictionary[js.Any] {
  
  var debug: typings.lambdaLog.lambdaLogStrings.log | `false` = js.native
  
  var error: typings.lambdaLog.lambdaLogStrings.error = js.native
  
  var info: typings.lambdaLog.lambdaLogStrings.info = js.native
  
  var warn: typings.lambdaLog.lambdaLogStrings.warn = js.native
}
object LogLevels {
  
  @scala.inline
  def apply(
    debug: typings.lambdaLog.lambdaLogStrings.log | `false`,
    error: typings.lambdaLog.lambdaLogStrings.error,
    info: typings.lambdaLog.lambdaLogStrings.info,
    warn: typings.lambdaLog.lambdaLogStrings.warn
  ): LogLevels = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevels]
  }
  
  @scala.inline
  implicit class LogLevelsOps[Self <: LogLevels] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: typings.lambdaLog.lambdaLogStrings.log | `false`): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: typings.lambdaLog.lambdaLogStrings.error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: typings.lambdaLog.lambdaLogStrings.info): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: typings.lambdaLog.lambdaLogStrings.warn): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
}
