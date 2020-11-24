package typings.matchSorter.mod

import typings.matchSorter.matchSorterNumbers.`0`
import typings.matchSorter.matchSorterNumbers.`1`
import typings.matchSorter.matchSorterNumbers.`2`
import typings.matchSorter.matchSorterNumbers.`3`
import typings.matchSorter.matchSorterNumbers.`4`
import typings.matchSorter.matchSorterNumbers.`5`
import typings.matchSorter.matchSorterNumbers.`6`
import typings.matchSorter.matchSorterNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("match-sorter", "matchSorter")
@js.native
object matchSorter extends js.Object {
  
  /**
    * Takes an array of items and a value and returns a new array with the items that match the given value
    * @param items - the items to sort
    * @param value - the value to use for ranking
    * @param options - Some options to configure the sorter
    * @return the new sorted array
    */
  def apply[T](items: js.Array[T], value: String): js.Array[T] = js.native
  def apply[T](items: js.Array[T], value: String, options: Options[T]): js.Array[T] = js.native
  
  @js.native
  object rankings extends js.Object {
    
    val ACRONYM: `2` = js.native
    
    val CASE_SENSITIVE_EQUAL: `7` = js.native
    
    val CONTAINS: `3` = js.native
    
    val EQUAL: `6` = js.native
    
    val MATCHES: `1` = js.native
    
    val NO_MATCH: `0` = js.native
    
    val STARTS_WITH: `5` = js.native
    
    val WORD_STARTS_WITH: `4` = js.native
  }
}
