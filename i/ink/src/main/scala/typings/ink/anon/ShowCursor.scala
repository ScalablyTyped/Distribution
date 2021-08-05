package typings.ink.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowCursor extends StObject {
  
  var showCursor: js.UndefOr[Boolean] = js.undefined
}
object ShowCursor {
  
  inline def apply(): ShowCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowCursor]
  }
  
  extension [Self <: ShowCursor](x: Self) {
    
    inline def setShowCursor(value: Boolean): Self = StObject.set(x, "showCursor", value.asInstanceOf[js.Any])
    
    inline def setShowCursorUndefined: Self = StObject.set(x, "showCursor", js.undefined)
  }
}
