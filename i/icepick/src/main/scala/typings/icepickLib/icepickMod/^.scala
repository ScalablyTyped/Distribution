package typings
package icepickLib.icepickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("icepick", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def assign[T](target: T): T = js.native
  def assign[T, S1](target: T, source1: S1): T with S1 = js.native
  def assign[T, S1, S2](target: T, s1: S1, s2: S2): T with S1 with S2 = js.native
  def assign[T, S1, S2, S3](target: T, s1: S1, s2: S2, s3: S3): T with S1 with S2 with S3 = js.native
  def assign[T, S1, S2, S3, S4](target: T, s1: S1, s2: S2, s3: S3, s4: S4): T with S1 with S2 with S3 with S4 = js.native
  def assoc[T, V](collection: T, key: java.lang.String, value: V): T = js.native
  def assoc[T, V](collection: T, key: scala.Double, value: V): T = js.native
  def assocIn[T, V](collection: T, path: js.Array[scala.Double | java.lang.String], value: V): T = js.native
  def chain[T](target: T): icepickLib.icepickMod.IcepickWrapper[T] = js.native
  def dissoc[T](collection: T, key: java.lang.String): T = js.native
  def dissoc[T](collection: T, key: scala.Double): T = js.native
  def dissocIn[T](collection: T, path: js.Array[scala.Double | java.lang.String]): T = js.native
  def extend[T](target: T): T = js.native
  def extend[T, S1](target: T, source1: S1): T with S1 = js.native
  def extend[T, S1, S2](target: T, s1: S1, s2: S2): T with S1 with S2 = js.native
  def extend[T, S1, S2, S3](target: T, s1: S1, s2: S2, s3: S3): T with S1 with S2 with S3 = js.native
  def extend[T, S1, S2, S3, S4](target: T, s1: S1, s2: S2, s3: S3, s4: S4): T with S1 with S2 with S3 with S4 = js.native
  def filter[T](fn: js.Function1[/* value */ T, scala.Boolean], array: js.Array[T]): js.Array[T] = js.native
  def freeze[T](collection: T): T = js.native
  def getIn[T](collection: T, path: js.Array[scala.Double | java.lang.String]): js.Any = js.native
  def map[T, U](fn: js.Function1[/* value */ T, U], array: js.Array[T]): js.Array[U] = js.native
  def merge[T, S1](target: T, source: S1): T with S1 = js.native
  def pop[T](array: js.Array[T]): js.Array[T] = js.native
  def push[T](array: js.Array[T], element: T): js.Array[T] = js.native
  def reverse[T](array: js.Array[T]): js.Array[T] = js.native
  def set[T, V](collection: T, key: java.lang.String, value: V): T = js.native
  def set[T, V](collection: T, key: scala.Double, value: V): T = js.native
  def setIn[T, V](collection: T, path: js.Array[scala.Double | java.lang.String], value: V): T = js.native
  def shift[T](array: js.Array[T]): js.Array[T] = js.native
  def slice[T](array: js.Array[T]): js.Array[T] = js.native
  def slice[T](array: js.Array[T], begin: scala.Double): js.Array[T] = js.native
  def slice[T](array: js.Array[T], begin: scala.Double, end: scala.Double): js.Array[T] = js.native
  def sort[T](array: js.Array[T]): js.Array[T] = js.native
  def sort[T](array: js.Array[T], compareFunction: js.Function2[/* a */ T, /* b */ T, scala.Double]): js.Array[T] = js.native
  def splice[T](array: js.Array[T], start: scala.Double, deleteCount: scala.Double, items: T*): js.Array[T] = js.native
  def thaw[T](collection: T): T = js.native
  def unset[T](collection: T, key: java.lang.String): T = js.native
  def unset[T](collection: T, key: scala.Double): T = js.native
  def unsetIn[T](collection: T, path: js.Array[scala.Double | java.lang.String]): T = js.native
  def unshift[T](array: js.Array[T], element: T): js.Array[T] = js.native
  def updateIn[T, V](
    collection: T,
    path: js.Array[scala.Double | java.lang.String],
    callback: js.Function1[/* value */ V, V]
  ): T = js.native
}

