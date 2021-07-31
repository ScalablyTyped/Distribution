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
    
    @scala.inline
    def apply(): Closest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Closest]
    }
    
    @scala.inline
    implicit class ClosestMutableBuilder[Self <: Closest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosest(value: Boolean): Self = StObject.set(x, "closest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosestUndefined: Self = StObject.set(x, "closest", js.undefined)
      
      @scala.inline
      def setHeuristic(value: (/* pos0 */ X, /* pos1 */ X) => Double): Self = StObject.set(x, "heuristic", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeuristicUndefined: Self = StObject.set(x, "heuristic", js.undefined)
    }
  }
  
  trait Diagonal extends StObject {
    
    var diagonal: js.UndefOr[Boolean] = js.undefined
  }
  object Diagonal {
    
    @scala.inline
    def apply(): Diagonal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Diagonal]
    }
    
    @scala.inline
    implicit class DiagonalMutableBuilder[Self <: Diagonal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiagonal(value: Boolean): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagonalUndefined: Self = StObject.set(x, "diagonal", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
