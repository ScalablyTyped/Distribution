package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashMath extends StObject {
  
  /** Method; performs a matrix concatenation and returns the result. */
  def concatMatrix(mat1: FlashMatrix, mat2: FlashMatrix): FlashMatrix
  
  /** A Matrix object that is the inverse of the original matrix. */
  def invertMatrix(mat: FlashMatrix): FlashMatrix
  
  /** A floating-point value that represents the distance between the points. */
  def pointDistance(pt1: FlashPoint, pt2: FlashPoint): Double
}
object FlashMath {
  
  inline def apply(
    concatMatrix: (FlashMatrix, FlashMatrix) => FlashMatrix,
    invertMatrix: FlashMatrix => FlashMatrix,
    pointDistance: (FlashPoint, FlashPoint) => Double
  ): FlashMath = {
    val __obj = js.Dynamic.literal(concatMatrix = js.Any.fromFunction2(concatMatrix), invertMatrix = js.Any.fromFunction1(invertMatrix), pointDistance = js.Any.fromFunction2(pointDistance))
    __obj.asInstanceOf[FlashMath]
  }
  
  extension [Self <: FlashMath](x: Self) {
    
    inline def setConcatMatrix(value: (FlashMatrix, FlashMatrix) => FlashMatrix): Self = StObject.set(x, "concatMatrix", js.Any.fromFunction2(value))
    
    inline def setInvertMatrix(value: FlashMatrix => FlashMatrix): Self = StObject.set(x, "invertMatrix", js.Any.fromFunction1(value))
    
    inline def setPointDistance(value: (FlashPoint, FlashPoint) => Double): Self = StObject.set(x, "pointDistance", js.Any.fromFunction2(value))
  }
}
