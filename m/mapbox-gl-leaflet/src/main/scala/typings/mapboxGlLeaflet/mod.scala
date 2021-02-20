package typings.mapboxGlLeaflet

import typings.leaflet.mod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", "MapboxGL")
  @js.native
  class MapboxGL_ protected () extends Layer {
    def this(options: MapboxGLOptions) = this()
  }
  
  @JSImport("leaflet", "mapboxGL")
  @js.native
  def mapboxGL(options: MapboxGLOptions): MapboxGL_ = js.native
  
  @js.native
  trait MapboxGLOptions extends StObject {
    
    var accessToken: String = js.native
    
    var style: String = js.native
  }
  object MapboxGLOptions {
    
    @scala.inline
    def apply(accessToken: String, style: String): MapboxGLOptions = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapboxGLOptions]
    }
    
    @scala.inline
    implicit class MapboxGLOptionsMutableBuilder[Self <: MapboxGLOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
