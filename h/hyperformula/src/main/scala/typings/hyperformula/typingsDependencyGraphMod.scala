package typings.hyperformula

import typings.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.typingsArraySizeMod.ArraySize
import typings.hyperformula.typingsCellContentParserMod.RawCellContent
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsDependencyGraphAddressMappingChooseAddressMappingPolicyMod.ChooseAddressMapping
import typings.hyperformula.typingsDependencyGraphGraphMod.DependencyQuery
import typings.hyperformula.typingsDependencyGraphValueCellVertexMod.ValueCellVertexValue
import typings.hyperformula.typingsDependencyGraphVertexMod.CellVertex
import typings.hyperformula.typingsDependencyGraphVertexMod.Vertex
import typings.hyperformula.typingsI18nMod.TranslationPackage
import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typings.hyperformula.typingsLazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.typingsNamedExpressionsMod.NamedExpressions
import typings.hyperformula.typingsParserAstMod.Ast
import typings.hyperformula.typingsParserAstMod.ParsingError_
import typings.hyperformula.typingsStatisticsMod.Statistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphMod {
  
  @JSImport("hyperformula/typings/DependencyGraph", "AddressMapping")
  @js.native
  open class AddressMapping protected ()
    extends typings.hyperformula.typingsDependencyGraphAddressMappingAddressMappingMod.AddressMapping {
    def this(policy: ChooseAddressMapping) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "ArrayMapping")
  @js.native
  open class ArrayMapping ()
    extends typings.hyperformula.typingsDependencyGraphArrayMappingMod.ArrayMapping
  
  @JSImport("hyperformula/typings/DependencyGraph", "ArrayVertex")
  @js.native
  open class ArrayVertex protected ()
    extends typings.hyperformula.typingsDependencyGraphFormulaCellVertexMod.ArrayVertex {
    def this(formula: Ast, cellAddress: SimpleCellAddress_, size: ArraySize) = this()
    def this(formula: Ast, cellAddress: SimpleCellAddress_, size: ArraySize, version: Double) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "DenseStrategy")
  @js.native
  open class DenseStrategy protected ()
    extends typings.hyperformula.typingsDependencyGraphAddressMappingDenseStrategyMod.DenseStrategy {
    /**
      * @param width - width of the stored sheet
      * @param height - height of the stored sheet
      */
    def this(width: Double, height: Double) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "DependencyGraph")
  @js.native
  open class DependencyGraph protected ()
    extends typings.hyperformula.typingsDependencyGraphDependencyGraphMod.DependencyGraph {
    def this(
      addressMapping: typings.hyperformula.typingsDependencyGraphAddressMappingAddressMappingMod.AddressMapping,
      rangeMapping: typings.hyperformula.typingsDependencyGraphRangeMappingMod.RangeMapping,
      sheetMapping: typings.hyperformula.typingsDependencyGraphSheetMappingMod.SheetMapping,
      arrayMapping: typings.hyperformula.typingsDependencyGraphArrayMappingMod.ArrayMapping,
      stats: Statistics,
      lazilyTransformingAstService: LazilyTransformingAstService,
      functionRegistry: FunctionRegistry,
      namedExpressions: NamedExpressions
    ) = this()
  }
  /* static members */
  object DependencyGraph {
    
    @JSImport("hyperformula/typings/DependencyGraph", "DependencyGraph")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Invariants:
      * - empty cell has associated EmptyCellVertex if and only if it is a dependency (possibly indirect, through range) to some formula
      */
    inline def buildEmpty(
      lazilyTransformingAstService: LazilyTransformingAstService,
      config: Config,
      functionRegistry: FunctionRegistry,
      namedExpressions: NamedExpressions,
      stats: Statistics
    ): typings.hyperformula.typingsDependencyGraphDependencyGraphMod.DependencyGraph = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")(lazilyTransformingAstService.asInstanceOf[js.Any], config.asInstanceOf[js.Any], functionRegistry.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsDependencyGraphDependencyGraphMod.DependencyGraph]
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "EmptyCellVertex")
  @js.native
  open class EmptyCellVertex ()
    extends typings.hyperformula.typingsDependencyGraphEmptyCellVertexMod.EmptyCellVertex
       with CellVertex
  
  @JSImport("hyperformula/typings/DependencyGraph", "FormulaCellVertex")
  @js.native
  open class FormulaCellVertex protected ()
    extends typings.hyperformula.typingsDependencyGraphFormulaCellVertexMod.FormulaCellVertex {
    def this(
      /** Formula in AST format */
    formula: Ast,
      /** Address which this vertex represents */
    address: SimpleCellAddress_,
      version: Double
    ) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "Graph")
  @js.native
  open class Graph[T] protected ()
    extends typings.hyperformula.typingsDependencyGraphGraphMod.Graph[T] {
    def this(dependencyQuery: DependencyQuery[T]) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "ParsingErrorVertex")
  @js.native
  open class ParsingErrorVertex protected ()
    extends typings.hyperformula.typingsDependencyGraphParsingErrorVertexMod.ParsingErrorVertex
       with CellVertex {
    def this(errors: js.Array[ParsingError_], rawInput: String) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "RangeMapping")
  @js.native
  open class RangeMapping ()
    extends typings.hyperformula.typingsDependencyGraphRangeMappingMod.RangeMapping
  
  @JSImport("hyperformula/typings/DependencyGraph", "RangeVertex")
  @js.native
  open class RangeVertex protected ()
    extends typings.hyperformula.typingsDependencyGraphRangeVertexMod.RangeVertex
       with Vertex {
    def this(range: AbsoluteCellRange) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "SheetMapping")
  @js.native
  open class SheetMapping protected ()
    extends typings.hyperformula.typingsDependencyGraphSheetMappingMod.SheetMapping {
    def this(languages: TranslationPackage) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "SparseStrategy")
  @js.native
  open class SparseStrategy protected ()
    extends typings.hyperformula.typingsDependencyGraphAddressMappingSparseStrategyMod.SparseStrategy {
    def this(width: Double, height: Double) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "ValueCellVertex")
  @js.native
  open class ValueCellVertex protected ()
    extends typings.hyperformula.typingsDependencyGraphValueCellVertexMod.ValueCellVertex
       with CellVertex {
    /** Static cell value. */
    def this(parsedValue: ValueCellVertexValue, rawValue: RawCellContent) = this()
  }
}
