package typings.hapi.anon

import typings.hapi.mod.Lifecycle.ReturnValue
import typings.hapi.mod.ResponseToolkit
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailAction extends StObject {
  
  var failAction: js.UndefOr[typings.hapi.mod.Lifecycle.FailAction] = js.undefined
  
  var parse: js.UndefOr[Boolean] = js.undefined
}
object FailAction {
  
  @scala.inline
  def apply(): FailAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailAction]
  }
  
  @scala.inline
  implicit class FailActionMutableBuilder[Self <: FailAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailAction(value: typings.hapi.mod.Lifecycle.FailAction): Self = StObject.set(x, "failAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailActionFunction3(
      value: (/* request */ typings.hapi.mod.Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[Error]) => ReturnValue
    ): Self = StObject.set(x, "failAction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFailActionUndefined: Self = StObject.set(x, "failAction", js.undefined)
    
    @scala.inline
    def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
  }
}
