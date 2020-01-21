package typings.ionicCliFramework.loggerMod

import typings.node.NodeJS.WritableStream
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/logger", "StreamHandler")
@js.native
class StreamHandler protected () extends LoggerHandler {
  def this(hasStreamFilterFormatter: StreamHandlerOptions) = this()
  val filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.native
  val stream: WritableStream = js.native
  def clone(opts: Partial[StreamHandlerOptions]): StreamHandler = js.native
  /* CompleteClass */
  override def handle(record: LogRecord): Unit = js.native
}

