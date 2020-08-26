package typings.ionicCliFramework.loggerMod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamHandlerOptions extends js.Object {
  val filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.native
  val formatter: js.UndefOr[LoggerFormatter] = js.native
  val stream: WritableStream = js.native
}

object StreamHandlerOptions {
  @scala.inline
  def apply(stream: WritableStream): StreamHandlerOptions = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamHandlerOptions]
  }
  @scala.inline
  implicit class StreamHandlerOptionsOps[Self <: StreamHandlerOptions] (val x: Self) extends AnyVal {
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
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: /* record */ LogRecord => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFormatter(value: /* record */ LogRecord => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
  }
  
}

