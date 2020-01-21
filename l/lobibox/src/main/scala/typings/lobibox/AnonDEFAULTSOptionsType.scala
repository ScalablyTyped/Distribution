package typings.lobibox

import typings.lobibox.LobiboxModule.LobiboxStatic
import typings.lobibox.LobiboxModule.MessageBoxesDefault
import typings.lobibox.LobiboxModule.PromptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDEFAULTSOptionsType extends js.Object {
  var DEFAULTS: PromptOptions = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
}

