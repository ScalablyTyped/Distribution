package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dense extends StObject {
  
  var dense: js.UndefOr[Boolean] = js.undefined
}
object Dense {
  
  inline def apply(): Dense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dense]
  }
  
  extension [Self <: Dense](x: Self) {
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
  }
}
