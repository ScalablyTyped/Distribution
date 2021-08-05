package typings.matchSorter

import typings.matchSorter.mod.KeyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key[T] extends StObject {
    
    var key: KeyOptions[T]
  }
  object Key {
    
    inline def apply[T](key: KeyOptions[T]): Key[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[T]]
    }
    
    extension [Self <: Key[?], T](x: Self & Key[T]) {
      
      inline def setKey(value: KeyOptions[T]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyFunction1(value: T => String | js.Array[String]): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    }
  }
  
  trait MaxRanking extends StObject {
    
    var maxRanking: Double
  }
  object MaxRanking {
    
    inline def apply(maxRanking: Double): MaxRanking = {
      val __obj = js.Dynamic.literal(maxRanking = maxRanking.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxRanking]
    }
    
    extension [Self <: MaxRanking](x: Self) {
      
      inline def setMaxRanking(value: Double): Self = StObject.set(x, "maxRanking", value.asInstanceOf[js.Any])
    }
  }
  
  trait MinRanking extends StObject {
    
    var minRanking: Double
  }
  object MinRanking {
    
    inline def apply(minRanking: Double): MinRanking = {
      val __obj = js.Dynamic.literal(minRanking = minRanking.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinRanking]
    }
    
    extension [Self <: MinRanking](x: Self) {
      
      inline def setMinRanking(value: Double): Self = StObject.set(x, "minRanking", value.asInstanceOf[js.Any])
    }
  }
  
  trait Threshold extends StObject {
    
    var threshold: Double
  }
  object Threshold {
    
    inline def apply(threshold: Double): Threshold = {
      val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[Threshold]
    }
    
    extension [Self <: Threshold](x: Self) {
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
}
