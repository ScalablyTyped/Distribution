package typings.honeybadger.honeybadgerMod

import typings.express.expressMod.ErrorRequestHandler
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoneyBadgerInstance extends EventEmitter {
  @JSName("errorHandler")
  var errorHandler_Original: ErrorRequestHandler = js.native
  @JSName("requestHandler")
  var requestHandler_Original: RequestHandler = js.native
  def configure(options: ConfigureOptions): Unit = js.native
  def errorHandler(err: js.Any, req: Request[ParamsDictionary], res: Response, next: NextFunction): js.Any = js.native
  def factory(): HoneyBadgerInstance = js.native
  def factory(options: ConfigureOptions): HoneyBadgerInstance = js.native
  def lambdaHandler(handler: LambdaHandler): LambdaHandler = js.native
  def notify(err: js.Any): Unit = js.native
  def notify(err: js.Any, name: js.Any): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: metadata): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: metadata, callback: CallbackFunction): Unit = js.native
  def onUncaughtException(func: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def requestHandler(req: Request[ParamsDictionary], res: Response, next: NextFunction): js.Any = js.native
  def resetContext(): Unit = js.native
  def resetContext(context: js.Object): Unit = js.native
  def setContext(context: js.Object): Unit = js.native
}

