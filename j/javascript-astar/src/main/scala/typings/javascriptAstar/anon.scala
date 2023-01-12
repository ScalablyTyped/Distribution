package typings.javascriptAstar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Closest extends StObject {
    
    var closest: js.UndefOr[Boolean] = js.undefined
    
    var heuristic: js.UndefOr[Heuristic] = js.undefined
  }
  object Closest {
    
    inline def apply(): Closest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Closest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Closest] (val x: Self) extends AnyVal {
      
      inline def setClosest(value: Boolean): Self = StObject.set(x, "closest", value.asInstanceOf[js.Any])
      
      inline def setClosestUndefined: Self = StObject.set(x, "closest", js.undefined)
      
      inline def setHeuristic(value: (/* pos0 */ X, /* pos1 */ X) => Double): Self = StObject.set(x, "heuristic", js.Any.fromFunction2(value))
      
      inline def setHeuristicUndefined: Self = StObject.set(x, "heuristic", js.undefined)
    }
  }
  
  trait Diagonal extends StObject {
    
    var diagonal: js.UndefOr[Boolean] = js.undefined
  }
  object Diagonal {
    
    inline def apply(): Diagonal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Diagonal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Diagonal] (val x: Self) extends AnyVal {
      
      inline def setDiagonal(value: Boolean): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
      
      inline def setDiagonalUndefined: Self = StObject.set(x, "diagonal", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
