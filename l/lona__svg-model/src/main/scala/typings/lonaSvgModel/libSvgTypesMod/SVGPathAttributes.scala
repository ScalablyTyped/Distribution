package typings.lonaSvgModel.libSvgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathAttributes
  extends StObject
     with SVGBaseAttributes {
  
  var d: String
}
object SVGPathAttributes {
  
  inline def apply(d: String): SVGPathAttributes = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPathAttributes] (val x: Self) extends AnyVal {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
  }
}
