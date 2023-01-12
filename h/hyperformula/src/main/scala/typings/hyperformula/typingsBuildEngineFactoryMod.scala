package typings.hyperformula

import typings.hyperformula.anon.PartialConfigParams
import typings.hyperformula.typingsCellContentParserMod.CellContentParser
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsCrudOperationsMod.CrudOperations
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsEvaluatorMod.Evaluator
import typings.hyperformula.typingsExporterMod.Exporter
import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typings.hyperformula.typingsLazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import typings.hyperformula.typingsNamedExpressionsMod.NamedExpressions
import typings.hyperformula.typingsParserMod.ParserWithCaching
import typings.hyperformula.typingsParserMod.Unparser
import typings.hyperformula.typingsSerializationMod.Serialization
import typings.hyperformula.typingsSerializationMod.SerializedNamedExpression
import typings.hyperformula.typingsSheetMod.Sheet
import typings.hyperformula.typingsSheetMod.Sheets
import typings.hyperformula.typingsStatisticsMod.Statistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsBuildEngineFactoryMod {
  
  @JSImport("hyperformula/typings/BuildEngineFactory", "BuildEngineFactory")
  @js.native
  open class BuildEngineFactory () extends StObject
  /* static members */
  object BuildEngineFactory {
    
    @JSImport("hyperformula/typings/BuildEngineFactory", "BuildEngineFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildEmpty(): EngineState = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")().asInstanceOf[EngineState]
    inline def buildEmpty(configInput: Unit, namedExpressions: js.Array[SerializedNamedExpression]): EngineState = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")(configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[EngineState]
    inline def buildEmpty(configInput: PartialConfigParams): EngineState = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")(configInput.asInstanceOf[js.Any]).asInstanceOf[EngineState]
    inline def buildEmpty(configInput: PartialConfigParams, namedExpressions: js.Array[SerializedNamedExpression]): EngineState = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")(configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[EngineState]
    
    @JSImport("hyperformula/typings/BuildEngineFactory", "BuildEngineFactory.buildEngine")
    @js.native
    def buildEngine: Any = js.native
    inline def buildEngine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildEngine")(x.asInstanceOf[js.Any])
    
    inline def buildFromSheet(sheet: Sheet): EngineState = ^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheet")(sheet.asInstanceOf[js.Any]).asInstanceOf[EngineState]
    inline def buildFromSheet(sheet: Sheet, configInput: Unit, namedExpressions: js.Array[SerializedNamedExpression]): EngineState = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheet")(sheet.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[EngineState]
    inline def buildFromSheet(sheet: Sheet, configInput: PartialConfigParams): EngineState = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheet")(sheet.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any])).asInstanceOf[EngineState]
    inline def buildFromSheet(
      sheet: Sheet,
      configInput: PartialConfigParams,
      namedExpressions: js.Array[SerializedNamedExpression]
    ): EngineState = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheet")(sheet.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[EngineState]
    
    inline def buildFromSheets(sheets: Sheets): EngineState = ^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheets")(sheets.asInstanceOf[js.Any]).asInstanceOf[EngineState]
    inline def buildFromSheets(sheets: Sheets, configInput: Unit, namedExpressions: js.Array[SerializedNamedExpression]): EngineState = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheets")(sheets.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[EngineState]
    inline def buildFromSheets(sheets: Sheets, configInput: PartialConfigParams): EngineState = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheets")(sheets.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any])).asInstanceOf[EngineState]
    inline def buildFromSheets(
      sheets: Sheets,
      configInput: PartialConfigParams,
      namedExpressions: js.Array[SerializedNamedExpression]
    ): EngineState = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFromSheets")(sheets.asInstanceOf[js.Any], configInput.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any])).asInstanceOf[EngineState]
    
    inline def rebuildWithConfig(
      config: Config,
      sheets: Sheets,
      namedExpressions: js.Array[SerializedNamedExpression],
      stats: Statistics
    ): EngineState = (^.asInstanceOf[js.Dynamic].applyDynamic("rebuildWithConfig")(config.asInstanceOf[js.Any], sheets.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[EngineState]
  }
  
  trait EngineState extends StObject {
    
    var cellContentParser: CellContentParser
    
    var columnSearch: ColumnSearchStrategy
    
    var config: Config
    
    var crudOperations: CrudOperations
    
    var dependencyGraph: DependencyGraph
    
    var evaluator: Evaluator
    
    var exporter: Exporter
    
    var functionRegistry: FunctionRegistry
    
    var lazilyTransformingAstService: LazilyTransformingAstService
    
    var namedExpressions: NamedExpressions
    
    var parser: ParserWithCaching
    
    var serialization: Serialization
    
    var stats: Statistics
    
    var unparser: Unparser
  }
  object EngineState {
    
    inline def apply(
      cellContentParser: CellContentParser,
      columnSearch: ColumnSearchStrategy,
      config: Config,
      crudOperations: CrudOperations,
      dependencyGraph: DependencyGraph,
      evaluator: Evaluator,
      exporter: Exporter,
      functionRegistry: FunctionRegistry,
      lazilyTransformingAstService: LazilyTransformingAstService,
      namedExpressions: NamedExpressions,
      parser: ParserWithCaching,
      serialization: Serialization,
      stats: Statistics,
      unparser: Unparser
    ): EngineState = {
      val __obj = js.Dynamic.literal(cellContentParser = cellContentParser.asInstanceOf[js.Any], columnSearch = columnSearch.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], crudOperations = crudOperations.asInstanceOf[js.Any], dependencyGraph = dependencyGraph.asInstanceOf[js.Any], evaluator = evaluator.asInstanceOf[js.Any], exporter = exporter.asInstanceOf[js.Any], functionRegistry = functionRegistry.asInstanceOf[js.Any], lazilyTransformingAstService = lazilyTransformingAstService.asInstanceOf[js.Any], namedExpressions = namedExpressions.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], serialization = serialization.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], unparser = unparser.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngineState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EngineState] (val x: Self) extends AnyVal {
      
      inline def setCellContentParser(value: CellContentParser): Self = StObject.set(x, "cellContentParser", value.asInstanceOf[js.Any])
      
      inline def setColumnSearch(value: ColumnSearchStrategy): Self = StObject.set(x, "columnSearch", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCrudOperations(value: CrudOperations): Self = StObject.set(x, "crudOperations", value.asInstanceOf[js.Any])
      
      inline def setDependencyGraph(value: DependencyGraph): Self = StObject.set(x, "dependencyGraph", value.asInstanceOf[js.Any])
      
      inline def setEvaluator(value: Evaluator): Self = StObject.set(x, "evaluator", value.asInstanceOf[js.Any])
      
      inline def setExporter(value: Exporter): Self = StObject.set(x, "exporter", value.asInstanceOf[js.Any])
      
      inline def setFunctionRegistry(value: FunctionRegistry): Self = StObject.set(x, "functionRegistry", value.asInstanceOf[js.Any])
      
      inline def setLazilyTransformingAstService(value: LazilyTransformingAstService): Self = StObject.set(x, "lazilyTransformingAstService", value.asInstanceOf[js.Any])
      
      inline def setNamedExpressions(value: NamedExpressions): Self = StObject.set(x, "namedExpressions", value.asInstanceOf[js.Any])
      
      inline def setParser(value: ParserWithCaching): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setSerialization(value: Serialization): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Statistics): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setUnparser(value: Unparser): Self = StObject.set(x, "unparser", value.asInstanceOf[js.Any])
    }
  }
}
