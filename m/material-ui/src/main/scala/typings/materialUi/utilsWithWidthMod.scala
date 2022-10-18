package typings.materialUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsWithWidthMod {
  
  @JSImport("material-ui/utils/withWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[C /* <: js.Function */](): js.Function1[/* component */ C, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* component */ C, C]]
  inline def default[C /* <: js.Function */](options: Options): js.Function1[/* component */ C, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ C, C]]
  
  @JSImport("material-ui/utils/withWidth", "LARGE")
  @js.native
  val LARGE: Double = js.native
  
  @JSImport("material-ui/utils/withWidth", "MEDIUM")
  @js.native
  val MEDIUM: Double = js.native
  
  @JSImport("material-ui/utils/withWidth", "SMALL")
  @js.native
  val SMALL: Double = js.native
  
  trait Options extends StObject {
    
    var largeWidth: js.UndefOr[Double] = js.undefined
    
    var mediumWidth: js.UndefOr[Double] = js.undefined
    
    var resizeInterval: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLargeWidth(value: Double): Self = StObject.set(x, "largeWidth", value.asInstanceOf[js.Any])
      
      inline def setLargeWidthUndefined: Self = StObject.set(x, "largeWidth", js.undefined)
      
      inline def setMediumWidth(value: Double): Self = StObject.set(x, "mediumWidth", value.asInstanceOf[js.Any])
      
      inline def setMediumWidthUndefined: Self = StObject.set(x, "mediumWidth", js.undefined)
      
      inline def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
      
      inline def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
    }
  }
}
