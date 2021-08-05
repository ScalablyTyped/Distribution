package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refresherInterfaceMod {
  
  trait RefresherEventDetail extends StObject {
    
    def complete(): Unit
  }
  object RefresherEventDetail {
    
    inline def apply(complete: () => Unit): RefresherEventDetail = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[RefresherEventDetail]
    }
    
    extension [Self <: RefresherEventDetail](x: Self) {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    }
  }
}
