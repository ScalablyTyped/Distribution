package typings.knockoutDotMapping.knockoutDotMappingMod._Global_

import typings.knockout.KnockoutObservable
import typings.knockout.KnockoutObservableArray
import typings.knockoutDotMapping.Anon_Copy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutMapping extends js.Object {
  /**
    * Get the default mapping options
    */
  def defaultOptions(): KnockoutMappingStandardOptions = js.native
  /**
    * Creates a view model object with observable properties for each of the properties on the source. 
    * If 'target' is supplied, instead, target's observable properties are updated.
    * @param source Plain JavaScript object to be mapped.
    * @param options Options on mapping behavior.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS[T](source: T): MappedType[T] = js.native
  /**
    * Updates target's observable properties with those of the sources.
    * @param source Plain JavaScript object to be mapped.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS[T](source: T, options: KnockoutMappingOptions[T] | MappedType[T]): MappedType[T] = js.native
  def fromJS[T](source: T, options: KnockoutMappingOptions[T], target: MappedType[T]): MappedType[T] = js.native
  /**
    * Creates an readonly observable array view model. Objects on the source array are also converted to observables. Primitive types and arrays are not. 
    * If 'target' is supplied, instead, target's observable properties are updated.
    * @param source Array to be mapped.
    * @param options Options on mapping behavior.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS[T](source: js.Array[T]): KnockoutReadonlyObservableArrayType[T] = js.native
  def fromJS[T](source: js.Array[T], options: KnockoutMappingOptions[js.Array[T]]): KnockoutReadonlyObservableArrayType[T] = js.native
  def fromJS[T](
    source: js.Array[T],
    options: KnockoutMappingOptions[js.Array[T]],
    target: KnockoutObservableArrayType[T]
  ): KnockoutObservableArrayType[T] = js.native
  def fromJS[T](
    source: js.Array[T],
    options: KnockoutMappingOptions[js.Array[T]],
    target: KnockoutReadonlyObservableArrayType[T]
  ): KnockoutReadonlyObservableArrayType[T] = js.native
  /**
    * Updates target's observable properties with those of the sources.
    * @param source Array to be mapped.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS[T](source: js.Array[T], target: KnockoutObservableArrayType[T]): KnockoutObservableArrayType[T] = js.native
  /**
    * Updates target's observable properties with those of the sources.
    * @param source Array to be mapped.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJS[T](source: js.Array[T], target: KnockoutReadonlyObservableArrayType[T]): KnockoutReadonlyObservableArrayType[T] = js.native
  /**
    * Creates a view model object with observable properties for each of the properties on the source. 
    * If 'target' is supplied, instead, target's observable properties are updated.
    * @param source JSON of a JavaScript object to be mapped.
    * @param options Options on mapping behavior.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJSON(source: String): js.Any = js.native
  def fromJSON(source: String, options: KnockoutMappingOptions[_]): js.Any = js.native
  def fromJSON(source: String, options: KnockoutMappingOptions[_], target: js.Any): js.Any = js.native
  /**
    * Updates target's observable properties with those of the sources.
    * @param source JSON of a JavaScript object to be mapped.
    * @param target View model object previosly mapped to be updated.
    */
  def fromJSON(source: String, target: js.Any): js.Any = js.native
  /**
    * Creates an observable array view model. Objects on the source array are also converted to observables. Primitive types and arrays are not. 
    * If 'target' is supplied, instead, target's observable properties are updated.
    * @param source Array to be mapped.
    * @param options Options on mapping behavior.
    * @param target View model object previosly mapped to be updated.
    */
  @JSName("fromJS")
  def fromJS_T_KnockoutObservableArrayType[T](source: js.Array[T]): KnockoutObservableArrayType[T] = js.native
  @JSName("fromJS")
  def fromJS_T_KnockoutObservableArrayType[T](source: js.Array[T], options: KnockoutMappingOptions[js.Array[T]]): KnockoutObservableArrayType[T] = js.native
  /**
    * Undocumented. Custom implementation of JavaScript's typeof.
    * @param x object to check type
    */
  def getType(x: js.Any): js.Any = js.native
  /**
    * Checks if an object was created using KnockoutMapping
    * @param viewModel View model object to be checked.
    */
  def isMapped(viewModel: js.Any): Boolean = js.native
  /**
    * Undocumented. Reset Mapping default options.
    */
  def resetDefaultOptions(): Unit = js.native
  def toJS(viewModel: js.Any): js.Any = js.native
  def toJS(viewModel: js.Any, options: KnockoutMappingOptions[_]): js.Any = js.native
  /**
    * Creates an unmapped object containing only the properties of the mapped object that were part of your original JS object. 
    * @param viewModel View model object previosly mapped.
    * @param options Options on mapping behavior.
    */
  def toJS[T](viewModel: KnockoutObservable[T]): T = js.native
  def toJS[T](viewModel: KnockoutObservableArray[T]): js.Array[T] = js.native
  def toJS[T](viewModel: KnockoutObservableArray[T], options: KnockoutMappingOptions[T]): js.Array[T] = js.native
  def toJS[T](viewModel: KnockoutObservable[T], options: KnockoutMappingOptions[T]): T = js.native
  def toJS[T](viewModel: KnockoutObservableType[T]): T = js.native
  def toJS[T](viewModel: KnockoutObservableType[T], options: KnockoutMappingOptions[T]): T = js.native
  /**
    * Creates an unmapped object containing only the properties of the mapped object that were part of your original JS object. Stringify the result.
    * @param viewModel Object with observables to be converted.
    * @param options Options on mapping behavior.
    */
  def toJSON[T](viewModel: T): String = js.native
  def toJSON[T](viewModel: T, options: KnockoutMappingOptions[T]): String = js.native
  /**
    * Undocumented.
    */
  def visitModel(rootObject: js.Any, callback: js.Function): js.Any = js.native
  def visitModel(rootObject: js.Any, callback: js.Function, options: Anon_Copy): js.Any = js.native
}

