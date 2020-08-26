package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "ignoreDependencies")
@js.native
object ignoreDependencies extends js.Object {
  def apply[Return, Target, Args /* <: js.Array[_] */](callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return]): Return = js.native
  def apply[Return, Target, Args /* <: js.Array[_] */](callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return], callbackTarget: Target): Return = js.native
  def apply[Return, Target, Args /* <: js.Array[_] */](
    callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return],
    callbackTarget: Target,
    callbackArgs: Args
  ): Return = js.native
  def apply[Return, Target, Args /* <: js.Array[_] */](
    callback: js.ThisFunction1[/* this */ Target, /* args */ Args, Return],
    callbackTarget: js.UndefOr[scala.Nothing],
    callbackArgs: Args
  ): Return = js.native
}

