package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// when not AMD, add to ko object
@js.native
trait KnockoutStatic extends js.Object {
  @JSName("DirtyFlag")
  var DirtyFlag_Original: DirtyFlag = js.native
  def DirtyFlag(): DirtyFlagResult = js.native
  def asyncCommand(options: KoLiteCommandOptions): KoliteAsyncCommand = js.native
  def command(options: KoLiteCommandOptions): KoliteCommand = js.native
}

