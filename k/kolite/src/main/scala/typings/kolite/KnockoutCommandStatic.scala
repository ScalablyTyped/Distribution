package typings.kolite

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
    asyncCommand: KoLiteCommandOptions => KoliteAsyncCommand,
    command: KoLiteCommandOptions => KoliteCommand
  ): KnockoutCommandStatic = {
    val __obj = js.Dynamic.literal(asyncCommand = js.Any.fromFunction1(asyncCommand), command = js.Any.fromFunction1(command))
  
    __obj.asInstanceOf[KnockoutCommandStatic]
  }
}

