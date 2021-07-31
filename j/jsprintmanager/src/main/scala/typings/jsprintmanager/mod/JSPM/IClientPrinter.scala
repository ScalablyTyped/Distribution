package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientPrinter extends StObject {
  
  var Id: js.Any
  
  def serialize(): js.Any
}
object IClientPrinter {
  
  @scala.inline
  def apply(Id: js.Any, serialize: () => js.Any): IClientPrinter = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[IClientPrinter]
  }
  
  @scala.inline
  implicit class IClientPrinterMutableBuilder[Self <: IClientPrinter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialize(value: () => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
  }
}
