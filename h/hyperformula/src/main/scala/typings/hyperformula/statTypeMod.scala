package typings.hyperformula

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statTypeMod {
  
  @js.native
  sealed trait StatType extends StObject
  @JSImport("hyperformula/typings/statistics/StatType", "StatType")
  @js.native
  object StatType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatType & String] = js.native
    
    @js.native
    sealed trait ADJUSTING_ADDRESS_MAPPING
      extends StObject
         with StatType
    /* "ADJUSTING_ADDRESS_MAPPING" */ val ADJUSTING_ADDRESS_MAPPING: typings.hyperformula.statTypeMod.StatType.ADJUSTING_ADDRESS_MAPPING & String = js.native
    
    @js.native
    sealed trait ADJUSTING_ARRAY_MAPPING
      extends StObject
         with StatType
    /* "ADJUSTING_ARRAY_MAPPING" */ val ADJUSTING_ARRAY_MAPPING: typings.hyperformula.statTypeMod.StatType.ADJUSTING_ARRAY_MAPPING & String = js.native
    
    @js.native
    sealed trait ADJUSTING_GRAPH
      extends StObject
         with StatType
    /* "ADJUSTING_GRAPH" */ val ADJUSTING_GRAPH: typings.hyperformula.statTypeMod.StatType.ADJUSTING_GRAPH & String = js.native
    
    @js.native
    sealed trait ADJUSTING_RANGES
      extends StObject
         with StatType
    /* "ADJUSTING_RANGES" */ val ADJUSTING_RANGES: typings.hyperformula.statTypeMod.StatType.ADJUSTING_RANGES & String = js.native
    
    @js.native
    sealed trait BUILD_COLUMN_INDEX
      extends StObject
         with StatType
    /* "BUILD_COLUMN_INDEX" */ val BUILD_COLUMN_INDEX: typings.hyperformula.statTypeMod.StatType.BUILD_COLUMN_INDEX & String = js.native
    
    @js.native
    sealed trait BUILD_ENGINE_TOTAL
      extends StObject
         with StatType
    /* "BUILD_ENGINE_TOTAL" */ val BUILD_ENGINE_TOTAL: typings.hyperformula.statTypeMod.StatType.BUILD_ENGINE_TOTAL & String = js.native
    
    @js.native
    sealed trait COLLECT_DEPENDENCIES
      extends StObject
         with StatType
    /* "COLLECT_DEPENDENCIES" */ val COLLECT_DEPENDENCIES: typings.hyperformula.statTypeMod.StatType.COLLECT_DEPENDENCIES & String = js.native
    
    @js.native
    sealed trait CRITERION_FUNCTION_FULL_CACHE_USED
      extends StObject
         with StatType
    /* "CRITERION_FUNCTION_FULL_CACHE_USED" */ val CRITERION_FUNCTION_FULL_CACHE_USED: typings.hyperformula.statTypeMod.StatType.CRITERION_FUNCTION_FULL_CACHE_USED & String = js.native
    
    @js.native
    sealed trait CRITERION_FUNCTION_PARTIAL_CACHE_USED
      extends StObject
         with StatType
    /* "CRITERION_FUNCTION_PARTIAL_CACHE_USED" */ val CRITERION_FUNCTION_PARTIAL_CACHE_USED: typings.hyperformula.statTypeMod.StatType.CRITERION_FUNCTION_PARTIAL_CACHE_USED & String = js.native
    
    @js.native
    sealed trait EVALUATION
      extends StObject
         with StatType
    /* "EVALUATION" */ val EVALUATION: typings.hyperformula.statTypeMod.StatType.EVALUATION & String = js.native
    
    @js.native
    sealed trait GRAPH_BUILD
      extends StObject
         with StatType
    /* "GRAPH_BUILD" */ val GRAPH_BUILD: typings.hyperformula.statTypeMod.StatType.GRAPH_BUILD & String = js.native
    
    @js.native
    sealed trait PARSER
      extends StObject
         with StatType
    /* "PARSER" */ val PARSER: typings.hyperformula.statTypeMod.StatType.PARSER & String = js.native
    
    @js.native
    sealed trait PROCESS_DEPENDENCIES
      extends StObject
         with StatType
    /* "PROCESS_DEPENDENCIES" */ val PROCESS_DEPENDENCIES: typings.hyperformula.statTypeMod.StatType.PROCESS_DEPENDENCIES & String = js.native
    
    @js.native
    sealed trait TOP_SORT
      extends StObject
         with StatType
    /* "TOP_SORT" */ val TOP_SORT: typings.hyperformula.statTypeMod.StatType.TOP_SORT & String = js.native
    
    @js.native
    sealed trait TRANSFORM_ASTS
      extends StObject
         with StatType
    /* "TRANSFORM_ASTS" */ val TRANSFORM_ASTS: typings.hyperformula.statTypeMod.StatType.TRANSFORM_ASTS & String = js.native
    
    @js.native
    sealed trait TRANSFORM_ASTS_POSTPONED
      extends StObject
         with StatType
    /* "TRANSFORM_ASTS_POSTPONED" */ val TRANSFORM_ASTS_POSTPONED: typings.hyperformula.statTypeMod.StatType.TRANSFORM_ASTS_POSTPONED & String = js.native
    
    @js.native
    sealed trait VLOOKUP
      extends StObject
         with StatType
    /* "VLOOKUP" */ val VLOOKUP: typings.hyperformula.statTypeMod.StatType.VLOOKUP & String = js.native
  }
}
