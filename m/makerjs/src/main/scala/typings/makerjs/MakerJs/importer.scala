package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importer {
  
  /**
    * SVG importing options.
    */
  trait ISVGImportOptions extends StObject {
    
    /**
      * Optional accuracy of Bezier curves and elliptic paths.
      */
    var bezierAccuracy: js.UndefOr[Double] = js.undefined
  }
  object ISVGImportOptions {
    
    inline def apply(): ISVGImportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISVGImportOptions]
    }
    
    extension [Self <: ISVGImportOptions](x: Self) {
      
      inline def setBezierAccuracy(value: Double): Self = StObject.set(x, "bezierAccuracy", value.asInstanceOf[js.Any])
      
      inline def setBezierAccuracyUndefined: Self = StObject.set(x, "bezierAccuracy", js.undefined)
    }
  }
}
