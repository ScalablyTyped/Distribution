package typings.matchSorter

import typings.matchSorter.mod.KeyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Key[T] extends StObject {
    
    var key: KeyOptions[T] = js.native
  }
  object Key {
    
    @scala.inline
    def apply[T](key: KeyOptions[T]): Key[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[T]]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key[_], T] (val x: Self with Key[T]) extends AnyVal {
      
      @scala.inline
      def setKey(value: KeyOptions[T]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFunction1(value: T => String | js.Array[String]): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MaxRanking extends StObject {
    
    var maxRanking: Double = js.native
  }
  object MaxRanking {
    
    @scala.inline
    def apply(maxRanking: Double): MaxRanking = {
      val __obj = js.Dynamic.literal(maxRanking = maxRanking.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxRanking]
    }
    
    @scala.inline
    implicit class MaxRankingMutableBuilder[Self <: MaxRanking] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxRanking(value: Double): Self = StObject.set(x, "maxRanking", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MinRanking extends StObject {
    
    var minRanking: Double = js.native
  }
  object MinRanking {
    
    @scala.inline
    def apply(minRanking: Double): MinRanking = {
      val __obj = js.Dynamic.literal(minRanking = minRanking.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinRanking]
    }
    
    @scala.inline
    implicit class MinRankingMutableBuilder[Self <: MinRanking] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinRanking(value: Double): Self = StObject.set(x, "minRanking", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Threshold extends StObject {
    
    var threshold: Double = js.native
  }
  object Threshold {
    
    @scala.inline
    def apply(threshold: Double): Threshold = {
      val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[Threshold]
    }
    
    @scala.inline
    implicit class ThresholdMutableBuilder[Self <: Threshold] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
}
