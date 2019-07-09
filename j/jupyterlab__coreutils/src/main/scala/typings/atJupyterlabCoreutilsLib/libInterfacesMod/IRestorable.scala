package typings
package atJupyterlabCoreutilsLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestorable[T /* <: atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable */, U] extends js.Object {
  /**
    * A promise that settles when the collection has been restored.
    */
  val restored: js.Promise[U]
  /**
    * Restore the objects in this restorable collection.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  def restore(options: atJupyterlabCoreutilsLib.libInterfacesMod.IRestorableNs.IOptions[T]): js.Promise[U]
}

object IRestorable {
  @scala.inline
  def apply[T /* <: atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable */, U](
    restore: atJupyterlabCoreutilsLib.libInterfacesMod.IRestorableNs.IOptions[T] => js.Promise[U],
    restored: js.Promise[U]
  ): IRestorable[T, U] = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction1(restore), restored = restored)
  
    __obj.asInstanceOf[IRestorable[T, U]]
  }
}

