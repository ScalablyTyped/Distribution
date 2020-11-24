package typings.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptOptions extends js.Object {
  
  /** Pass Lab CLI options */
  var cli: js.UndefOr[js.Any] = js.native
  
  /** Enable auto-execution of the script? (true) */
  var schedule: js.UndefOr[Boolean] = js.native
}
object ScriptOptions {
  
  @scala.inline
  def apply(): ScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptOptions]
  }
  
  @scala.inline
  implicit class ScriptOptionsOps[Self <: ScriptOptions] (val x: Self) extends AnyVal {
    
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
    def setCli(value: js.Any): Self = this.set("cli", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCli: Self = this.set("cli", js.undefined)
    
    @scala.inline
    def setSchedule(value: Boolean): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
  }
}
