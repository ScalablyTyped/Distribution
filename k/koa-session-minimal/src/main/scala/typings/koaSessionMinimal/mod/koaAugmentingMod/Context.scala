package typings.koaSessionMinimal.mod.koaAugmentingMod

import typings.koaSessionMinimal.anon.RegenerateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  var session: js.Any = js.native
  
  var sessionHandler: RegenerateId = js.native
}
object Context {
  
  @scala.inline
  def apply(session: js.Any, sessionHandler: RegenerateId): Context = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], sessionHandler = sessionHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setSession(value: js.Any): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionHandler(value: RegenerateId): Self = this.set("sessionHandler", value.asInstanceOf[js.Any])
  }
}
