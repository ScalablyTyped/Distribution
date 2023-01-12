package typings.lonaSvgModel.libSvgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPolylineAttributes
  extends StObject
     with SVGBaseAttributes {
  
  var points: String
}
object SVGPolylineAttributes {
  
  inline def apply(points: String): SVGPolylineAttributes = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPolylineAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPolylineAttributes] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
