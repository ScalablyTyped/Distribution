package typings.jupyterlabStatedb.interfacesMod.IRestorer

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  *
  * @typeparam T - The type of object held by the restorable collection.
  */
@js.native
trait IOptions[T /* <: IObservableDisposable */] extends js.Object {
  /**
    * A function that returns the args needed to restore an instance.
    */
  var args: js.UndefOr[js.Function1[/* obj */ T, ReadonlyPartialJSONObject]] = js.native
  /**
    * The command to execute when restoring instances.
    */
  var command: String = js.native
  /**
    * The point after which it is safe to restore state.
    */
  var when: js.UndefOr[js.Promise[_] | js.Array[js.Promise[_]]] = js.native
  /**
    * A function that returns a unique persistent name for this instance.
    */
  def name(obj: T): String = js.native
}

object IOptions {
  @scala.inline
  def apply[/* <: typings.luminoDisposable.mod.IObservableDisposable */ T](command: String, name: T => String): IOptions[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], name = js.Any.fromFunction1(name))
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], /* <: typings.luminoDisposable.mod.IObservableDisposable */ T] (val x: Self with IOptions[T]) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: T => String): Self = this.set("name", js.Any.fromFunction1(value))
    @scala.inline
    def setArgs(value: /* obj */ T => ReadonlyPartialJSONObject): Self = this.set("args", js.Any.fromFunction1(value))
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setWhenVarargs(value: js.Promise[js.Any]*): Self = this.set("when", js.Array(value :_*))
    @scala.inline
    def setWhen(value: js.Promise[_] | js.Array[js.Promise[_]]): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
  
}

