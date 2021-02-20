package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGCircleAttributes extends SVGAttributes {
  
  var cx: js.UndefOr[String | Double] = js.native
  
  var cy: js.UndefOr[String | Double] = js.native
  
  var r: js.UndefOr[String | Double] = js.native
}
object SVGCircleAttributes {
  
  @scala.inline
  def apply(): SVGCircleAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCircleAttributes]
  }
  
  @scala.inline
  implicit class SVGCircleAttributesMutableBuilder[Self <: SVGCircleAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: String | Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: String | Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setR(value: String | Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
