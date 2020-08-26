package typings.knockout.mod.utils

import typings.knockout.mod.MaybeSubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "utils.stringifyJson")
@js.native
object stringifyJson extends js.Object {
  def apply(data: MaybeSubscribable[_]): String = js.native
  def apply(data: MaybeSubscribable[_], replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
  def apply(data: MaybeSubscribable[_], replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
  def apply(data: MaybeSubscribable[_], replacer: js.Function): String = js.native
  def apply(data: MaybeSubscribable[_], replacer: js.Function, space: String): String = js.native
  def apply(data: MaybeSubscribable[_], replacer: js.Function, space: Double): String = js.native
}

