package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinderPattern extends StObject {
  
  val Count: Double
  
  val EstimatedModuleSize: Double
  
  val X: Double
  
  val Y: Double
  
  def aboutEquals(moduleSize: Double, i: Double, j: Double): Boolean
  
  /* private */ var count: Double
  
  /* private */ var estimatedModuleSize: Double
  
  def incrementCount(): Unit
  
  /* private */ var x: Double
  
  /* private */ var y: Double
}
object FinderPattern {
  
  inline def apply(
    Count: Double,
    EstimatedModuleSize: Double,
    X: Double,
    Y: Double,
    aboutEquals: (Double, Double, Double) => Boolean,
    count: Double,
    estimatedModuleSize: Double,
    incrementCount: () => Unit,
    x: Double,
    y: Double
  ): FinderPattern = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], EstimatedModuleSize = EstimatedModuleSize.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], aboutEquals = js.Any.fromFunction3(aboutEquals), count = count.asInstanceOf[js.Any], estimatedModuleSize = estimatedModuleSize.asInstanceOf[js.Any], incrementCount = js.Any.fromFunction0(incrementCount), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinderPattern]
  }
  
  extension [Self <: FinderPattern](x: Self) {
    
    inline def setAboutEquals(value: (Double, Double, Double) => Boolean): Self = StObject.set(x, "aboutEquals", js.Any.fromFunction3(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setEstimatedModuleSize(value: Double): Self = StObject.set(x, "EstimatedModuleSize", value.asInstanceOf[js.Any])
    
    inline def setIncrementCount(value: () => Unit): Self = StObject.set(x, "incrementCount", js.Any.fromFunction0(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
