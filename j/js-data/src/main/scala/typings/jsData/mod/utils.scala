package typings.jsData.mod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "utils")
@js.native
object utils extends js.Object {
  var Promise: PromiseConstructor = js.native
  var isBrowser: Boolean = js.native
  def _forRelation(opts: js.Any, `def`: js.Any, fn: js.Function, ctx: js.Object): Unit = js.native
  def _getIndex(list: js.Array[_], relation: js.Any): Double = js.native
  @JSName("_")
  def _underscore(dest: js.Any, src: js.Any): Unit = js.native
  def addHiddenPropsToTarget(target: js.Object, props: js.Object): Unit = js.native
  def areDifferent(a: js.Object, b: js.Object, opts: js.Any): Boolean = js.native
  def classCallCheck(instance: js.Object, ctor: js.Function): Unit = js.native
  def copy(from: js.Any): js.Any = js.native
  def copy(from: js.Any, to: js.Any): js.Any = js.native
  def copy(from: js.Any, to: js.Any, stackFrom: js.Any): js.Any = js.native
  def copy(from: js.Any, to: js.Any, stackFrom: js.Any, stackTo: js.Any): js.Any = js.native
  def copy(from: js.Any, to: js.Any, stackFrom: js.Any, stackTo: js.Any, blacklist: js.Array[_]): js.Any = js.native
  def copy(
    from: js.Any,
    to: js.Any,
    stackFrom: js.Any,
    stackTo: js.Any,
    blacklist: js.Array[_],
    plain: Boolean
  ): js.Any = js.native
  def deepEqual(a: js.Any, b: js.Any): Boolean = js.native
  def deepFillIn(dest: js.Object, source: js.Object): js.Object = js.native
  def deepMixIn(dest: js.Object, source: js.Object): js.Object = js.native
  def diffObjects(a: js.Any, b: js.Any, opts: js.Any): Diff = js.native
  def equal(a: js.Any, b: js.Any): Boolean = js.native
  def eventify(target: js.Any, getter: js.Function, setter: js.Function): Unit = js.native
  def eventify(target: js.Any, getter: js.Function, setter: js.Function, enumerable: Boolean): Unit = js.native
  def extend(): js.Function = js.native
  def extend(props: js.Any): js.Function = js.native
  def extend(props: js.Any, classProps: js.Any): js.Function = js.native
  def fillIn(dest: js.Object, src: js.Object): Unit = js.native
  def findIndex(array: js.Array[_], fn: js.Function): Unit = js.native
  def forEachRelation(mapper: js.Any, opts: js.Any, fn: js.Function): Unit = js.native
  def forEachRelation(mapper: js.Any, opts: js.Any, fn: js.Function, ctx: js.Any): Unit = js.native
  def forOwn(obj: js.Any, fn: js.Function): Unit = js.native
  def forOwn(obj: js.Any, fn: js.Function, thisArg: js.Object): Unit = js.native
  def fromJson(json: js.Any): js.Any = js.native
  def get(`object`: js.Object, prop: String): js.Any = js.native
  def getSuper(instance: js.Any): js.Function = js.native
  def getSuper(instance: js.Any, isCtor: Boolean): js.Function = js.native
  def intersection(array1: js.Array[_], array2: js.Array[_]): js.Array[_] = js.native
  def isArray(arg: js.Any): Boolean = js.native
  def isBlacklisted(prop: String, bl: js.Array[_]): Boolean = js.native
  def isBoolean(value: js.Any): Boolean = js.native
  def isDate(value: js.Any): Boolean = js.native
  def isFunction(value: js.Any): Boolean = js.native
  def isInteger(value: js.Any): Boolean = js.native
  def isNull(value: js.Any): Boolean = js.native
  def isNumber(value: js.Any): Boolean = js.native
  def isObject(value: js.Any): Boolean = js.native
  def isRegExp(value: js.Any): Boolean = js.native
  def isSorN(value: js.Any): Boolean = js.native
  def isString(value: js.Any): Boolean = js.native
  def isUndefined(value: js.Any): Boolean = js.native
  def logify(target: js.Any, defaultNamespace: js.Any): Unit = js.native
  def noDupeAdd(array: js.Array[_], record: js.Any, fn: js.Function): Unit = js.native
  def omit(props: js.Object, keys: js.Array[String]): js.Object = js.native
  def plainCopy(from: js.Any): js.Any = js.native
  def possibleConstructorReturn(self: js.Object, call: js.Function): js.Object = js.native
  def possibleConstructorReturn(self: js.Object, call: js.Object): js.Object = js.native
  def reject(value: js.Any): js.Promise[_] = js.native
  def remove(array: js.Array[_], fn: js.Function): Unit = js.native
  def resolve(value: js.Any): js.Promise[_] = js.native
  def set(`object`: js.Object, path: String): Unit = js.native
  def set(`object`: js.Object, path: String, value: js.Any): Unit = js.native
  def toJson(value: js.Any): String = js.native
  def toJson(value: js.Any, replacer: js.Function): String = js.native
  def toJson(value: js.Any, replacer: js.Function, space: Double): String = js.native
  def unset(`object`: js.Object, path: String): Unit = js.native
}

