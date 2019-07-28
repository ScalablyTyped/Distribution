package typings.jfs.jfsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance[T] extends js.Object {
  def all(cb: js.Function2[/* err */ js.UndefOr[Error], /* all */ js.UndefOr[T], Unit]): Unit = js.native
  def allSync(): T = js.native
  def delete[K /* <: String */](id: K): Unit = js.native
  def delete[K /* <: String */](id: K, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def deleteSync[K /* <: String */](id: K): Error | Unit = js.native
  def get[K /* <: String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K): Unit = js.native
  def get[K /* <: String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K, cb: js.Function2[/* err */ js.UndefOr[Error], /* o */ js.UndefOr[V], Unit]): Unit = js.native
  def getSync[K /* <: String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K): V | Error = js.native
  def save[V /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](o: V): Unit = js.native
  def save[V /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](o: V, cb: js.Function2[/* err */ js.UndefOr[Error], /* id */ js.UndefOr[String], Unit]): Unit = js.native
  def save[K /* <: String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K, o: V): Unit = js.native
  def save[K /* <: String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K, o: V, cb: js.Function2[/* err */ js.UndefOr[Error], /* id */ js.UndefOr[K], Unit]): Unit = js.native
  def saveSync[V /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](o: V): Unit = js.native
  def saveSync[K /* <: String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K, o: V): Unit = js.native
}

