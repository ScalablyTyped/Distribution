package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  trait EmitterAugmentation1[Name /* <: String | js.Symbol */, Arg] extends StObject {
    
    def addListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
    
    def emit(event: Name, arg1: Arg): Boolean
    
    def on(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
    
    def once(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
    
    def prependListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
    
    def prependOnceListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
    
    def removeListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
  }
  object EmitterAugmentation1 {
    
    inline def apply[Name /* <: String | js.Symbol */, Arg](
      addListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
      emit: (Name, Arg) => Boolean,
      on: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
      once: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
      prependListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
      prependOnceListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
      removeListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]
    ): EmitterAugmentation1[Name, Arg] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[EmitterAugmentation1[Name, Arg]]
    }
    
    extension [Self <: EmitterAugmentation1[?, ?], Name /* <: String | js.Symbol */, Arg](x: Self & (EmitterAugmentation1[Name, Arg])) {
      
      inline def setAddListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setEmit(value: (Name, Arg) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setOn(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setPrependListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      inline def setPrependOnceListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      inline def setRemoveListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
}
