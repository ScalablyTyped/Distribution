package typings.ionicCliFramework.loggerMod

import typings.ionicCliFramework.anon.PartialStreamHandlerOptio
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/logger", "StreamHandler")
@js.native
class StreamHandler protected () extends LoggerHandler {
  def this(hasStreamFilterFormatter: StreamHandlerOptions) = this()
  
  def clone(opts: PartialStreamHandlerOptio): StreamHandler = js.native
  
  val filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.native
  
  val stream: WritableStream = js.native
}
