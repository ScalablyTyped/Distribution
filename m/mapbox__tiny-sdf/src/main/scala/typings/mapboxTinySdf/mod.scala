package typings.mapboxTinySdf

import typings.mapboxTinySdf.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/tiny-sdf", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TinySDF {
    def this(options: TinySDFOptions) = this()
    
    /* CompleteClass */
    override def draw(char: String): Data = js.native
  }
  
  trait TinySDF extends StObject {
    
    def draw(char: String): Data
  }
  object TinySDF {
    
    inline def apply(draw: String => Data): TinySDF = {
      val __obj = js.Dynamic.literal(draw = js.Any.fromFunction1(draw))
      __obj.asInstanceOf[TinySDF]
    }
    
    extension [Self <: TinySDF](x: Self) {
      
      inline def setDraw(value: String => Data): Self = StObject.set(x, "draw", js.Any.fromFunction1(value))
    }
  }
  
  trait TinySDFOptions extends StObject {
    
    var buffer: js.UndefOr[Double] = js.undefined
    
    var cutoff: js.UndefOr[Double] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object TinySDFOptions {
    
    inline def apply(): TinySDFOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TinySDFOptions]
    }
    
    extension [Self <: TinySDFOptions](x: Self) {
      
      inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setCutoff(value: Double): Self = StObject.set(x, "cutoff", value.asInstanceOf[js.Any])
      
      inline def setCutoffUndefined: Self = StObject.set(x, "cutoff", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
