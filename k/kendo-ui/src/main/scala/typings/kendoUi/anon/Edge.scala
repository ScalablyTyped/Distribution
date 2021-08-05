package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge extends StObject {
  
  var edge: Boolean
  
  var mozilla: Boolean
  
  var msie: Boolean
  
  var opera: Boolean
  
  var safari: Boolean
  
  var version: String
  
  var webkit: Boolean
}
object Edge {
  
  inline def apply(
    edge: Boolean,
    mozilla: Boolean,
    msie: Boolean,
    opera: Boolean,
    safari: Boolean,
    version: String,
    webkit: Boolean
  ): Edge = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], mozilla = mozilla.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  
  extension [Self <: Edge](x: Self) {
    
    inline def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setMozilla(value: Boolean): Self = StObject.set(x, "mozilla", value.asInstanceOf[js.Any])
    
    inline def setMsie(value: Boolean): Self = StObject.set(x, "msie", value.asInstanceOf[js.Any])
    
    inline def setOpera(value: Boolean): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
    
    inline def setSafari(value: Boolean): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWebkit(value: Boolean): Self = StObject.set(x, "webkit", value.asInstanceOf[js.Any])
  }
}
