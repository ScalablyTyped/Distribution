package typings.hyperformula.mod

import typings.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InternalScalarValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula", "SimpleRangeValue")
@js.native
/**
  * In most cases, it's more convenient to create a `SimpleRangeValue` object
  * by calling one of the [static factory methods](#fromrange).
  */
open class SimpleRangeValue ()
  extends typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue {
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
}
/* static members */
object SimpleRangeValue {
  
  @JSImport("hyperformula", "SimpleRangeValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A factory method. Returns a `SimpleRangeValue` object with the provided range address and the provided data.
    */
  inline def fromRange(
    data: js.Array[js.Array[InternalScalarValue]],
    range: AbsoluteCellRange,
    dependencyGraph: DependencyGraph
  ): typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRange")(data.asInstanceOf[js.Any], range.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue]
  
  /**
    * A factory method. Returns a `SimpleRangeValue` object that contains a single value.
    */
  inline def fromScalar(scalar: InternalScalarValue): typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScalar")(scalar.asInstanceOf[js.Any]).asInstanceOf[typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue]
  
  /**
    * A factory method. Returns a `SimpleRangeValue` object with the provided numeric data.
    */
  inline def onlyNumbers(data: js.Array[js.Array[Double]]): typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyNumbers")(data.asInstanceOf[js.Any]).asInstanceOf[typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue]
  
  /**
    * A factory method. Returns a `SimpleRangeValue` object with the provided range address.
    */
  inline def onlyRange(range: AbsoluteCellRange, dependencyGraph: DependencyGraph): typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("onlyRange")(range.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue]
  
  /**
    * A factory method. Returns a `SimpleRangeValue` object with the provided data.
    */
  inline def onlyValues(data: js.Array[js.Array[InternalScalarValue]]): typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyValues")(data.asInstanceOf[js.Any]).asInstanceOf[typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue]
}
