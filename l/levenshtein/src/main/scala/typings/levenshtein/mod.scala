package typings.levenshtein

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("levenshtein", JSImport.Namespace)
  @js.native
  class ^ protected () extends Levenshtein {
    /**
      * Levenshtein string difference
      * @param m First string
      * @param n Second string
      */
    def this(m: String, n: String) = this()
  }
  
  @js.native
  trait Levenshtein extends StObject {
    
    /**
      * Distance between strings
      */
    var distance: Double = js.native
    
    /**
      * Return the Levenshtein table.
      */
    def getMatrix(): js.Array[js.Array[Double]] = js.native
    
    /**
      * Pretty print Levenshtein table.
      */
    def inspect(): String = js.native
  }
  object Levenshtein {
    
    @scala.inline
    def apply(distance: Double, getMatrix: () => js.Array[js.Array[Double]], inspect: () => String): Levenshtein = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], getMatrix = js.Any.fromFunction0(getMatrix), inspect = js.Any.fromFunction0(inspect))
      __obj.asInstanceOf[Levenshtein]
    }
    
    @scala.inline
    implicit class LevenshteinMutableBuilder[Self <: Levenshtein] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetMatrix(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "getMatrix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInspect(value: () => String): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
    }
  }
}
