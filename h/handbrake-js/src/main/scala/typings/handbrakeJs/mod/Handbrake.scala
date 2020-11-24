package typings.handbrakeJs.mod

import typings.handbrakeJs.handbrakeJsStrings.begin
import typings.handbrakeJs.handbrakeJsStrings.cancelled
import typings.handbrakeJs.handbrakeJsStrings.complete
import typings.handbrakeJs.handbrakeJsStrings.end
import typings.handbrakeJs.handbrakeJsStrings.error
import typings.handbrakeJs.handbrakeJsStrings.progress
import typings.handbrakeJs.handbrakeJsStrings.start
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handbrake extends EventEmitter {
  
  def cancel(): Unit = js.native
  
  val eError: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HandbrakeErrors */ js.Any = js.native
  
  @JSName("on")
  def on_begin(event: begin, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_cancelled(event: cancelled, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_complete(event: complete, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_output(event: typings.handbrakeJs.handbrakeJsStrings.output, cb: js.Function1[/* output */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, cb: js.Function1[/* progress */ HandbrakeProgress, Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
  
  val options: HandbrakeOptions = js.native
  
  val output: String = js.native
}
