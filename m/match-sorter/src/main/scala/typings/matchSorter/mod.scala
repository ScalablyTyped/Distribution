package typings.matchSorter

import typings.matchSorter.matchSorterInts.`0`
import typings.matchSorter.matchSorterInts.`1`
import typings.matchSorter.matchSorterInts.`2`
import typings.matchSorter.matchSorterInts.`3`
import typings.matchSorter.matchSorterInts.`4`
import typings.matchSorter.matchSorterInts.`5`
import typings.matchSorter.matchSorterInts.`6`
import typings.matchSorter.matchSorterInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("match-sorter", "defaultBaseSortFn")
  @js.native
  val defaultBaseSortFn: BaseSorter[Any] = js.native
  
  object rankings {
    
    @JSImport("match-sorter", "rankings.ACRONYM")
    @js.native
    val ACRONYM: `2` = js.native
    
    @JSImport("match-sorter", "rankings.CASE_SENSITIVE_EQUAL")
    @js.native
    val CASE_SENSITIVE_EQUAL: `7` = js.native
    
    @JSImport("match-sorter", "rankings.CONTAINS")
    @js.native
    val CONTAINS: `3` = js.native
    
    @JSImport("match-sorter", "rankings.EQUAL")
    @js.native
    val EQUAL: `6` = js.native
    
    @JSImport("match-sorter", "rankings.MATCHES")
    @js.native
    val MATCHES: `1` = js.native
    
    @JSImport("match-sorter", "rankings.NO_MATCH")
    @js.native
    val NO_MATCH: `0` = js.native
    
    @JSImport("match-sorter", "rankings.STARTS_WITH")
    @js.native
    val STARTS_WITH: `5` = js.native
    
    @JSImport("match-sorter", "rankings.WORD_STARTS_WITH")
    @js.native
    val WORD_STARTS_WITH: `4` = js.native
  }
  
  type BaseSorter[ItemType] = js.Function2[/* a */ RankedItem[ItemType], /* b */ RankedItem[ItemType], Double]
  
  trait IndexedItem[ItemType] extends StObject {
    
    var index: Double
    
    var item: ItemType
  }
  object IndexedItem {
    
    inline def apply[ItemType](index: Double, item: ItemType): IndexedItem[ItemType] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexedItem[ItemType]]
    }
    
    extension [Self <: IndexedItem[?], ItemType](x: Self & IndexedItem[ItemType]) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: ItemType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyAttributes extends StObject {
    
    var maxRanking: Ranking
    
    var minRanking: Ranking
    
    var threshold: js.UndefOr[Ranking] = js.undefined
  }
  object KeyAttributes {
    
    inline def apply(maxRanking: Ranking, minRanking: Ranking): KeyAttributes = {
      val __obj = js.Dynamic.literal(maxRanking = maxRanking.asInstanceOf[js.Any], minRanking = minRanking.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyAttributes]
    }
    
    extension [Self <: KeyAttributes](x: Self) {
      
      inline def setMaxRanking(value: Ranking): Self = StObject.set(x, "maxRanking", value.asInstanceOf[js.Any])
      
      inline def setMinRanking(value: Ranking): Self = StObject.set(x, "minRanking", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Ranking): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  trait KeyAttributesOptions[ItemType] extends StObject {
    
    var key: js.UndefOr[String | ValueGetterKey[ItemType]] = js.undefined
    
    var maxRanking: js.UndefOr[Ranking] = js.undefined
    
    var minRanking: js.UndefOr[Ranking] = js.undefined
    
    var threshold: js.UndefOr[Ranking] = js.undefined
  }
  object KeyAttributesOptions {
    
    inline def apply[ItemType](): KeyAttributesOptions[ItemType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyAttributesOptions[ItemType]]
    }
    
    extension [Self <: KeyAttributesOptions[?], ItemType](x: Self & KeyAttributesOptions[ItemType]) {
      
      inline def setKey(value: String | ValueGetterKey[ItemType]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyFunction1(value: ItemType => String | js.Array[String]): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxRanking(value: Ranking): Self = StObject.set(x, "maxRanking", value.asInstanceOf[js.Any])
      
      inline def setMaxRankingUndefined: Self = StObject.set(x, "maxRanking", js.undefined)
      
      inline def setMinRanking(value: Ranking): Self = StObject.set(x, "minRanking", value.asInstanceOf[js.Any])
      
      inline def setMinRankingUndefined: Self = StObject.set(x, "minRanking", js.undefined)
      
      inline def setThreshold(value: Ranking): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  type KeyOption[ItemType] = KeyAttributesOptions[ItemType] | ValueGetterKey[ItemType] | String
  
  trait MatchSorterOptions[ItemType] extends StObject {
    
    var baseSort: js.UndefOr[BaseSorter[ItemType]] = js.undefined
    
    var keepDiacritics: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.UndefOr[js.Array[KeyOption[ItemType]]] = js.undefined
    
    var sorter: js.UndefOr[Sorter[ItemType]] = js.undefined
    
    var threshold: js.UndefOr[Ranking] = js.undefined
  }
  object MatchSorterOptions {
    
    inline def apply[ItemType](): MatchSorterOptions[ItemType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchSorterOptions[ItemType]]
    }
    
    extension [Self <: MatchSorterOptions[?], ItemType](x: Self & MatchSorterOptions[ItemType]) {
      
      inline def setBaseSort(value: (/* a */ RankedItem[ItemType], /* b */ RankedItem[ItemType]) => Double): Self = StObject.set(x, "baseSort", js.Any.fromFunction2(value))
      
      inline def setBaseSortUndefined: Self = StObject.set(x, "baseSort", js.undefined)
      
      inline def setKeepDiacritics(value: Boolean): Self = StObject.set(x, "keepDiacritics", value.asInstanceOf[js.Any])
      
      inline def setKeepDiacriticsUndefined: Self = StObject.set(x, "keepDiacritics", js.undefined)
      
      inline def setKeys(value: js.Array[KeyOption[ItemType]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: KeyOption[ItemType]*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setSorter(value: /* matchItems */ js.Array[RankedItem[ItemType]] => js.Array[RankedItem[ItemType]]): Self = StObject.set(x, "sorter", js.Any.fromFunction1(value))
      
      inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      inline def setThreshold(value: Ranking): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  trait RankedItem[ItemType]
    extends StObject
       with RankingInfo
       with IndexedItem[ItemType]
  object RankedItem {
    
    inline def apply[ItemType](index: Double, item: ItemType, keyIndex: Double, rank: Ranking, rankedValue: String): RankedItem[ItemType] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], keyIndex = keyIndex.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], rankedValue = rankedValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RankedItem[ItemType]]
    }
  }
  
  /* Inlined { readonly CASE_SENSITIVE_EQUAL :7,  readonly EQUAL :6,  readonly STARTS_WITH :5,  readonly WORD_STARTS_WITH :4,  readonly CONTAINS :3,  readonly ACRONYM :2,  readonly MATCHES :1,  readonly NO_MATCH :0}[keyof { readonly CASE_SENSITIVE_EQUAL :7,  readonly EQUAL :6,  readonly STARTS_WITH :5,  readonly WORD_STARTS_WITH :4,  readonly CONTAINS :3,  readonly ACRONYM :2,  readonly MATCHES :1,  readonly NO_MATCH :0}] */
  /* Rewritten from type alias, can be one of: 
    - typings.matchSorter.matchSorterInts.`3`
    - typings.matchSorter.matchSorterInts.`2`
    - typings.matchSorter.matchSorterInts.`4`
    - typings.matchSorter.matchSorterInts.`0`
    - typings.matchSorter.matchSorterInts.`7`
    - typings.matchSorter.matchSorterInts.`5`
    - typings.matchSorter.matchSorterInts.`6`
    - typings.matchSorter.matchSorterInts.`1`
  */
  trait Ranking extends StObject
  object Ranking {
    
    inline def `0`: typings.matchSorter.matchSorterInts.`0` = 0.asInstanceOf[typings.matchSorter.matchSorterInts.`0`]
    
    inline def `1`: typings.matchSorter.matchSorterInts.`1` = 1.asInstanceOf[typings.matchSorter.matchSorterInts.`1`]
    
    inline def `2`: typings.matchSorter.matchSorterInts.`2` = 2.asInstanceOf[typings.matchSorter.matchSorterInts.`2`]
    
    inline def `3`: typings.matchSorter.matchSorterInts.`3` = 3.asInstanceOf[typings.matchSorter.matchSorterInts.`3`]
    
    inline def `4`: typings.matchSorter.matchSorterInts.`4` = 4.asInstanceOf[typings.matchSorter.matchSorterInts.`4`]
    
    inline def `5`: typings.matchSorter.matchSorterInts.`5` = 5.asInstanceOf[typings.matchSorter.matchSorterInts.`5`]
    
    inline def `6`: typings.matchSorter.matchSorterInts.`6` = 6.asInstanceOf[typings.matchSorter.matchSorterInts.`6`]
    
    inline def `7`: typings.matchSorter.matchSorterInts.`7` = 7.asInstanceOf[typings.matchSorter.matchSorterInts.`7`]
  }
  
  trait RankingInfo extends StObject {
    
    var keyIndex: Double
    
    var keyThreshold: js.UndefOr[Ranking] = js.undefined
    
    var rank: Ranking
    
    var rankedValue: String
  }
  object RankingInfo {
    
    inline def apply(keyIndex: Double, rank: Ranking, rankedValue: String): RankingInfo = {
      val __obj = js.Dynamic.literal(keyIndex = keyIndex.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], rankedValue = rankedValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RankingInfo]
    }
    
    extension [Self <: RankingInfo](x: Self) {
      
      inline def setKeyIndex(value: Double): Self = StObject.set(x, "keyIndex", value.asInstanceOf[js.Any])
      
      inline def setKeyThreshold(value: Ranking): Self = StObject.set(x, "keyThreshold", value.asInstanceOf[js.Any])
      
      inline def setKeyThresholdUndefined: Self = StObject.set(x, "keyThreshold", js.undefined)
      
      inline def setRank(value: Ranking): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setRankedValue(value: String): Self = StObject.set(x, "rankedValue", value.asInstanceOf[js.Any])
    }
  }
  
  type Sorter[ItemType] = js.Function1[/* matchItems */ js.Array[RankedItem[ItemType]], js.Array[RankedItem[ItemType]]]
  
  type ValueGetterKey[ItemType] = js.Function1[/* item */ ItemType, String | js.Array[String]]
}
