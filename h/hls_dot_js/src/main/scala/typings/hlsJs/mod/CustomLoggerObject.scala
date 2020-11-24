package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLoggerObject extends js.Object {
  
  var debug: js.UndefOr[CustomLogger] = js.native
  
  var error: js.UndefOr[CustomLogger] = js.native
  
  var info: js.UndefOr[CustomLogger] = js.native
  
  var log: js.UndefOr[CustomLogger] = js.native
  
  var warn: js.UndefOr[CustomLogger] = js.native
}
object CustomLoggerObject {
  
  @scala.inline
  def apply(): CustomLoggerObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLoggerObject]
  }
  
  @scala.inline
  implicit class CustomLoggerObjectOps[Self <: CustomLoggerObject] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: /* repeated */ js.Any => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
}
