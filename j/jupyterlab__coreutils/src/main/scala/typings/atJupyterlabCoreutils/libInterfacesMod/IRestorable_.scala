package typings.atJupyterlabCoreutils.libInterfacesMod

import typings.atJupyterlabCoreutils.libInterfacesMod.IRestorable.IOptions
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IRestorable")
trait IRestorable_[T /* <: IObservableDisposable */, U] extends js.Object {
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
  def restore(options: IOptions[T]): js.Promise[U]
}

object IRestorable_ {
  @scala.inline
  def apply[T /* <: IObservableDisposable */, U](restore: IOptions[T] => js.Promise[U], restored: js.Promise[U]): IRestorable_[T, U] = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction1(restore), restored = restored.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRestorable_[T, U]]
  }
}

