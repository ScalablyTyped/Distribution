package typings.hoek.hoekMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hoek", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def abort(message: String): Unit = js.native
  def abort(message: Error): Unit = js.native
  def applyToDefaults[T1, T2](defaults: T1, options: T2): T1 with T2 = js.native
  def applyToDefaults[T1, T2](defaults: T1, options: T2, isNullOverride: Boolean): T1 with T2 = js.native
  def applyToDefaultsWithShallow[T1, T2](defaults: T1, options: T2): T1 with T2 = js.native
  def applyToDefaultsWithShallow[T1, T2](defaults: T1, options: T2, keys: js.Array[String]): T1 with T2 = js.native
  def assert(condition: Boolean, message: String): Unit | Error = js.native
  def assert(condition: Boolean, message: Error): Unit | Error = js.native
  def base64urlDecode(value: String): String = js.native
  def base64urlEncode(value: String): String = js.native
  def callStack(): js.Array[_] = js.native
  def callStack(slice: js.Any): js.Array[_] = js.native
  def clone[T](obj: T): T = js.native
  def cloneWithShallow(obj: js.Any, keys: js.Array[String]): js.Any = js.native
  def contain(ref: js.Any, values: js.Any): Boolean = js.native
  def contain(ref: js.Any, values: js.Any, options: ContainOptions): Boolean = js.native
  def deepEqual[T](b: T, a: T): T = js.native
  def deepEqual[T](b: T, a: T, options: js.Any): T = js.native
  def displayStack(): js.Array[String] = js.native
  def displayStack(slice: js.Any): js.Array[String] = js.native
  def escapeHeaderAttribute(attribute: String): String = js.native
  def escapeHtml(htmlString: String): String = js.native
  def escapeRegex(regexString: String): String = js.native
  def flatten(array: js.Array[_]): js.Array[_] = js.native
  def flatten(array: js.Array[_], target: js.Array[_]): js.Array[_] = js.native
  def ignore(): Unit = js.native
  def intersect(array1: js.Array[_], array2: js.Array[_]): js.Any = js.native
  def isInteger(value: js.Any): Boolean = js.native
  def mapToObject(array: js.Array[_]): js.Any = js.native
  def mapToObject(array: js.Array[_], key: String): js.Any = js.native
  def merge[T1, T2](target: T1, source: T2): T1 with T2 = js.native
  def merge[T1, T2](target: T1, source: T2, isNullOverride: Boolean): T1 with T2 = js.native
  def merge[T1, T2](target: T1, source: T2, isNullOverride: Boolean, isMergeArrays: Boolean): T1 with T2 = js.native
  def nextTick(fn: js.Function0[Unit]): js.Function0[Unit] = js.native
  def once(fn: js.Function0[Unit]): js.Function0[Unit] = js.native
  def reach(obj: js.Any, chain: js.Any): js.Any = js.native
  def reach(obj: js.Any, chain: js.Any, options: ReachOptions): js.Any = js.native
  def reachTemplate(obj: js.Any, template: String): js.Any = js.native
  def reachTemplate(obj: js.Any, template: String, options: ReachOptions): js.Any = js.native
  def shallow(obj: js.Any): js.Any = js.native
  def stringify(obj: js.Any): String = js.native
  def transform(obj: js.Any, transform: js.Any): js.Any = js.native
  def transform(obj: js.Any, transform: js.Any, options: ReachOptions): js.Any = js.native
  def unique[T](array: js.Array[T]): js.Array[T] = js.native
  def unique[T](array: js.Array[T], key: String): js.Array[T] = js.native
  def uniqueFilename(path: String): String = js.native
  def uniqueFilename(path: String, extension: String): String = js.native
}

