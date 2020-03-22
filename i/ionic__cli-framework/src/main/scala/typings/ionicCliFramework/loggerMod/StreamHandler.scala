package typings.ionicCliFramework.loggerMod

import typings.ionicCliFramework.PartialStreamHandlerOptio
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/logger", "StreamHandler")
@js.native
class StreamHandler protected () extends LoggerHandler {
  def this(hasStreamFilterFormatter: StreamHandlerOptions) = this()
  val filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.native
  val stream: WritableStream = js.native
  def clone(opts: PartialStreamHandlerOptio): StreamHandler = js.native
  /* CompleteClass */
  override def handle(record: LogRecord): Unit = js.native
}

