package typings.mapboxMapboxGlSupported

import typings.std.WebGLContextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/mapbox-gl-supported", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def notSupportedReason(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("notSupportedReason")().asInstanceOf[String]
  inline def notSupportedReason(options: IsSupportedOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("notSupportedReason")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mapbox/mapbox-gl-supported", "supported")
  @js.native
  val supported: IsSupported = js.native
  
  @js.native
  trait IsSupported extends StObject {
    
    def apply(): Boolean = js.native
    def apply(options: IsSupportedOptions): Boolean = js.native
    
    var webGLContextAttributes: WebGLContextAttributes = js.native
  }
  
  trait IsSupportedOptions extends StObject {
    
    var failIfMajorPerformanceCaveat: Boolean
  }
  object IsSupportedOptions {
    
    inline def apply(failIfMajorPerformanceCaveat: Boolean): IsSupportedOptions = {
      val __obj = js.Dynamic.literal(failIfMajorPerformanceCaveat = failIfMajorPerformanceCaveat.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsSupportedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsSupportedOptions] (val x: Self) extends AnyVal {
      
      inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    }
  }
}
