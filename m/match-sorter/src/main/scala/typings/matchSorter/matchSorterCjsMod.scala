package typings.matchSorter

import typings.matchSorter.matchSorterNumbers.`0`
import typings.matchSorter.matchSorterNumbers.`1`
import typings.matchSorter.matchSorterNumbers.`2`
import typings.matchSorter.matchSorterNumbers.`3`
import typings.matchSorter.matchSorterNumbers.`4`
import typings.matchSorter.matchSorterNumbers.`5`
import typings.matchSorter.matchSorterNumbers.`6`
import typings.matchSorter.matchSorterNumbers.`7`
import typings.matchSorter.mod.BaseSorter
import typings.matchSorter.mod.MatchSorterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchSorterCjsMod {
  
  @JSImport("match-sorter/dist/match-sorter.cjs", "defaultBaseSortFn")
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
    
    @JSImport("match-sorter/dist/match-sorter.cjs", "matchSorter")
    @js.native
    val ^ : js.Any = js.native
    
    object rankings {
      
      @JSImport("match-sorter/dist/match-sorter.cjs", "matchSorter.rankings.ACRONYM")
      @js.native
      val ACRONYM: `2` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.cjs", "matchSorter.rankings.CASE_SENSITIVE_EQUAL")
      @js.native
      val CASE_SENSITIVE_EQUAL: `7` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.cjs", "matchSorter.rankings.CONTAINS")
      @js.native
      val CONTAINS: `3` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.cjs", "matchSorter.rankings.EQUAL")
      @js.native
      val EQUAL: `6` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.cjs", "matchSorter.rankings.MATCHES")
      @js.native
      val MATCHES: `1` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.cjs", "matchSorter.rankings.NO_MATCH")
      @js.native
      val NO_MATCH: `0` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.cjs", "matchSorter.rankings.STARTS_WITH")
      @js.native
      val STARTS_WITH: `5` = js.native
      
      @JSImport("match-sorter/dist/match-sorter.cjs", "matchSorter.rankings.WORD_STARTS_WITH")
      @js.native
      val WORD_STARTS_WITH: `4` = js.native
    }
  }
  
  object rankings {
    
    @JSImport("match-sorter/dist/match-sorter.cjs", "rankings.ACRONYM")
    @js.native
    val ACRONYM: `2` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.cjs", "rankings.CASE_SENSITIVE_EQUAL")
    @js.native
    val CASE_SENSITIVE_EQUAL: `7` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.cjs", "rankings.CONTAINS")
    @js.native
    val CONTAINS: `3` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.cjs", "rankings.EQUAL")
    @js.native
    val EQUAL: `6` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.cjs", "rankings.MATCHES")
    @js.native
    val MATCHES: `1` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.cjs", "rankings.NO_MATCH")
    @js.native
    val NO_MATCH: `0` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.cjs", "rankings.STARTS_WITH")
    @js.native
    val STARTS_WITH: `5` = js.native
    
    @JSImport("match-sorter/dist/match-sorter.cjs", "rankings.WORD_STARTS_WITH")
    @js.native
    val WORD_STARTS_WITH: `4` = js.native
  }
}
