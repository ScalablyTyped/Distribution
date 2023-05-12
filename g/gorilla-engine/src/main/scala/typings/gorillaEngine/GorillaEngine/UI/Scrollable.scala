package typings.gorillaEngine.GorillaEngine.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollable extends StObject {
  
  var scrollbar: js.UndefOr[typings.gorillaEngine.anon.Background] = js.undefined
}
object Scrollable {
  
  inline def apply(): Scrollable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scrollable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scrollable] (val x: Self) extends AnyVal {
    
    inline def setScrollbar(value: typings.gorillaEngine.anon.Background): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
  }
}
