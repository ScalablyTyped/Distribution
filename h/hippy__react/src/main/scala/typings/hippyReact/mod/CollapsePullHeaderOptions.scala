package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsePullHeaderOptions extends StObject {
  
  // time left to hide pullHeader after collapsePullHeader() is called, unit is ms
  var time: js.UndefOr[Double] = js.undefined
}
object CollapsePullHeaderOptions {
  
  inline def apply(): CollapsePullHeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsePullHeaderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapsePullHeaderOptions] (val x: Self) extends AnyVal {
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
