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

