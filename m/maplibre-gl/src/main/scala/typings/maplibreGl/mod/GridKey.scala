package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridKey extends StObject {
  
  var overlapMode: js.UndefOr[OverlapMode] = js.undefined
}
object GridKey {
  
  inline def apply(): GridKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridKey] (val x: Self) extends AnyVal {
    
    inline def setOverlapMode(value: OverlapMode): Self = StObject.set(x, "overlapMode", value.asInstanceOf[js.Any])
    
    inline def setOverlapModeUndefined: Self = StObject.set(x, "overlapMode", js.undefined)
  }
}
