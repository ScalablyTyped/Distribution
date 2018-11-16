package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/logger", "StreamHandler")
@js.native
class StreamHandler protected () extends LoggerHandler {
  def this(hasStreamFilterFormatter: StreamHandlerOptions) = this()
  val filter: js.UndefOr[js.Function1[/* record */ LogRecord, scala.Boolean]] = js.native
  val stream: nodeLib.NodeJSNs.WritableStream = js.native
  def clone(opts: stdLib.Partial[StreamHandlerOptions]): StreamHandler = js.native
  /* CompleteClass */
  override def handle(record: LogRecord): scala.Unit = js.native
}

