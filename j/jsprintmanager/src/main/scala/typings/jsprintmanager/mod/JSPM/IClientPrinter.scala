package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientPrinter extends StObject {
  
  var Id: Any
  
  def serialize(): Any
}
object IClientPrinter {
  
  inline def apply(Id: Any, serialize: () => Any): IClientPrinter = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[IClientPrinter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientPrinter] (val x: Self) extends AnyVal {
    
    inline def setId(value: Any): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: () => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
  }
}
