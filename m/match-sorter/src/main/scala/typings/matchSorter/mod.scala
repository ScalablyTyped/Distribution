package typings.matchSorter

import typings.matchSorter.anon.Key
import typings.matchSorter.anon.MaxRanking
import typings.matchSorter.anon.MinRanking
import typings.matchSorter.anon.Threshold
import typings.matchSorter.matchSorterNumbers.`0`
import typings.matchSorter.matchSorterNumbers.`1`
import typings.matchSorter.matchSorterNumbers.`2`
import typings.matchSorter.matchSorterNumbers.`3`
import typings.matchSorter.matchSorterNumbers.`4`
import typings.matchSorter.matchSorterNumbers.`5`
import typings.matchSorter.matchSorterNumbers.`6`
import typings.matchSorter.matchSorterNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object matchSorter {
    
    /**
      * Takes an array of items and a value and returns a new array with the items that match the given value
      * @param items - the items to sort
      * @param value - the value to use for ranking
      * @param options - Some options to configure the sorter
      * @return the new sorted array
      */
    inline def apply[T](items: js.Array[T], value: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def apply[T](items: js.Array[T], value: String, options: Options[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    @JSImport("match-sorter", "matchSorter")
    @js.native
    val ^ : js.Any = js.native
    
    object rankings {
      
      @JSImport("match-sorter", "matchSorter.rankings.ACRONYM")
      @js.native
      val ACRONYM: `2` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.CASE_SENSITIVE_EQUAL")
      @js.native
      val CASE_SENSITIVE_EQUAL: `7` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.CONTAINS")
      @js.native
      val CONTAINS: `3` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.EQUAL")
      @js.native
      val EQUAL: `6` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.MATCHES")
      @js.native
      val MATCHES: `1` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.NO_MATCH")
      @js.native
      val NO_MATCH: `0` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.STARTS_WITH")
      @js.native
      val STARTS_WITH: `5` = js.native
      
      @JSImport("match-sorter", "matchSorter.rankings.WORD_STARTS_WITH")
      @js.native
      val WORD_STARTS_WITH: `4` = js.native
    }
  }
  
  type ExtendedKeyOptions[T] = Key[T] & (MinRanking | MaxRanking | Threshold)
  
  type KeyOptions[T] = String | (js.Function1[/* item */ T, String | js.Array[String]])
  
  trait Options[T] extends StObject {
    
    var keepDiacritics: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.UndefOr[js.Array[KeyOptions[T] | ExtendedKeyOptions[T]]] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setKeepDiacritics(value: Boolean): Self = StObject.set(x, "keepDiacritics", value.asInstanceOf[js.Any])
      
      inline def setKeepDiacriticsUndefined: Self = StObject.set(x, "keepDiacritics", js.undefined)
      
      inline def setKeys(value: js.Array[KeyOptions[T] | ExtendedKeyOptions[T]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: (KeyOptions[T] | ExtendedKeyOptions[T])*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
