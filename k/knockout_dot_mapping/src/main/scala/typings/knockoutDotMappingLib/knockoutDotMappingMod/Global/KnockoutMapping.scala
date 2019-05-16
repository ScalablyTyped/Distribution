package typings
package knockoutDotMappingLib.knockoutDotMappingMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutMapping extends js.Object {
  /**
    * Get the default mapping options
    */
  def defaultOptions(): KnockoutMappingStandardOptions = js.native
  //fromJS could be reduced the number of declarations, but KnockoutObservableType<T> would have to use Conditional Types available only on TS v2.8
  /**
    * Creates a view model object with observable properties for each of the properties on the source. 
    * If 'target' is supplied, instead, target's observable properties are updated.
    * @param source Plain JavaScript object to be mapped.
    * @param options Options on mapping behavior.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS(source: java.lang.String): knockoutLib.KnockoutObservable[java.lang.String] = js.native
  def fromJS(source: java.lang.String, options: KnockoutMappingOptions[java.lang.String]): knockoutLib.KnockoutObservable[java.lang.String] = js.native
  def fromJS(
    source: java.lang.String,
    options: KnockoutMappingOptions[java.lang.String],
    target: knockoutLib.KnockoutObservable[java.lang.String]
  ): knockoutLib.KnockoutObservable[java.lang.String] = js.native
  /**
    * Updates target's observable properties with those of the sources.
    * @param source Plain JavaScript object to be mapped.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS(source: java.lang.String, target: knockoutLib.KnockoutObservable[java.lang.String]): knockoutLib.KnockoutObservable[java.lang.String] = js.native
  /**
    * Creates a view model object with observable properties for each of the properties on the source. 
    * If 'target' is supplied, instead, target's observable properties are updated.
    * @param source Plain JavaScript object to be mapped.
    * @param options Options on mapping behavior.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS(source: scala.Boolean): knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  def fromJS(source: scala.Boolean, options: KnockoutMappingOptions[scala.Boolean]): knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  def fromJS(
    source: scala.Boolean,
    options: KnockoutMappingOptions[scala.Boolean],
    target: knockoutLib.KnockoutObservable[scala.Boolean]
  ): knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  /**
    * Updates target's observable properties with those of the sources.
    * @param source Plain JavaScript object to be mapped.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS(source: scala.Boolean, target: knockoutLib.KnockoutObservable[scala.Boolean]): knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  /**
    * Creates a view model object with observable properties for each of the properties on the source. 
    * If 'target' is supplied, instead, target's observable properties are updated.
    * @param source Plain JavaScript object to be mapped.
    * @param options Options on mapping behavior.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS(source: scala.Double): knockoutLib.KnockoutObservable[scala.Double] = js.native
  def fromJS(source: scala.Double, options: KnockoutMappingOptions[scala.Double]): knockoutLib.KnockoutObservable[scala.Double] = js.native
  def fromJS(
    source: scala.Double,
    options: KnockoutMappingOptions[scala.Double],
    target: knockoutLib.KnockoutObservable[scala.Double]
  ): knockoutLib.KnockoutObservable[scala.Double] = js.native
  /**
    * Updates target's observable properties with those of the sources.
    * @param source Plain JavaScript object to be mapped.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS(source: scala.Double, target: knockoutLib.KnockoutObservable[scala.Double]): knockoutLib.KnockoutObservable[scala.Double] = js.native
  /**
    * Creates a view model object with observable properties for each of the properties on the source. 
    * If 'target' is supplied, instead, target's observable properties are updated.
    * @param source Plain JavaScript object to be mapped.
    * @param options Options on mapping behavior.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS[T](source: T): js.Any = js.native
  def fromJS[T](source: T, options: KnockoutMappingOptions[T]): js.Any = js.native
  def fromJS[T](source: T, options: KnockoutMappingOptions[T], target: js.Any): js.Any = js.native
  /**
    * Updates target's observable properties with those of the sources.
    * @param source Plain JavaScript object to be mapped.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS[T](source: T, target: js.Any): js.Any = js.native
  /**
    * Creates a view model object with observable properties for each of the properties on the source. 
    * If 'target' is supplied, instead, target's observable properties are updated.
    * @param source Plain JavaScript object to be mapped.
    * @param options Options on mapping behavior.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS[T](source: js.Array[T]): knockoutLib.KnockoutObservableArray[_] = js.native
  def fromJS[T](source: js.Array[T], options: KnockoutMappingOptions[js.Array[T]]): knockoutLib.KnockoutObservableArray[_] = js.native
  def fromJS[T](
    source: js.Array[T],
    options: KnockoutMappingOptions[js.Array[T]],
    target: knockoutLib.KnockoutObservableArray[_]
  ): knockoutLib.KnockoutObservableArray[_] = js.native
  /**
    * Updates target's observable properties with those of the sources.
    * @param source Plain JavaScript object to be mapped.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS[T](source: js.Array[T], target: knockoutLib.KnockoutObservableArray[_]): knockoutLib.KnockoutObservableArray[_] = js.native
  /**
    * Creates a view model object with observable properties for each of the properties on the source. 
    * If 'target' is supplied, instead, target's observable properties are updated.
    * @param source JSON of a JavaScript object to be mapped.
    * @param options Options on mapping behavior.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJSON(source: java.lang.String): js.Any = js.native
  def fromJSON(source: java.lang.String, options: KnockoutMappingOptions[_]): js.Any = js.native
  def fromJSON(source: java.lang.String, options: KnockoutMappingOptions[_], target: js.Any): js.Any = js.native
  /**
    * Updates target's observable properties with those of the sources.
    * @param source JSON of a JavaScript object to be mapped.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJSON(source: java.lang.String, target: js.Any): js.Any = js.native
  /**
    * Undocumented. Custom implementation of JavaScript's typeof.
    * @param x object to check type
    */
  def getType(x: js.Any): js.Any = js.native
  /**
    * Checks if an object was created using KnockoutMapping
    * @param viewModel View model object to be checked.
    */
  def isMapped(viewModel: js.Any): scala.Boolean = js.native
  /**
    * Undocumented. Reset Mapping default options.
    */
  def resetDefaultOptions(): scala.Unit = js.native
  def toJS(viewModel: js.Any): js.Any = js.native
  def toJS(viewModel: js.Any, options: KnockoutMappingOptions[_]): js.Any = js.native
  def toJS[T](viewModel: KnockoutObservableType[T]): T = js.native
  def toJS[T](viewModel: KnockoutObservableType[T], options: KnockoutMappingOptions[T]): T = js.native
  /**
    * Creates an unmapped object containing only the properties of the mapped object that were part of your original JS object. 
    * @param viewModel View model object previosly mapped.
    * @param options Options on mapping behavior.
    */
  def toJS[T](viewModel: knockoutLib.KnockoutObservable[T]): T = js.native
  def toJS[T](viewModel: knockoutLib.KnockoutObservableArray[T]): js.Array[T] = js.native
  def toJS[T](viewModel: knockoutLib.KnockoutObservableArray[T], options: KnockoutMappingOptions[T]): js.Array[T] = js.native
  def toJS[T](viewModel: knockoutLib.KnockoutObservable[T], options: KnockoutMappingOptions[T]): T = js.native
  /**
    * Creates an unmapped object containing only the properties of the mapped object that were part of your original JS object. Stringify the result.
    * @param viewModel Object with observables to be converted.
    * @param options Options on mapping behavior.
    */
  def toJSON[T](viewModel: T): java.lang.String = js.native
  def toJSON[T](viewModel: T, options: KnockoutMappingOptions[T]): java.lang.String = js.native
  /**
    * Undocumented.
    */
  def visitModel(rootObject: js.Any, callback: js.Function): js.Any = js.native
  def visitModel(rootObject: js.Any, callback: js.Function, options: knockoutDotMappingLib.Anon_Copy): js.Any = js.native
}

