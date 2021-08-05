package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromPoint extends StObject {
  
  var fromPoint: js.UndefOr[Boolean] = js.undefined
}
object FromPoint {
  
  inline def apply(): FromPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromPoint]
  }
  
  extension [Self <: FromPoint](x: Self) {
    
    inline def setFromPoint(value: Boolean): Self = StObject.set(x, "fromPoint", value.asInstanceOf[js.Any])
    
    inline def setFromPointUndefined: Self = StObject.set(x, "fromPoint", js.undefined)
  }
}
