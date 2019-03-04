package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// when using AMD, it is exported
trait KnockoutCommandStatic extends js.Object {
  def asyncCommand(options: KoLiteCommandOptions): KoliteAsyncCommand
  def command(options: KoLiteCommandOptions): KoliteCommand
}

object KnockoutCommandStatic {
  @scala.inline
  def apply(
    asyncCommand: js.Function1[KoLiteCommandOptions, KoliteAsyncCommand],
    command: js.Function1[KoLiteCommandOptions, KoliteCommand]
  ): KnockoutCommandStatic = {
    val __obj = js.Dynamic.literal(asyncCommand = asyncCommand, command = command)
  
    __obj.asInstanceOf[KnockoutCommandStatic]
  }
}

