package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indicator extends StObject {
  
  var indicator: Boolean
}
object Indicator {
  
  inline def apply(indicator: Boolean): Indicator = {
    val __obj = js.Dynamic.literal(indicator = indicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indicator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Indicator] (val x: Self) extends AnyVal {
    
    inline def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
  }
}
