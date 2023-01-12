package typings.makerjs.MakerJs

import typings.makerjs.MakerJs.measure.Atlas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to measure.isPointInsideModel().
  */
trait IMeasurePointInsideOptions extends StObject {
  
  /**
    * Optional point of reference which is outside the bounds of the modelContext.
    */
  var farPoint: js.UndefOr[IPoint] = js.undefined
  
  /**
    * Optional atlas of measurements of paths within the model (to prevent intersection calculations).
    */
  var measureAtlas: js.UndefOr[Atlas] = js.undefined
  
  /**
    * Output variable which will contain an array of points where the ray intersected the model. The ray is a line from pointToCheck to options.farPoint.
    */
  var out_intersectionPoints: js.UndefOr[js.Array[IPoint]] = js.undefined
}
object IMeasurePointInsideOptions {
  
  inline def apply(): IMeasurePointInsideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMeasurePointInsideOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMeasurePointInsideOptions] (val x: Self) extends AnyVal {
    
    inline def setFarPoint(value: IPoint): Self = StObject.set(x, "farPoint", value.asInstanceOf[js.Any])
    
    inline def setFarPointUndefined: Self = StObject.set(x, "farPoint", js.undefined)
    
    inline def setMeasureAtlas(value: Atlas): Self = StObject.set(x, "measureAtlas", value.asInstanceOf[js.Any])
    
    inline def setMeasureAtlasUndefined: Self = StObject.set(x, "measureAtlas", js.undefined)
    
    inline def setOut_intersectionPoints(value: js.Array[IPoint]): Self = StObject.set(x, "out_intersectionPoints", value.asInstanceOf[js.Any])
    
    inline def setOut_intersectionPointsUndefined: Self = StObject.set(x, "out_intersectionPoints", js.undefined)
    
    inline def setOut_intersectionPointsVarargs(value: IPoint*): Self = StObject.set(x, "out_intersectionPoints", js.Array(value*))
  }
}
