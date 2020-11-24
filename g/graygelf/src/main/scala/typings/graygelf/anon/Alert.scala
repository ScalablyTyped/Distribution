package typings.graygelf.anon

import typings.graygelf.graygelfNumbers.`0`
import typings.graygelf.graygelfNumbers.`1`
import typings.graygelf.graygelfNumbers.`2`
import typings.graygelf.graygelfNumbers.`3`
import typings.graygelf.graygelfNumbers.`4`
import typings.graygelf.graygelfNumbers.`5`
import typings.graygelf.graygelfNumbers.`6`
import typings.graygelf.graygelfNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alert extends js.Object {
  
  var alert: `1` = js.native
  
  var crit: `2` = js.native
  
  var debug: `7` = js.native
  
  var emerg: `0` = js.native
  
  var err: `3` = js.native
  
  var error: `3` = js.native
  
  var info: `6` = js.native
  
  var notice: `5` = js.native
  
  var panic: `0` = js.native
  
  var warn: `4` = js.native
  
  var warning: `4` = js.native
}
object Alert {
  
  @scala.inline
  def apply(
    alert: `1`,
    crit: `2`,
    debug: `7`,
    emerg: `0`,
    err: `3`,
    error: `3`,
    info: `6`,
    notice: `5`,
    panic: `0`,
    warn: `4`,
    warning: `4`
  ): Alert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], panic = panic.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
  
  @scala.inline
  implicit class AlertOps[Self <: Alert] (val x: Self) extends AnyVal {
    
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
    def setAlert(value: `1`): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrit(value: `2`): Self = this.set("crit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: `7`): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmerg(value: `0`): Self = this.set("emerg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: `3`): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: `3`): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: `6`): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotice(value: `5`): Self = this.set("notice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanic(value: `0`): Self = this.set("panic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: `4`): Self = this.set("warn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: `4`): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
}
