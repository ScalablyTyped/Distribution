package typings.hyperformula

import typings.hyperformula.absoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.arraySizeMod.ArraySize
import typings.hyperformula.astMod.Ast
import typings.hyperformula.astMod.ParsingError_
import typings.hyperformula.cellContentParserMod.RawCellContent
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.chooseAddressMappingPolicyMod.ChooseAddressMapping
import typings.hyperformula.configMod.Config
import typings.hyperformula.functionRegistryMod.FunctionRegistry
import typings.hyperformula.graphMod.DependencyQuery
import typings.hyperformula.i18nMod.TranslationPackage
import typings.hyperformula.lazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.namedExpressionsMod.NamedExpressions
import typings.hyperformula.statisticsMod.Statistics
import typings.hyperformula.valueCellVertexMod.ValueCellVertexValue
import typings.hyperformula.vertexMod.CellVertex
import typings.hyperformula.vertexMod.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependencyGraphMod {
  
  @JSImport("hyperformula/typings/DependencyGraph", "AddressMapping")
  @js.native
  open class AddressMapping protected ()
    extends typings.hyperformula.addressMappingMod.AddressMapping {
    def this(policy: ChooseAddressMapping) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "ArrayMapping")
  @js.native
  open class ArrayMapping ()
    extends typings.hyperformula.arrayMappingMod.ArrayMapping
  
  @JSImport("hyperformula/typings/DependencyGraph", "ArrayVertex")
  @js.native
  open class ArrayVertex protected ()
    extends typings.hyperformula.formulaCellVertexMod.ArrayVertex {
    def this(formula: Ast, cellAddress: SimpleCellAddress_, size: ArraySize) = this()
    def this(formula: Ast, cellAddress: SimpleCellAddress_, size: ArraySize, version: Double) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "DenseStrategy")
  @js.native
  open class DenseStrategy protected ()
    extends typings.hyperformula.denseStrategyMod.DenseStrategy {
    /**
      * @param width - width of the stored sheet
      * @param height - height of the stored sheet
      */
    def this(width: Double, height: Double) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "DependencyGraph")
  @js.native
  open class DependencyGraph protected ()
    extends typings.hyperformula.dependencyGraphDependencyGraphMod.DependencyGraph {
    def this(
      addressMapping: typings.hyperformula.addressMappingMod.AddressMapping,
      rangeMapping: typings.hyperformula.rangeMappingMod.RangeMapping,
      sheetMapping: typings.hyperformula.sheetMappingMod.SheetMapping,
      arrayMapping: typings.hyperformula.arrayMappingMod.ArrayMapping,
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
    ): typings.hyperformula.dependencyGraphDependencyGraphMod.DependencyGraph = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")(lazilyTransformingAstService.asInstanceOf[js.Any], config.asInstanceOf[js.Any], functionRegistry.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.dependencyGraphDependencyGraphMod.DependencyGraph]
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "EmptyCellVertex")
  @js.native
  open class EmptyCellVertex protected ()
    extends typings.hyperformula.emptyCellVertexMod.EmptyCellVertex
       with CellVertex {
    def this(address: SimpleCellAddress_) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "FormulaCellVertex")
  @js.native
  open class FormulaCellVertex protected ()
    extends typings.hyperformula.formulaCellVertexMod.FormulaCellVertex {
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
    extends typings.hyperformula.graphMod.Graph[T] {
    def this(dependencyQuery: DependencyQuery[T]) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "ParsingErrorVertex")
  @js.native
  open class ParsingErrorVertex protected ()
    extends typings.hyperformula.parsingErrorVertexMod.ParsingErrorVertex
       with CellVertex {
    def this(errors: js.Array[ParsingError_], rawInput: String) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "RangeMapping")
  @js.native
  open class RangeMapping ()
    extends typings.hyperformula.rangeMappingMod.RangeMapping
  
  @JSImport("hyperformula/typings/DependencyGraph", "RangeVertex")
  @js.native
  open class RangeVertex protected ()
    extends typings.hyperformula.rangeVertexMod.RangeVertex
       with Vertex {
    def this(range: AbsoluteCellRange) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "SheetMapping")
  @js.native
  open class SheetMapping protected ()
    extends typings.hyperformula.sheetMappingMod.SheetMapping {
    def this(languages: TranslationPackage) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "SparseStrategy")
  @js.native
  open class SparseStrategy protected ()
    extends typings.hyperformula.sparseStrategyMod.SparseStrategy {
    def this(width: Double, height: Double) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "ValueCellVertex")
  @js.native
  open class ValueCellVertex protected ()
    extends typings.hyperformula.valueCellVertexMod.ValueCellVertex
       with CellVertex {
    /** Static cell value. */
    def this(parsedValue: ValueCellVertexValue, rawValue: RawCellContent) = this()
  }
}
