package typings
package hoekLib.hoekMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hoek", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def abort(message: java.lang.String): scala.Unit = js.native
  def abort(message: stdLib.Error): scala.Unit = js.native
  def applyToDefaults[T1, T2](defaults: T1, options: T2): T1 with T2 = js.native
  def applyToDefaults[T1, T2](defaults: T1, options: T2, isNullOverride: scala.Boolean): T1 with T2 = js.native
  def applyToDefaultsWithShallow[T1, T2](defaults: T1, options: T2): T1 with T2 = js.native
  def applyToDefaultsWithShallow[T1, T2](defaults: T1, options: T2, keys: js.Array[java.lang.String]): T1 with T2 = js.native
  def assert(condition: scala.Boolean, message: java.lang.String): scala.Unit | stdLib.Error = js.native
  def assert(condition: scala.Boolean, message: stdLib.Error): scala.Unit | stdLib.Error = js.native
  def base64urlDecode(value: java.lang.String): java.lang.String = js.native
  def base64urlEncode(value: java.lang.String): java.lang.String = js.native
  def callStack(): js.Array[_] = js.native
  def callStack(slice: js.Any): js.Array[_] = js.native
  def clone[T](obj: T): T = js.native
  def cloneWithShallow(obj: js.Any, keys: js.Array[java.lang.String]): js.Any = js.native
  def contain(ref: js.Any, values: js.Any): scala.Boolean = js.native
  def contain(ref: js.Any, values: js.Any, options: hoekLib.hoekMod.ContainOptions): scala.Boolean = js.native
  def deepEqual[T](b: T, a: T): T = js.native
  def deepEqual[T](b: T, a: T, options: js.Any): T = js.native
  def displayStack(): js.Array[java.lang.String] = js.native
  def displayStack(slice: js.Any): js.Array[java.lang.String] = js.native
  def escapeHeaderAttribute(attribute: java.lang.String): java.lang.String = js.native
  def escapeHtml(htmlString: java.lang.String): java.lang.String = js.native
  def escapeRegex(regexString: java.lang.String): java.lang.String = js.native
  def flatten(array: js.Array[_]): js.Array[_] = js.native
  def flatten(array: js.Array[_], target: js.Array[_]): js.Array[_] = js.native
  def ignore(): scala.Unit = js.native
  def intersect(array1: js.Array[_], array2: js.Array[_]): js.Any = js.native
  def isInteger(value: js.Any): scala.Boolean = js.native
  def mapToObject(array: js.Array[_]): js.Any = js.native
  def mapToObject(array: js.Array[_], key: java.lang.String): js.Any = js.native
  def merge[T1, T2](target: T1, source: T2): T1 with T2 = js.native
  def merge[T1, T2](target: T1, source: T2, isNullOverride: scala.Boolean): T1 with T2 = js.native
  def merge[T1, T2](target: T1, source: T2, isNullOverride: scala.Boolean, isMergeArrays: scala.Boolean): T1 with T2 = js.native
  def nextTick(fn: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  def once(fn: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
  def reach(obj: js.Any, chain: js.Any): js.Any = js.native
  def reach(obj: js.Any, chain: js.Any, options: hoekLib.hoekMod.ReachOptions): js.Any = js.native
  def reachTemplate(obj: js.Any, template: java.lang.String): js.Any = js.native
  def reachTemplate(obj: js.Any, template: java.lang.String, options: hoekLib.hoekMod.ReachOptions): js.Any = js.native
  def shallow(obj: js.Any): js.Any = js.native
  def stringify(obj: js.Any): java.lang.String = js.native
  def transform(obj: js.Any, transform: js.Any): js.Any = js.native
  def transform(obj: js.Any, transform: js.Any, options: hoekLib.hoekMod.ReachOptions): js.Any = js.native
  def unique[T](array: js.Array[T]): js.Array[T] = js.native
  def unique[T](array: js.Array[T], key: java.lang.String): js.Array[T] = js.native
  def uniqueFilename(path: java.lang.String): java.lang.String = js.native
  def uniqueFilename(path: java.lang.String, extension: java.lang.String): java.lang.String = js.native
}

