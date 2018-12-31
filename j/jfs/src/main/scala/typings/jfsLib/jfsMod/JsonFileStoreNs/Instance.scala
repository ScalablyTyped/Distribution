package typings
package jfsLib.jfsMod.JsonFileStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance[T] extends js.Object {
  def all(cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* all */ js.UndefOr[T], scala.Unit]): scala.Unit = js.native
  def allSync(): T = js.native
  def delete[K /* <: java.lang.String */](id: K): scala.Unit = js.native
  def delete[K /* <: java.lang.String */](id: K, cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def deleteSync[K /* <: java.lang.String */](id: K): stdLib.Error | scala.Unit = js.native
  def get[K /* <: java.lang.String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K): scala.Unit = js.native
  def get[K /* <: java.lang.String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K, cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* o */ js.UndefOr[V], scala.Unit]): scala.Unit = js.native
  def getSync[K /* <: java.lang.String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K): V | stdLib.Error = js.native
  def save[V /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](o: V): scala.Unit = js.native
  def save[V /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    o: V,
    cb: js.Function2[
      /* err */ js.UndefOr[stdLib.Error], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def save[K /* <: java.lang.String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K, o: V): scala.Unit = js.native
  def save[K /* <: java.lang.String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](
    id: K,
    o: V,
    cb: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* id */ js.UndefOr[K], scala.Unit]
  ): scala.Unit = js.native
  def saveSync[V /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](o: V): scala.Unit = js.native
  def saveSync[K /* <: java.lang.String */, V /* <: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any */](id: K, o: V): scala.Unit = js.native
}

