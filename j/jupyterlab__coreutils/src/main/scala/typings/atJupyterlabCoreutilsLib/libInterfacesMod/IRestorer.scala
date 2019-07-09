package typings
package atJupyterlabCoreutilsLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestorer[T /* <: IRestorable[U, _] */, U /* <: atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable */, V] extends js.Object {
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
  def restore(restorable: T, options: atJupyterlabCoreutilsLib.libInterfacesMod.IRestorableNs.IOptions[U]): js.Promise[V]
}

object IRestorer {
  @scala.inline
  def apply[T /* <: IRestorable[U, _] */, U /* <: atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable */, V](
    restore: (T, atJupyterlabCoreutilsLib.libInterfacesMod.IRestorableNs.IOptions[U]) => js.Promise[V],
    restored: js.Promise[V]
  ): IRestorer[T, U, V] = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction2(restore), restored = restored)
  
    __obj.asInstanceOf[IRestorer[T, U, V]]
  }
}

