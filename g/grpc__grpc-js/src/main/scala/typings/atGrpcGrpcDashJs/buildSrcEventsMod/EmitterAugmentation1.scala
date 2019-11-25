package typings.atGrpcGrpcDashJs.buildSrcEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitterAugmentation1[Name /* <: String | js.Symbol */, Arg] extends js.Object {
  def addListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
  def emit(event: Name, arg1: Arg): Boolean
  def on(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
  def once(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
  def prependListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
  def prependOnceListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
  def removeListener(event: Name, listener: js.Function1[/* arg1 */ Arg, Unit]): this.type
}

object EmitterAugmentation1 {
  @scala.inline
  def apply[Name /* <: String | js.Symbol */, Arg](
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
}

