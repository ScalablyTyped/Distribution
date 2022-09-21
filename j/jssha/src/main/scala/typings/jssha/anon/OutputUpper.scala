package typings.jssha.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputUpper extends StObject {
  
  var outputUpper: js.UndefOr[Boolean] = js.undefined
}
object OutputUpper {
  
  inline def apply(): OutputUpper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputUpper]
  }
  
  extension [Self <: OutputUpper](x: Self) {
    
    inline def setOutputUpper(value: Boolean): Self = StObject.set(x, "outputUpper", value.asInstanceOf[js.Any])
    
    inline def setOutputUpperUndefined: Self = StObject.set(x, "outputUpper", js.undefined)
  }
}
