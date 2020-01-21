package typings.isLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-lite", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(value: js.Any): Types = js.native
  def array(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
  def arrayOf(target: js.Array[_], predicate: js.Function1[/* v */ js.Any, Boolean]): Boolean = js.native
  def asyncFunction(value: js.Any): /* is std.Function */ Boolean = js.native
  def boolean(value: js.Any): /* is boolean */ Boolean = js.native
  def date(value: js.Any): /* is std.Date */ Boolean = js.native
  def defined(value: js.Any): Boolean = js.native
  def domElement(value: js.Any): /* is std.Element */ Boolean = js.native
  def empty(value: js.Any): Boolean = js.native
  def error(value: js.Any): /* is std.Error */ Boolean = js.native
  def function(value: js.Any): /* is std.Function */ Boolean = js.native
  def generator(value: js.Any): /* is std.Generator<unknown, any, unknown> */ Boolean = js.native
  def generatorFunction(value: js.Any): /* is std.GeneratorFunction */ Boolean = js.native
  def instanceOf[T](instance: js.Any, class_ : Class[T]): /* is T */ Boolean = js.native
  def iterable(value: js.Any): /* is std.IterableIterator<unknown> */ Boolean = js.native
  def map(value: js.Any): /* is std.Map<unknown, unknown> */ Boolean = js.native
  def nan(value: js.Any): Boolean = js.native
  def `null`(value: js.Any): /* is null */ Boolean = js.native
  def nullOrUndefined(value: js.Any): Boolean = js.native
  def number(value: js.Any): /* is number */ Boolean = js.native
  def numericString(value: js.Any): /* is string */ Boolean = js.native
  def `object`(value: js.Any): /* is object */ Boolean = js.native
  def oneOf(target: js.Array[_], value: js.Any): Boolean = js.native
  def plainObject(value: js.Any): /* is is-lite.is-lite.IPlainObject */ Boolean = js.native
  def promise(value: js.Any): /* is std.Promise<unknown> */ Boolean = js.native
  def propertyOf(target: js.Object, key: String): Boolean = js.native
  def propertyOf(target: js.Object, key: String, predicate: js.Function1[/* v */ js.Any, Boolean]): Boolean = js.native
  def regexp(value: js.Any): /* is std.RegExp */ Boolean = js.native
  def set(value: js.Any): /* is std.Set<object> */ Boolean = js.native
  def string(value: js.Any): /* is string */ Boolean = js.native
  def symbol(value: js.Any): /* is symbol */ Boolean = js.native
  def undefined(value: js.Any): /* is undefined */ Boolean = js.native
  def weakMap(value: js.Any): /* is std.WeakMap<object, unknown> */ Boolean = js.native
  def weakSet(value: js.Any): /* is std.WeakSet<object> */ Boolean = js.native
}

