package typings.mapboxGlLeaflet

import typings.leaflet.mod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "MapboxGL")
  @js.native
  open class MapboxGL_ protected () extends Layer {
    def this(options: MapboxGLOptions) = this()
  }
  
  inline def mapboxGL(options: MapboxGLOptions): MapboxGL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("mapboxGL")(options.asInstanceOf[js.Any]).asInstanceOf[MapboxGL_]
  
  trait MapboxGLOptions extends StObject {
    
    var accessToken: String
    
    var style: String
  }
  object MapboxGLOptions {
    
    inline def apply(accessToken: String, style: String): MapboxGLOptions = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapboxGLOptions]
    }
    
    extension [Self <: MapboxGLOptions](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
