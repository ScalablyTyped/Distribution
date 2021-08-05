package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPolylineAttributes
  extends StObject
     with SVGAttributes {
  
  var points: js.UndefOr[String] = js.undefined
}
object SVGPolylineAttributes {
  
  inline def apply(): SVGPolylineAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolylineAttributes]
  }
  
  extension [Self <: SVGPolylineAttributes](x: Self) {
    
    inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
  }
}
