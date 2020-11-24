package typings.ionicCliFramework.anon

import typings.ionicCliFramework.loggerMod.LogRecord
import typings.ionicCliFramework.loggerMod.LoggerFormatter
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/logger.StreamHandlerOptions> */
@js.native
trait PartialStreamHandlerOptio extends js.Object {
  
  var filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.native
  
  var formatter: js.UndefOr[LoggerFormatter] = js.native
  
  var stream: js.UndefOr[WritableStream] = js.native
}
object PartialStreamHandlerOptio {
  
  @scala.inline
  def apply(): PartialStreamHandlerOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStreamHandlerOptio]
  }
  
  @scala.inline
  implicit class PartialStreamHandlerOptioOps[Self <: PartialStreamHandlerOptio] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: /* record */ LogRecord => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* record */ LogRecord => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
}
