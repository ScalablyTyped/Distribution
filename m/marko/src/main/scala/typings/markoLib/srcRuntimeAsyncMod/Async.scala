package typings
package markoLib.srcRuntimeAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Async
  extends nodeLib.eventsMod.EventEmitter
     with stdLib.Promise[js.Any] {
  def beginAsync(): this.type = js.native
  def beginAsync(options: js.Any): this.type = js.native
  def c(componentDef: js.Any, key: js.Any, customEvents: js.Any): scala.Unit = js.native
  def createOut(): this.type = js.native
  def endElement(): scala.Unit = js.native
  def error(e: stdLib.Error): this.type = js.native
  def flush(): scala.Unit = js.native
  def isSync(): scala.Boolean = js.native
  def onLast(callback: js.Any): this.type = js.native
  def sync(): scala.Unit = js.native
  def w(): this.type = js.native
  def w(str: java.lang.String): this.type = js.native
  def write(): this.type = js.native
  def write(str: java.lang.String): this.type = js.native
}

