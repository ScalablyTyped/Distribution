package typings.grpcGrpcJs.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitterAugmentation1[Name /* <: String | js.Symbol */, Arg] extends js.Object {
  def addListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
  def emit(event: Name, arg1: Arg): Boolean = js.native
  def on(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
  def once(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
  def prependListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
  def prependOnceListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
  def removeListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type = js.native
}

object EmitterAugmentation1 {
  @scala.inline
  def apply[/* <: java.lang.String | js.Symbol */ Name, Arg](
    addListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
    emit: (Name, Arg) => Boolean,
    on: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
    once: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
    prependListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
    prependOnceListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg],
    removeListener: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]
  ): EmitterAugmentation1[Name, Arg] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[EmitterAugmentation1[Name, Arg]]
  }
  @scala.inline
  implicit class EmitterAugmentation1Ops[Self <: EmitterAugmentation1[_, _], /* <: java.lang.String | js.Symbol */ Name, Arg] (val x: Self with (EmitterAugmentation1[Name, Arg])) extends AnyVal {
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
    def setAddListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = this.set("addListener", js.Any.fromFunction2(value))
    @scala.inline
    def setEmit(value: (Name, Arg) => Boolean): Self = this.set("emit", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setOnce(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = this.set("once", js.Any.fromFunction2(value))
    @scala.inline
    def setPrependListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = this.set("prependListener", js.Any.fromFunction2(value))
    @scala.inline
    def setPrependOnceListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = this.set("prependOnceListener", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveListener(value: (Name, js.Function1[/* arg1 */ Arg, Unit]) => EmitterAugmentation1[Name, Arg]): Self = this.set("removeListener", js.Any.fromFunction2(value))
  }
  
}

