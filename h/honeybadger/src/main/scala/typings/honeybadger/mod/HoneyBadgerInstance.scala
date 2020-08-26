package typings.honeybadger.mod

import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoneyBadgerInstance extends EventEmitter {
  @JSName("errorHandler")
  var errorHandler_Original: ErrorRequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSName("requestHandler")
  var requestHandler_Original: RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def configure(options: ConfigureOptions): Unit = js.native
  def errorHandler(err: js.Any, req: Request[ParamsDictionary, _, _, Query], res: Response[_], next: NextFunction): js.Any = js.native
  def factory(): HoneyBadgerInstance = js.native
  def factory(options: ConfigureOptions): HoneyBadgerInstance = js.native
  def lambdaHandler(handler: LambdaHandler): LambdaHandler = js.native
  def notify(
    err: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    extra: js.UndefOr[scala.Nothing],
    callback: CallbackFunction
  ): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], extra: CallbackFunction): Unit = js.native
  def notify(
    err: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    extra: CallbackFunction,
    callback: CallbackFunction
  ): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], extra: metadata): Unit = js.native
  def notify(
    err: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    extra: metadata,
    callback: CallbackFunction
  ): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.Any): Unit = js.native
  def notify(
    err: js.UndefOr[scala.Nothing],
    name: js.Any,
    extra: js.UndefOr[scala.Nothing],
    callback: CallbackFunction
  ): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: CallbackFunction): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: metadata): Unit = js.native
  def notify(err: js.UndefOr[scala.Nothing], name: js.Any, extra: metadata, callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any): Unit = js.native
  def notify(
    err: js.Any,
    name: js.UndefOr[scala.Nothing],
    extra: js.UndefOr[scala.Nothing],
    callback: CallbackFunction
  ): Unit = js.native
  def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: metadata): Unit = js.native
  def notify(err: js.Any, name: js.UndefOr[scala.Nothing], extra: metadata, callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: js.UndefOr[scala.Nothing], callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: CallbackFunction, callback: CallbackFunction): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: metadata): Unit = js.native
  def notify(err: js.Any, name: js.Any, extra: metadata, callback: CallbackFunction): Unit = js.native
  def onUncaughtException(func: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def requestHandler(req: Request[ParamsDictionary, _, _, Query], res: Response[_], next: NextFunction): js.Any = js.native
  def resetContext(): Unit = js.native
  def resetContext(context: js.Object): Unit = js.native
  def setContext(context: js.Object): Unit = js.native
}

