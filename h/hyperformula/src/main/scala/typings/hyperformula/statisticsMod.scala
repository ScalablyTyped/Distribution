package typings.hyperformula

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticsMod {
  
  @JSImport("hyperformula/typings/statistics", "EmptyStatistics")
  @js.native
  open class EmptyStatistics ()
    extends typings.hyperformula.emptyStatisticsMod.EmptyStatistics
  
  @JSImport("hyperformula/typings/statistics", "StatType")
  @js.native
  object StatType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.hyperformula.statTypeMod.StatType & String] = js.native
    
    /* "ADJUSTING_ADDRESS_MAPPING" */ val ADJUSTING_ADDRESS_MAPPING: typings.hyperformula.statTypeMod.StatType.ADJUSTING_ADDRESS_MAPPING & String = js.native
    
    /* "ADJUSTING_ARRAY_MAPPING" */ val ADJUSTING_ARRAY_MAPPING: typings.hyperformula.statTypeMod.StatType.ADJUSTING_ARRAY_MAPPING & String = js.native
    
    /* "ADJUSTING_GRAPH" */ val ADJUSTING_GRAPH: typings.hyperformula.statTypeMod.StatType.ADJUSTING_GRAPH & String = js.native
    
    /* "ADJUSTING_RANGES" */ val ADJUSTING_RANGES: typings.hyperformula.statTypeMod.StatType.ADJUSTING_RANGES & String = js.native
    
    /* "BUILD_COLUMN_INDEX" */ val BUILD_COLUMN_INDEX: typings.hyperformula.statTypeMod.StatType.BUILD_COLUMN_INDEX & String = js.native
    
    /* "BUILD_ENGINE_TOTAL" */ val BUILD_ENGINE_TOTAL: typings.hyperformula.statTypeMod.StatType.BUILD_ENGINE_TOTAL & String = js.native
    
    /* "COLLECT_DEPENDENCIES" */ val COLLECT_DEPENDENCIES: typings.hyperformula.statTypeMod.StatType.COLLECT_DEPENDENCIES & String = js.native
    
    /* "CRITERION_FUNCTION_FULL_CACHE_USED" */ val CRITERION_FUNCTION_FULL_CACHE_USED: typings.hyperformula.statTypeMod.StatType.CRITERION_FUNCTION_FULL_CACHE_USED & String = js.native
    
    /* "CRITERION_FUNCTION_PARTIAL_CACHE_USED" */ val CRITERION_FUNCTION_PARTIAL_CACHE_USED: typings.hyperformula.statTypeMod.StatType.CRITERION_FUNCTION_PARTIAL_CACHE_USED & String = js.native
    
    /* "EVALUATION" */ val EVALUATION: typings.hyperformula.statTypeMod.StatType.EVALUATION & String = js.native
    
    /* "GRAPH_BUILD" */ val GRAPH_BUILD: typings.hyperformula.statTypeMod.StatType.GRAPH_BUILD & String = js.native
    
    /* "PARSER" */ val PARSER: typings.hyperformula.statTypeMod.StatType.PARSER & String = js.native
    
    /* "PROCESS_DEPENDENCIES" */ val PROCESS_DEPENDENCIES: typings.hyperformula.statTypeMod.StatType.PROCESS_DEPENDENCIES & String = js.native
    
    /* "TOP_SORT" */ val TOP_SORT: typings.hyperformula.statTypeMod.StatType.TOP_SORT & String = js.native
    
    /* "TRANSFORM_ASTS" */ val TRANSFORM_ASTS: typings.hyperformula.statTypeMod.StatType.TRANSFORM_ASTS & String = js.native
    
    /* "TRANSFORM_ASTS_POSTPONED" */ val TRANSFORM_ASTS_POSTPONED: typings.hyperformula.statTypeMod.StatType.TRANSFORM_ASTS_POSTPONED & String = js.native
    
    /* "VLOOKUP" */ val VLOOKUP: typings.hyperformula.statTypeMod.StatType.VLOOKUP & String = js.native
  }
  
  @JSImport("hyperformula/typings/statistics", "Statistics")
  @js.native
  open class Statistics ()
    extends typings.hyperformula.statisticsStatisticsMod.Statistics
}
