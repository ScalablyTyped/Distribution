package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabSharedModels.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentChange extends StObject {
  
  var contextChange: js.UndefOr[MapChange] = js.undefined
  
  var stateChange: js.UndefOr[js.Array[Name]] = js.undefined
}
object DocumentChange {
  
  inline def apply(): DocumentChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentChange]
  }
  
  extension [Self <: DocumentChange](x: Self) {
    
    inline def setContextChange(value: MapChange): Self = StObject.set(x, "contextChange", value.asInstanceOf[js.Any])
    
    inline def setContextChangeUndefined: Self = StObject.set(x, "contextChange", js.undefined)
    
    inline def setStateChange(value: js.Array[Name]): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
    
    inline def setStateChangeVarargs(value: Name*): Self = StObject.set(x, "stateChange", js.Array(value*))
  }
}
