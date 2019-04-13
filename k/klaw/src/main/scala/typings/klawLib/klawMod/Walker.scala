package typings
package klawLib.klawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Walker
  extends nodeLib.streamMod.Readable {
  def on(event: Event, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_close(event: klawLib.klawLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: klawLib.klawLibStrings.data, listener: js.Function1[/* item */ Item, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: klawLib.klawLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: klawLib.klawLibStrings.error, listener: js.Function1[/* err */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: klawLib.klawLibStrings.readable, listener: js.Function0[scala.Unit]): this.type = js.native
}

