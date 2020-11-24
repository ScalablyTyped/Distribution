package typings.ionic.promptsMod

import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOnFallbackOptions extends js.Object {
  
  val flags: IonicEnvironmentFlags = js.native
  
  val log: ILogger = js.native
}
object CreateOnFallbackOptions {
  
  @scala.inline
  def apply(flags: IonicEnvironmentFlags, log: ILogger): CreateOnFallbackOptions = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOnFallbackOptions]
  }
  
  @scala.inline
  implicit class CreateOnFallbackOptionsOps[Self <: CreateOnFallbackOptions] (val x: Self) extends AnyVal {
    
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
    def setFlags(value: IonicEnvironmentFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: ILogger): Self = this.set("log", value.asInstanceOf[js.Any])
  }
}
