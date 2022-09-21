package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternData extends StObject {
  
  var boundingBox: js.UndefOr[js.Array[Double]] = js.undefined
  
  var key: String
  
  var matrix: js.UndefOr[Matrix] = js.undefined
  
  var xStep: js.UndefOr[Double] = js.undefined
  
  var yStep: js.UndefOr[Double] = js.undefined
}
object PatternData {
  
  inline def apply(key: String): PatternData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternData]
  }
  
  extension [Self <: PatternData](x: Self) {
    
    inline def setBoundingBox(value: js.Array[Double]): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    inline def setBoundingBoxVarargs(value: Double*): Self = StObject.set(x, "boundingBox", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: Matrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setXStep(value: Double): Self = StObject.set(x, "xStep", value.asInstanceOf[js.Any])
    
    inline def setXStepUndefined: Self = StObject.set(x, "xStep", js.undefined)
    
    inline def setYStep(value: Double): Self = StObject.set(x, "yStep", value.asInstanceOf[js.Any])
    
    inline def setYStepUndefined: Self = StObject.set(x, "yStep", js.undefined)
  }
}
