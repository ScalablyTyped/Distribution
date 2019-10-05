package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distOptionsMod.KnownOptions
import typings.grammarkdown.distOptionsMod.ParsedArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "parse")
@js.native
object parse extends js.Object {
  def apply[T /* <: ParsedArguments */](options: KnownOptions): js.UndefOr[T] = js.native
  def apply[T /* <: ParsedArguments */](options: KnownOptions, args: js.Array[String]): js.UndefOr[T] = js.native
}

