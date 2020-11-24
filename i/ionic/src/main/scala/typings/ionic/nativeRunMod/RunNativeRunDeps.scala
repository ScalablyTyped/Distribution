package typings.ionic.nativeRunMod

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunNativeRunDeps extends js.Object {
  
  val config: IConfig = js.native
  
  val log: ILogger = js.native
  
  val shell: IShell = js.native
}
object RunNativeRunDeps {
  
  @scala.inline
  def apply(config: IConfig, log: ILogger, shell: IShell): RunNativeRunDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunNativeRunDeps]
  }
  
  @scala.inline
  implicit class RunNativeRunDepsOps[Self <: RunNativeRunDeps] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: IConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: ILogger): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShell(value: IShell): Self = this.set("shell", value.asInstanceOf[js.Any])
  }
}
