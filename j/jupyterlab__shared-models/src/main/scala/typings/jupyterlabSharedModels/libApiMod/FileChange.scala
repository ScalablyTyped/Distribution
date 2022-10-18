package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabSharedModels.anon.Delete
import typings.jupyterlabSharedModels.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileChange extends StObject {
  
  var contextChange: js.UndefOr[MapChange] = js.undefined
  
  var sourceChange: js.UndefOr[Delta[String]] = js.undefined
  
  var stateChange: js.UndefOr[js.Array[Name]] = js.undefined
}
object FileChange {
  
  inline def apply(): FileChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileChange]
  }
  
  extension [Self <: FileChange](x: Self) {
    
    inline def setContextChange(value: MapChange): Self = StObject.set(x, "contextChange", value.asInstanceOf[js.Any])
    
    inline def setContextChangeUndefined: Self = StObject.set(x, "contextChange", js.undefined)
    
    inline def setSourceChange(value: Delta[String]): Self = StObject.set(x, "sourceChange", value.asInstanceOf[js.Any])
    
    inline def setSourceChangeUndefined: Self = StObject.set(x, "sourceChange", js.undefined)
    
    inline def setSourceChangeVarargs(value: Delete[String]*): Self = StObject.set(x, "sourceChange", js.Array(value*))
    
    inline def setStateChange(value: js.Array[Name]): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
    
    inline def setStateChangeVarargs(value: Name*): Self = StObject.set(x, "stateChange", js.Array(value*))
  }
}
