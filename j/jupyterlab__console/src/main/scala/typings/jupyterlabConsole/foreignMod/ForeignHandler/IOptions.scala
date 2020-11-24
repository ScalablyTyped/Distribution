package typings.jupyterlabConsole.foreignMod.ForeignHandler

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The instantiation options for a foreign handler.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The parent into which the handler will inject code cells.
    */
  var parent: IReceiver = js.native
  
  /**
    * The client session used by the foreign handler.
    */
  var sessionContext: ISessionContext = js.native
}
object IOptions {
  
  @scala.inline
  def apply(parent: IReceiver, sessionContext: ISessionContext): IOptions = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], sessionContext = sessionContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setParent(value: IReceiver): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionContext(value: ISessionContext): Self = this.set("sessionContext", value.asInstanceOf[js.Any])
  }
}
