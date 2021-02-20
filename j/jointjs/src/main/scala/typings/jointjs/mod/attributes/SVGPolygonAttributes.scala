package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPolygonAttributes extends SVGAttributes {
  
  var points: js.UndefOr[String] = js.native
}
object SVGPolygonAttributes {
  
  @scala.inline
  def apply(): SVGPolygonAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolygonAttributes]
  }
  
  @scala.inline
  implicit class SVGPolygonAttributesMutableBuilder[Self <: SVGPolygonAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
  }
}
