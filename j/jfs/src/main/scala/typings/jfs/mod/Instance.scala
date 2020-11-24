package typings.jfs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance[T] extends js.Object {
  
  def all(cb: js.Function2[/* err */ js.UndefOr[Error], /* all */ js.UndefOr[T], Unit]): Unit = js.native
  
  def allSync(): T = js.native
  
  def delete[K /* <: /* keyof T */ String */](id: K): Unit = js.native
  def delete[K /* <: /* keyof T */ String */](id: K, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def deleteSync[K /* <: /* keyof T */ String */](id: K): Error | Unit = js.native
  
  def get[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K): Unit = js.native
  def get[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, cb: js.Function2[/* err */ js.UndefOr[Error], /* o */ js.UndefOr[V], Unit]): Unit = js.native
  
  def getSync[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K): V | Error = js.native
  
  def save[V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](o: V): Unit = js.native
  def save[V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](o: V, cb: js.Function2[/* err */ js.UndefOr[Error], /* id */ js.UndefOr[String], Unit]): Unit = js.native
  def save[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, o: V): Unit = js.native
  def save[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, o: V, cb: js.Function2[/* err */ js.UndefOr[Error], /* id */ js.UndefOr[K], Unit]): Unit = js.native
  
  def saveSync[V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](o: V): Unit = js.native
  def saveSync[K /* <: /* keyof T */ String */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any */](id: K, o: V): Unit = js.native
}
