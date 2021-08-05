package typings.historyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HashChange extends StObject {
    
    var hashChange: js.UndefOr[js.Any] = js.undefined
    
    var pushState: js.UndefOr[js.Any] = js.undefined
  }
  object HashChange {
    
    inline def apply(): HashChange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashChange]
    }
    
    extension [Self <: HashChange](x: Self) {
      
      inline def setHashChange(value: js.Any): Self = StObject.set(x, "hashChange", value.asInstanceOf[js.Any])
      
      inline def setHashChangeUndefined: Self = StObject.set(x, "hashChange", js.undefined)
      
      inline def setPushState(value: js.Any): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
      
      inline def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    }
  }
}
