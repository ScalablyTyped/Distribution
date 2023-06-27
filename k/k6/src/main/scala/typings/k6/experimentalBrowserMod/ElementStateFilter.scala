package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementStateFilter extends StObject {
  
  /**
    * The element state to filter for.
    * @default 'visible'
    */
  var state: js.UndefOr[ElementState] = js.undefined
}
object ElementStateFilter {
  
  inline def apply(): ElementStateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementStateFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementStateFilter] (val x: Self) extends AnyVal {
    
    inline def setState(value: ElementState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
