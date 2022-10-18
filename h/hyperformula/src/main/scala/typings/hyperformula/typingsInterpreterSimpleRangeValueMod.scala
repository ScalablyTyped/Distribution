package typings.hyperformula

import typings.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.typingsArraySizeMod.ArraySize
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InternalScalarValue
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterSimpleRangeValueMod {
  
  @JSImport("hyperformula/typings/interpreter/SimpleRangeValue", "SimpleRangeValue")
  @js.native
  open class SimpleRangeValue () extends StObject {
    def this(_data: js.Array[js.Array[InternalScalarValue]]) = this()
    def this(_data: js.Array[js.Array[InternalScalarValue]], range: AbsoluteCellRange) = this()
    def this(_data: Unit, range: AbsoluteCellRange) = this()
    def this(_data: js.Array[js.Array[InternalScalarValue]], range: Unit, dependencyGraph: DependencyGraph) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      range: AbsoluteCellRange,
      dependencyGraph: DependencyGraph
    ) = this()
    def this(_data: Unit, range: Unit, dependencyGraph: DependencyGraph) = this()
    def this(_data: Unit, range: AbsoluteCellRange, dependencyGraph: DependencyGraph) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      range: Unit,
      dependencyGraph: Unit,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      range: Unit,
      dependencyGraph: DependencyGraph,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      range: AbsoluteCellRange,
      dependencyGraph: Unit,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      range: AbsoluteCellRange,
      dependencyGraph: DependencyGraph,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(_data: Unit, range: Unit, dependencyGraph: Unit, _hasOnlyNumbers: Boolean) = this()
    def this(_data: Unit, range: Unit, dependencyGraph: DependencyGraph, _hasOnlyNumbers: Boolean) = this()
    def this(_data: Unit, range: AbsoluteCellRange, dependencyGraph: Unit, _hasOnlyNumbers: Boolean) = this()
    def this(_data: Unit, range: AbsoluteCellRange, dependencyGraph: DependencyGraph, _hasOnlyNumbers: Boolean) = this()
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _hasOnlyNumbers: Any = js.native
    
    def data: js.Array[js.Array[InternalScalarValue]] = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    def effectiveAddressesFromData(leftCorner: SimpleCellAddress_): IterableIterator[SimpleCellAddress_] = js.native
    
    /* private */ var ensureThatComputed: Any = js.native
    
    def entriesFromTopLeftCorner(leftCorner: SimpleCellAddress_): IterableIterator[js.Tuple2[InternalScalarValue, SimpleCellAddress_]] = js.native
    
    def hasOnlyNumbers(): Boolean = js.native
    
    def height(): Double = js.native
    
    def isAdHoc(): Boolean = js.native
    
    def iterateValuesFromTopLeftCorner(): IterableIterator[InternalScalarValue] = js.native
    
    def numberOfElements(): Double = js.native
    
    val range: js.UndefOr[AbsoluteCellRange] = js.native
    
    def rawData(): js.Array[js.Array[InternalScalarValue]] = js.native
    
    def rawNumbers(): js.Array[js.Array[Double]] = js.native
    
    def sameDimensionsAs(other: SimpleRangeValue): Boolean = js.native
    
    val size: ArraySize = js.native
    
    def valuesFromTopLeftCorner(): js.Array[InternalScalarValue] = js.native
    
    def width(): Double = js.native
  }
  /* static members */
  object SimpleRangeValue {
    
    @JSImport("hyperformula/typings/interpreter/SimpleRangeValue", "SimpleRangeValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromRange(
      data: js.Array[js.Array[InternalScalarValue]],
      range: AbsoluteCellRange,
      dependencyGraph: DependencyGraph
    ): SimpleRangeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRange")(data.asInstanceOf[js.Any], range.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any])).asInstanceOf[SimpleRangeValue]
    
    inline def fromScalar(scalar: InternalScalarValue): SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScalar")(scalar.asInstanceOf[js.Any]).asInstanceOf[SimpleRangeValue]
    
    inline def onlyNumbers(data: js.Array[js.Array[Double]]): SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyNumbers")(data.asInstanceOf[js.Any]).asInstanceOf[SimpleRangeValue]
    
    inline def onlyRange(range: AbsoluteCellRange, dependencyGraph: DependencyGraph): SimpleRangeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("onlyRange")(range.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any])).asInstanceOf[SimpleRangeValue]
    
    inline def onlyValues(data: js.Array[js.Array[InternalScalarValue]]): SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyValues")(data.asInstanceOf[js.Any]).asInstanceOf[SimpleRangeValue]
  }
}
