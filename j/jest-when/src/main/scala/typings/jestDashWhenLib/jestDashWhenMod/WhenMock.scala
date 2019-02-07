package typings
package jestDashWhenLib.jestDashWhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhenMock[T, Y /* <: js.Array[_] */]
  extends jestLib.jestNs.Mock[T, Y] {
  def calledWith(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param matchers because its type Y is not an array type */ matchers: Y
  ): WhenMock[T, Y] = js.native
  def expectCalledWith(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param matchers because its type Y is not an array type */ matchers: Y
  ): WhenMock[T, Y] = js.native
  def mockRejectedValue(value: T): WhenMock[js.Promise[T], Y] = js.native
  def mockRejectedValue(value: js.Thenable[T]): WhenMock[js.Promise[T], Y] = js.native
  def mockRejectedValueOnce(value: T): WhenMock[js.Promise[T], Y] = js.native
  def mockRejectedValueOnce(value: js.Thenable[T]): WhenMock[js.Promise[T], Y] = js.native
}

