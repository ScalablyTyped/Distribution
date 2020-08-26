package typings.jupyterlabStatedb.interfacesMod

import typings.jupyterlabStatedb.interfacesMod.IRestorable.IOptions
import typings.luminoDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRestorable_[T /* <: IObservableDisposable */, U] extends js.Object {
  /**
    * A promise that settles when the collection has been restored.
    */
  val restored: js.Promise[U] = js.native
  /**
    * Restore the objects in this restorable collection.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  def restore(options: IOptions[T]): js.Promise[U] = js.native
}

object IRestorable_ {
  @scala.inline
  def apply[/* <: typings.luminoDisposable.mod.IObservableDisposable */ T, U](restore: IOptions[T] => js.Promise[U], restored: js.Promise[U]): IRestorable_[T, U] = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction1(restore), restored = restored.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestorable_[T, U]]
  }
  @scala.inline
  implicit class IRestorable_Ops[Self <: IRestorable_[_, _], /* <: typings.luminoDisposable.mod.IObservableDisposable */ T, U] (val x: Self with (IRestorable_[T, U])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRestore(value: IOptions[T] => js.Promise[U]): Self = this.set("restore", js.Any.fromFunction1(value))
    @scala.inline
    def setRestored(value: js.Promise[U]): Self = this.set("restored", value.asInstanceOf[js.Any])
  }
  
}

