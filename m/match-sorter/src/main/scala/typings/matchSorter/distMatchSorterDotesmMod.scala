package typings.matchSorter

import typings.matchSorter.matchSorterInts.`0`
import typings.matchSorter.matchSorterInts.`1`
import typings.matchSorter.matchSorterInts.`2`
import typings.matchSorter.matchSorterInts.`3`
import typings.matchSorter.matchSorterInts.`4`
import typings.matchSorter.matchSorterInts.`5`
import typings.matchSorter.matchSorterInts.`6`
import typings.matchSorter.matchSorterInts.`7`
import typings.matchSorter.mod.BaseSorter
import typings.matchSorter.mod.MatchSorterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatchSorterDotesmMod {
  
  @JSImport("match-sorter/dist/match-sorter.esm", "defaultBaseSortFn")
  @js.native
  val defaultBaseSortFn: BaseSorter[Any] = js.native
  
  object matchSorter {
    
    /**
      * Takes an array of items and a value and returns a new array with the items that match the given value
      * @param {Array} items - the items to sort
      * @param {String} value - the value to use for ranking
      * @param {Object} options - Some options to configure the sorter
      * @return {Array} - the new sorted array
      */
    inline def apply[ItemType](items: js.Array[ItemType], value: String): js.Array[ItemType] = (^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[ItemType]]
    inline def apply[ItemType](items: js.Array[ItemType], value: String, options: MatchSorterOptions[ItemType]): js.Array[ItemType] = (^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ItemType]]
    
    @JSImport("match-sorter/dist/match-sorter.esm", "matchSorter")
    @js.native
    val ^ : js.Any = js.native
    
    object rankings {
      
      @JSImport("match-sorter/dist/match-sorter.esm", "matchSorter.rankings.ACRONYM")
      @js.native
      val ACRONYM: `2` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.esm", "matchSorter.rankings.CASE_SENSITIVE_EQUAL")
      @js.native
      val CASE_SENSITIVE_EQUAL: `7` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.esm", "matchSorter.rankings.CONTAINS")
      @js.native
      val CONTAINS: `3` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.esm", "matchSorter.rankings.EQUAL")
      @js.native
      val EQUAL: `6` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.esm", "matchSorter.rankings.MATCHES")
      @js.native
      val MATCHES: `1` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.esm", "matchSorter.rankings.NO_MATCH")
      @js.native
      val NO_MATCH: `0` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.esm", "matchSorter.rankings.STARTS_WITH")
      @js.native
      val STARTS_WITH: `5` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.esm", "matchSorter.rankings.WORD_STARTS_WITH")
      @js.native
      val WORD_STARTS_WITH: `4` = js.native
    }
  }
  
  object rankings {
    
    @JSImport("match-sorter/dist/match-sorter.esm", "rankings.ACRONYM")
    @js.native
    val ACRONYM: `2` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.esm", "rankings.CASE_SENSITIVE_EQUAL")
    @js.native
    val CASE_SENSITIVE_EQUAL: `7` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.esm", "rankings.CONTAINS")
    @js.native
    val CONTAINS: `3` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.esm", "rankings.EQUAL")
    @js.native
    val EQUAL: `6` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.esm", "rankings.MATCHES")
    @js.native
    val MATCHES: `1` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.esm", "rankings.NO_MATCH")
    @js.native
    val NO_MATCH: `0` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.esm", "rankings.STARTS_WITH")
    @js.native
    val STARTS_WITH: `5` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.esm", "rankings.WORD_STARTS_WITH")
    @js.native
    val WORD_STARTS_WITH: `4` = js.native
  }
}
