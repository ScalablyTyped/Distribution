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

object typingsSimpleRangeValueMod {
  
  @JSImport("hyperformula/typings/SimpleRangeValue", "SimpleRangeValue")
  @js.native
  /**
    * In most cases, it's more convenient to create a `SimpleRangeValue` object
    * by calling one of the [static factory methods](#fromrange).
    */
  open class SimpleRangeValue () extends StObject {
    def this(_data: js.Array[js.Array[InternalScalarValue]]) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      /**
      * A property that represents the address of the range.
      */
    range: AbsoluteCellRange
    ) = this()
    def this(
      _data: Unit,
      /**
      * A property that represents the address of the range.
      */
    range: AbsoluteCellRange
    ) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      /**
      * A property that represents the address of the range.
      */
    range: Unit,
      dependencyGraph: DependencyGraph
    ) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      /**
      * A property that represents the address of the range.
      */
    range: AbsoluteCellRange,
      dependencyGraph: DependencyGraph
    ) = this()
    def this(
      _data: Unit,
      /**
      * A property that represents the address of the range.
      */
    range: Unit,
      dependencyGraph: DependencyGraph
    ) = this()
    def this(
      _data: Unit,
      /**
      * A property that represents the address of the range.
      */
    range: AbsoluteCellRange,
      dependencyGraph: DependencyGraph
    ) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      /**
      * A property that represents the address of the range.
      */
    range: Unit,
      dependencyGraph: Unit,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      /**
      * A property that represents the address of the range.
      */
    range: Unit,
      dependencyGraph: DependencyGraph,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      /**
      * A property that represents the address of the range.
      */
    range: AbsoluteCellRange,
      dependencyGraph: Unit,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(
      _data: js.Array[js.Array[InternalScalarValue]],
      /**
      * A property that represents the address of the range.
      */
    range: AbsoluteCellRange,
      dependencyGraph: DependencyGraph,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(
      _data: Unit,
      /**
      * A property that represents the address of the range.
      */
    range: Unit,
      dependencyGraph: Unit,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(
      _data: Unit,
      /**
      * A property that represents the address of the range.
      */
    range: Unit,
      dependencyGraph: DependencyGraph,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(
      _data: Unit,
      /**
      * A property that represents the address of the range.
      */
    range: AbsoluteCellRange,
      dependencyGraph: Unit,
      _hasOnlyNumbers: Boolean
    ) = this()
    def this(
      _data: Unit,
      /**
      * A property that represents the address of the range.
      */
    range: AbsoluteCellRange,
      dependencyGraph: DependencyGraph,
      _hasOnlyNumbers: Boolean
    ) = this()
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _hasOnlyNumbers: Any = js.native
    
    /**
      * Returns the range data as a 2D array.
      */
    def data: js.Array[js.Array[InternalScalarValue]] = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    /**
      * Generates the addresses of the cells contained in the range assuming the provided address is the left corner of the range.
      */
    def effectiveAddressesFromData(leftCorner: SimpleCellAddress_): IterableIterator[SimpleCellAddress_] = js.native
    
    /**
      * Computes the range data if it is not computed yet.
      */
    /* private */ var ensureThatComputed: Any = js.native
    
    /**
      * Generates values and addresses of the cells contained in the range assuming the provided address is the left corner of the range.
      *
      * This method combines the functionalities of [`iterateValuesFromTopLeftCorner()`](#iteratevaluesfromtopleftcorner) and [`effectiveAddressesFromData()`](#effectiveaddressesfromdata).
      */
    def entriesFromTopLeftCorner(leftCorner: SimpleCellAddress_): IterableIterator[js.Tuple2[InternalScalarValue, SimpleCellAddress_]] = js.native
    
    /**
      * Returns `true` if and only if the range contains only numeric values.
      */
    def hasOnlyNumbers(): Boolean = js.native
    
    /**
      * Returns the number of rows contained in the range.
      */
    def height(): Double = js.native
    
    /**
      * Returns `true` if and only if the `SimpleRangeValue` has no address set.
      */
    def isAdHoc(): Boolean = js.native
    
    /**
      * Generates the values of the cells contained in the range assuming the provided address is the left corner of the range.
      */
    def iterateValuesFromTopLeftCorner(): IterableIterator[InternalScalarValue] = js.native
    
    /**
      * Returns the number of cells contained in the range.
      */
    def numberOfElements(): Double = js.native
    
    /**
      * A property that represents the address of the range.
      */
    val range: js.UndefOr[AbsoluteCellRange] = js.native
    
    /**
      * Returns the range data as a 2D array.
      *
      * Internal use only.
      */
    def rawData(): js.Array[js.Array[InternalScalarValue]] = js.native
    
    /**
      * Returns the range data as a 2D array of numbers.
      *
      * Internal use only.
      */
    def rawNumbers(): js.Array[js.Array[Double]] = js.native
    
    /**
      * Returns `true` if and only if the range has the same width and height as the `other` range object.
      */
    def sameDimensionsAs(other: SimpleRangeValue): Boolean = js.native
    
    /**
      * A property that represents the size of the range.
      */
    val size: ArraySize = js.native
    
    /**
      * Returns the range data as a 1D array.
      */
    def valuesFromTopLeftCorner(): js.Array[InternalScalarValue] = js.native
    
    /**
      * Returns the number of columns contained in the range.
      */
    def width(): Double = js.native
  }
  /* static members */
  object SimpleRangeValue {
    
    @JSImport("hyperformula/typings/SimpleRangeValue", "SimpleRangeValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A factory method. Returns a `SimpleRangeValue` object with the provided range address and the provided data.
      */
    inline def fromRange(
      data: js.Array[js.Array[InternalScalarValue]],
      range: AbsoluteCellRange,
      dependencyGraph: DependencyGraph
    ): SimpleRangeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRange")(data.asInstanceOf[js.Any], range.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any])).asInstanceOf[SimpleRangeValue]
    
    /**
      * A factory method. Returns a `SimpleRangeValue` object that contains a single value.
      */
    inline def fromScalar(scalar: InternalScalarValue): SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScalar")(scalar.asInstanceOf[js.Any]).asInstanceOf[SimpleRangeValue]
    
    /**
      * A factory method. Returns a `SimpleRangeValue` object with the provided numeric data.
      */
    inline def onlyNumbers(data: js.Array[js.Array[Double]]): SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyNumbers")(data.asInstanceOf[js.Any]).asInstanceOf[SimpleRangeValue]
    
    /**
      * A factory method. Returns a `SimpleRangeValue` object with the provided range address.
      */
    inline def onlyRange(range: AbsoluteCellRange, dependencyGraph: DependencyGraph): SimpleRangeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("onlyRange")(range.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any])).asInstanceOf[SimpleRangeValue]
    
    /**
      * A factory method. Returns a `SimpleRangeValue` object with the provided data.
      */
    inline def onlyValues(data: js.Array[js.Array[InternalScalarValue]]): SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyValues")(data.asInstanceOf[js.Any]).asInstanceOf[SimpleRangeValue]
  }
}
