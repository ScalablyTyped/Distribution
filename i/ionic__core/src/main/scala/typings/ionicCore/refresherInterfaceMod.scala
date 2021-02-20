package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refresherInterfaceMod {
  
  @js.native
  trait RefresherEventDetail extends StObject {
    
    def complete(): Unit = js.native
  }
  object RefresherEventDetail {
    
    @scala.inline
    def apply(complete: () => Unit): RefresherEventDetail = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[RefresherEventDetail]
    }
    
    @scala.inline
    implicit class RefresherEventDetailMutableBuilder[Self <: RefresherEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    }
  }
}
