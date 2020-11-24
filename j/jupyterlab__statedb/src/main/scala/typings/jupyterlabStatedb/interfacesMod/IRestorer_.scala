package typings.jupyterlabStatedb.interfacesMod

import typings.jupyterlabStatedb.interfacesMod.IRestorable.IOptions
import typings.luminoDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRestorer_[T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V] extends js.Object {
  
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
  def restore(restorable: T, options: IOptions[U]): js.Promise[V] = js.native
  
  /**
    * A promise that settles when the collection has been restored.
    */
  val restored: js.Promise[V] = js.native
}
object IRestorer_ {
  
  @scala.inline
  def apply[T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V](restore: (T, IOptions[U]) => js.Promise[V], restored: js.Promise[V]): IRestorer_[T, U, V] = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction2(restore), restored = restored.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestorer_[T, U, V]]
  }
  
  @scala.inline
  implicit class IRestorer_Ops[Self <: IRestorer_[_, _, _], T /* <: IRestorable[U, _] */, U /* <: IObservableDisposable */, V] (val x: Self with (IRestorer_[T, U, V])) extends AnyVal {
    
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
    def setRestore(value: (T, IOptions[U]) => js.Promise[V]): Self = this.set("restore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRestored(value: js.Promise[V]): Self = this.set("restored", value.asInstanceOf[js.Any])
  }
}
