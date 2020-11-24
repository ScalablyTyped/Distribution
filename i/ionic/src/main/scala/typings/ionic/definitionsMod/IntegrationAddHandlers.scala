package typings.ionic.definitionsMod

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegrationAddHandlers extends js.Object {
  
  var conflictHandler: js.UndefOr[js.Function2[/* f */ String, /* stats */ Stats, js.Promise[Boolean]]] = js.native
  
  var onFileCreate: js.UndefOr[js.Function1[/* f */ String, Unit]] = js.native
}
object IntegrationAddHandlers {
  
  @scala.inline
  def apply(): IntegrationAddHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationAddHandlers]
  }
  
  @scala.inline
  implicit class IntegrationAddHandlersOps[Self <: IntegrationAddHandlers] (val x: Self) extends AnyVal {
    
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
    def setConflictHandler(value: (/* f */ String, /* stats */ Stats) => js.Promise[Boolean]): Self = this.set("conflictHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteConflictHandler: Self = this.set("conflictHandler", js.undefined)
    
    @scala.inline
    def setOnFileCreate(value: /* f */ String => Unit): Self = this.set("onFileCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFileCreate: Self = this.set("onFileCreate", js.undefined)
  }
}
