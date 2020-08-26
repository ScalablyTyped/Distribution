package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// when using AMD, it is exported
@js.native
trait KnockoutCommandStatic extends js.Object {
  def asyncCommand(options: KoLiteCommandOptions): KoliteAsyncCommand = js.native
  def command(options: KoLiteCommandOptions): KoliteCommand = js.native
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
  @scala.inline
  implicit class KnockoutCommandStaticOps[Self <: KnockoutCommandStatic] (val x: Self) extends AnyVal {
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
    def setAsyncCommand(value: KoLiteCommandOptions => KoliteAsyncCommand): Self = this.set("asyncCommand", js.Any.fromFunction1(value))
    @scala.inline
    def setCommand(value: KoLiteCommandOptions => KoliteCommand): Self = this.set("command", js.Any.fromFunction1(value))
  }
  
}

