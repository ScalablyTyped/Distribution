package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerCollection extends StObject {
  
  def add(
    `type`: String,
    callback: js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[Any], 
      js.Promise[Any] | Unit
    ]
  ): Unit
}
object ListenerCollection {
  
  inline def apply(
    add: (String, js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[Any], 
      js.Promise[Any] | Unit
    ]) => Unit
  ): ListenerCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
    __obj.asInstanceOf[ListenerCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListenerCollection] (val x: Self) extends AnyVal {
    
    inline def setAdd(
      value: (String, js.Function3[
          /* req */ Request, 
          /* res */ Response, 
          /* err */ js.UndefOr[Any], 
          js.Promise[Any] | Unit
        ]) => Unit
    ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
  }
}
