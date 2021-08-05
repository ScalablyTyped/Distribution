package typings.ionic.definitionsMod

import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegrationAddHandlers extends StObject {
  
  var conflictHandler: js.UndefOr[js.Function2[/* f */ String, /* stats */ Stats, js.Promise[Boolean]]] = js.undefined
  
  var onFileCreate: js.UndefOr[js.Function1[/* f */ String, Unit]] = js.undefined
}
object IntegrationAddHandlers {
  
  inline def apply(): IntegrationAddHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationAddHandlers]
  }
  
  extension [Self <: IntegrationAddHandlers](x: Self) {
    
    inline def setConflictHandler(value: (/* f */ String, /* stats */ Stats) => js.Promise[Boolean]): Self = StObject.set(x, "conflictHandler", js.Any.fromFunction2(value))
    
    inline def setConflictHandlerUndefined: Self = StObject.set(x, "conflictHandler", js.undefined)
    
    inline def setOnFileCreate(value: /* f */ String => Unit): Self = StObject.set(x, "onFileCreate", js.Any.fromFunction1(value))
    
    inline def setOnFileCreateUndefined: Self = StObject.set(x, "onFileCreate", js.undefined)
  }
}
