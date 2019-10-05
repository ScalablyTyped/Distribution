package typings.atJupyterlabCoreutils.libInterfacesMod

import typings.atJupyterlabCoreutils.libInterfacesMod.IRestorable.IOptions
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IRestorer")
trait IRestorer_[T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V] extends js.Object {
  /**
    * A promise that settles when the collection has been restored.
    */
  val restored: js.Promise[V]
  /**
    * Restore the objects in a given restorable collection.
    *
    * @param restorable - The restorable collection being restored.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  def restore(restorable: T, options: IOptions[U]): js.Promise[V]
}

object IRestorer_ {
  @scala.inline
  def apply[T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V](restore: (T, IOptions[U]) => js.Promise[V], restored: js.Promise[V]): IRestorer_[T, U, V] = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction2(restore), restored = restored)
  
    __obj.asInstanceOf[IRestorer_[T, U, V]]
  }
}

