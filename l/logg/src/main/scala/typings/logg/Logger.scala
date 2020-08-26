package typings.logg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  def error(var_args: js.Any*): Unit = js.native
  def fine(var_args: js.Any*): Unit = js.native
  def getLogLevel(): Double = js.native
  def getParent(): Logger = js.native
  def getWatchers(): js.Array[js.Function] = js.native
  def info(var_args: js.Any*): Unit = js.native
  def isLoggable(level: Double): Boolean = js.native
  def log(level: Double, var_args: js.Any*): Unit = js.native
  def registerWatcher(watcher: js.Function1[/* logRecord */ String, Unit]): Unit = js.native
  def setLogLevel(level: Double): Unit = js.native
  def setParent(logger: Logger): Unit = js.native
  def warn(var_args: js.Any*): Unit = js.native
}

object Logger {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => Unit,
    fine: /* repeated */ js.Any => Unit,
    getLogLevel: () => Double,
    getParent: () => Logger,
    getWatchers: () => js.Array[js.Function],
    info: /* repeated */ js.Any => Unit,
    isLoggable: Double => Boolean,
    log: (Double, /* repeated */ js.Any) => Unit,
    registerWatcher: js.Function1[/* logRecord */ String, Unit] => Unit,
    setLogLevel: Double => Unit,
    setParent: Logger => Unit,
    warn: /* repeated */ js.Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), fine = js.Any.fromFunction1(fine), getLogLevel = js.Any.fromFunction0(getLogLevel), getParent = js.Any.fromFunction0(getParent), getWatchers = js.Any.fromFunction0(getWatchers), info = js.Any.fromFunction1(info), isLoggable = js.Any.fromFunction1(isLoggable), log = js.Any.fromFunction2(log), registerWatcher = js.Any.fromFunction1(registerWatcher), setLogLevel = js.Any.fromFunction1(setLogLevel), setParent = js.Any.fromFunction1(setParent), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
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
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setFine(value: /* repeated */ js.Any => Unit): Self = this.set("fine", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLogLevel(value: () => Double): Self = this.set("getLogLevel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParent(value: () => Logger): Self = this.set("getParent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWatchers(value: () => js.Array[js.Function]): Self = this.set("getWatchers", js.Any.fromFunction0(value))
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def setIsLoggable(value: Double => Boolean): Self = this.set("isLoggable", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: (Double, /* repeated */ js.Any) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterWatcher(value: js.Function1[/* logRecord */ String, Unit] => Unit): Self = this.set("registerWatcher", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLogLevel(value: Double => Unit): Self = this.set("setLogLevel", js.Any.fromFunction1(value))
    @scala.inline
    def setSetParent(value: Logger => Unit): Self = this.set("setParent", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

