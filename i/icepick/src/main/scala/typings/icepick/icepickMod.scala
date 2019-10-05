package typings.icepick

import typings.icepick.icepickMod.IcepickWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("icepick", JSImport.Namespace)
@js.native
object icepickMod extends js.Object {
  @js.native
  trait IcepickWrapper[T] extends js.Object {
    def assign[S1](source1: S1): IcepickWrapper[T with S1] = js.native
    def assign[S1, S2](s1: S1, s2: S2): IcepickWrapper[T with S1 with S2] = js.native
    def assign[S1, S2, S3](s1: S1, s2: S2, s3: S3): IcepickWrapper[T with S1 with S2 with S3] = js.native
    def assign[S1, S2, S3, S4](s1: S1, s2: S2, s3: S3, s4: S4): IcepickWrapper[T with S1 with S2 with S3 with S4] = js.native
    def assoc[V](key: String, value: V): IcepickWrapper[T] = js.native
    def assoc[V](key: Double, value: V): IcepickWrapper[T] = js.native
    def assocIn[V](path: js.Array[Double | String], value: V): IcepickWrapper[T] = js.native
    def dissoc(key: String): IcepickWrapper[T] = js.native
    def dissoc(key: Double): IcepickWrapper[T] = js.native
    def dissocIn[V](path: js.Array[Double | String]): IcepickWrapper[T] = js.native
    def extend[S1](source1: S1): IcepickWrapper[T with S1] = js.native
    def extend[S1, S2](s1: S1, s2: S2): IcepickWrapper[T with S1 with S2] = js.native
    def extend[S1, S2, S3](s1: S1, s2: S2, s3: S3): IcepickWrapper[T with S1 with S2 with S3] = js.native
    def extend[S1, S2, S3, S4](s1: S1, s2: S2, s3: S3, s4: S4): IcepickWrapper[T with S1 with S2 with S3 with S4] = js.native
    def freeze(): IcepickWrapper[T] = js.native
    def getIn(path: js.Array[Double | String]): IcepickWrapper[_] = js.native
    def merge[S1](source: S1): IcepickWrapper[T with S1] = js.native
    def set[V](key: String, value: V): IcepickWrapper[T] = js.native
    def set[V](key: Double, value: V): IcepickWrapper[T] = js.native
    def setIn[V](path: js.Array[Double | String], value: V): IcepickWrapper[T] = js.native
    def thaw(): IcepickWrapper[T] = js.native
    def unset(key: String): IcepickWrapper[T] = js.native
    def unset(key: Double): IcepickWrapper[T] = js.native
    def unsetIn[V](path: js.Array[Double | String]): IcepickWrapper[T] = js.native
    def updateIn[V](path: js.Array[Double | String], callback: js.Function1[/* value */ V, V]): IcepickWrapper[T] = js.native
    def value(): T = js.native
  }
  
  def assign[T](target: T): T = js.native
  def assign[T, S1](target: T, source1: S1): T with S1 = js.native
  def assign[T, S1, S2](target: T, s1: S1, s2: S2): T with S1 with S2 = js.native
  def assign[T, S1, S2, S3](target: T, s1: S1, s2: S2, s3: S3): T with S1 with S2 with S3 = js.native
  def assign[T, S1, S2, S3, S4](target: T, s1: S1, s2: S2, s3: S3, s4: S4): T with S1 with S2 with S3 with S4 = js.native
  def assoc[T, V](collection: T, key: String, value: V): T = js.native
  def assoc[T, V](collection: T, key: Double, value: V): T = js.native
  def assocIn[T, V](collection: T, path: js.Array[Double | String], value: V): T = js.native
  def chain[T](target: T): IcepickWrapper[T] = js.native
  def dissoc[T](collection: T, key: String): T = js.native
  def dissoc[T](collection: T, key: Double): T = js.native
  def dissocIn[T](collection: T, path: js.Array[Double | String]): T = js.native
  def extend[T](target: T): T = js.native
  def extend[T, S1](target: T, source1: S1): T with S1 = js.native
  def extend[T, S1, S2](target: T, s1: S1, s2: S2): T with S1 with S2 = js.native
  def extend[T, S1, S2, S3](target: T, s1: S1, s2: S2, s3: S3): T with S1 with S2 with S3 = js.native
  def extend[T, S1, S2, S3, S4](target: T, s1: S1, s2: S2, s3: S3, s4: S4): T with S1 with S2 with S3 with S4 = js.native
  def filter[T](fn: js.Function1[/* value */ T, Boolean], array: js.Array[T]): js.Array[T] = js.native
  def freeze[T](collection: T): T = js.native
  def getIn[T](collection: T, path: js.Array[Double | String]): js.Any = js.native
  def map[T, U](fn: js.Function1[/* value */ T, U], array: js.Array[T]): js.Array[U] = js.native
  def merge[T, S1](target: T, source: S1): T with S1 = js.native
  def pop[T](array: js.Array[T]): js.Array[T] = js.native
  def push[T](array: js.Array[T], element: T): js.Array[T] = js.native
  def reverse[T](array: js.Array[T]): js.Array[T] = js.native
  def set[T, V](collection: T, key: String, value: V): T = js.native
  def set[T, V](collection: T, key: Double, value: V): T = js.native
  def setIn[T, V](collection: T, path: js.Array[Double | String], value: V): T = js.native
  def shift[T](array: js.Array[T]): js.Array[T] = js.native
  def slice[T](array: js.Array[T]): js.Array[T] = js.native
  def slice[T](array: js.Array[T], begin: Double): js.Array[T] = js.native
  def slice[T](array: js.Array[T], begin: Double, end: Double): js.Array[T] = js.native
  def sort[T](array: js.Array[T]): js.Array[T] = js.native
  def sort[T](array: js.Array[T], compareFunction: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  def splice[T](array: js.Array[T], start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
  def thaw[T](collection: T): T = js.native
  def unset[T](collection: T, key: String): T = js.native
  def unset[T](collection: T, key: Double): T = js.native
  def unsetIn[T](collection: T, path: js.Array[Double | String]): T = js.native
  def unshift[T](array: js.Array[T], element: T): js.Array[T] = js.native
  def updateIn[T, V](collection: T, path: js.Array[Double | String], callback: js.Function1[/* value */ V, V]): T = js.native
}

