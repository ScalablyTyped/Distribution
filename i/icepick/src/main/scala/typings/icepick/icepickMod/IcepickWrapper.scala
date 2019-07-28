package typings.icepick.icepickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

