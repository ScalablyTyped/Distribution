package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathAttributes
  extends StObject
     with SVGAttributes {
  
  var d: js.UndefOr[String] = js.undefined
  
  var `path-length`: js.UndefOr[Double] = js.undefined
  
  var pathLength: js.UndefOr[Double] = js.undefined
}
object SVGPathAttributes {
  
  @scala.inline
  def apply(): SVGPathAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPathAttributes]
  }
  
  @scala.inline
  implicit class SVGPathAttributesMutableBuilder[Self <: SVGPathAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def `setPath-length`(value: Double): Self = StObject.set(x, "path-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPath-lengthUndefined`: Self = StObject.set(x, "path-length", js.undefined)
    
    @scala.inline
    def setPathLength(value: Double): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
  }
}
