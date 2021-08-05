package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveIndices extends StObject {
  
  var removeIndices: js.UndefOr[Boolean] = js.undefined
}
object RemoveIndices {
  
  inline def apply(): RemoveIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveIndices]
  }
  
  extension [Self <: RemoveIndices](x: Self) {
    
    inline def setRemoveIndices(value: Boolean): Self = StObject.set(x, "removeIndices", value.asInstanceOf[js.Any])
    
    inline def setRemoveIndicesUndefined: Self = StObject.set(x, "removeIndices", js.undefined)
  }
}
