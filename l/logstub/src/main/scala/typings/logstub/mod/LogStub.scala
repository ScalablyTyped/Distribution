package typings.logstub.mod

import typings.logstub.anon.Pickthisdebuginfowarnerro
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogStub extends js.Object {
  
  def all(args: js.Any*): Unit = js.native
  
  def assert(args: js.Any*): Unit = js.native
  
  def child(args: js.Any*): Pickthisdebuginfowarnerro = js.native
  
  def clear(args: js.Any*): Unit = js.native
  
  def count(args: js.Any*): Unit = js.native
  
  def countReset(args: js.Any*): Unit = js.native
  
  def critical(args: js.Any*): Unit = js.native
  
  def debug(args: js.Any*): Unit = js.native
  
  def dir(args: js.Any*): Unit = js.native
  
  def dirxml(args: js.Any*): Unit = js.native
  
  def error(args: js.Any*): Unit = js.native
  
  def fatal(args: js.Any*): Unit = js.native
  
  def group(args: js.Any*): Unit = js.native
  
  def groupCollapsed(args: js.Any*): Unit = js.native
  
  def groupEnd(args: js.Any*): Unit = js.native
  
  def info(args: js.Any*): Unit = js.native
  
  def level(args: js.Any*): Double = js.native
  
  def log(args: js.Any*): Unit = js.native
  
  def silly(args: js.Any*): Unit = js.native
  
  def table(args: js.Any*): Unit = js.native
  
  def time(args: js.Any*): Unit = js.native
  
  def timeEnd(args: js.Any*): Unit = js.native
  
  def timeLog(args: js.Any*): Unit = js.native
  
  def trace(args: js.Any*): Unit = js.native
  
  def verbose(args: js.Any*): Unit = js.native
  
  def warn(args: js.Any*): Unit = js.native
}
object LogStub {
  
  @scala.inline
  def apply(
    all: /* repeated */ js.Any => Unit,
    assert: /* repeated */ js.Any => Unit,
    child: /* repeated */ js.Any => Pickthisdebuginfowarnerro,
    clear: /* repeated */ js.Any => Unit,
    count: /* repeated */ js.Any => Unit,
    countReset: /* repeated */ js.Any => Unit,
    critical: /* repeated */ js.Any => Unit,
    debug: /* repeated */ js.Any => Unit,
    dir: /* repeated */ js.Any => Unit,
    dirxml: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    fatal: /* repeated */ js.Any => Unit,
    group: /* repeated */ js.Any => Unit,
    groupCollapsed: /* repeated */ js.Any => Unit,
    groupEnd: /* repeated */ js.Any => Unit,
    info: /* repeated */ js.Any => Unit,
    level: /* repeated */ js.Any => Double,
    log: /* repeated */ js.Any => Unit,
    silly: /* repeated */ js.Any => Unit,
    table: /* repeated */ js.Any => Unit,
    time: /* repeated */ js.Any => Unit,
    timeEnd: /* repeated */ js.Any => Unit,
    timeLog: /* repeated */ js.Any => Unit,
    trace: /* repeated */ js.Any => Unit,
    verbose: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): LogStub = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), assert = js.Any.fromFunction1(assert), child = js.Any.fromFunction1(child), clear = js.Any.fromFunction1(clear), count = js.Any.fromFunction1(count), countReset = js.Any.fromFunction1(countReset), critical = js.Any.fromFunction1(critical), debug = js.Any.fromFunction1(debug), dir = js.Any.fromFunction1(dir), dirxml = js.Any.fromFunction1(dirxml), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), group = js.Any.fromFunction1(group), groupCollapsed = js.Any.fromFunction1(groupCollapsed), groupEnd = js.Any.fromFunction1(groupEnd), info = js.Any.fromFunction1(info), level = js.Any.fromFunction1(level), log = js.Any.fromFunction1(log), silly = js.Any.fromFunction1(silly), table = js.Any.fromFunction1(table), time = js.Any.fromFunction1(time), timeEnd = js.Any.fromFunction1(timeEnd), timeLog = js.Any.fromFunction1(timeLog), trace = js.Any.fromFunction1(trace), verbose = js.Any.fromFunction1(verbose), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[LogStub]
  }
  
  @scala.inline
  implicit class LogStubOps[Self <: LogStub] (val x: Self) extends AnyVal {
    
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
    def setAll(value: /* repeated */ js.Any => Unit): Self = this.set("all", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssert(value: /* repeated */ js.Any => Unit): Self = this.set("assert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChild(value: /* repeated */ js.Any => Pickthisdebuginfowarnerro): Self = this.set("child", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: /* repeated */ js.Any => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: /* repeated */ js.Any => Unit): Self = this.set("count", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCountReset(value: /* repeated */ js.Any => Unit): Self = this.set("countReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCritical(value: /* repeated */ js.Any => Unit): Self = this.set("critical", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDir(value: /* repeated */ js.Any => Unit): Self = this.set("dir", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDirxml(value: /* repeated */ js.Any => Unit): Self = this.set("dirxml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFatal(value: /* repeated */ js.Any => Unit): Self = this.set("fatal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroup(value: /* repeated */ js.Any => Unit): Self = this.set("group", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupCollapsed(value: /* repeated */ js.Any => Unit): Self = this.set("groupCollapsed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupEnd(value: /* repeated */ js.Any => Unit): Self = this.set("groupEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevel(value: /* repeated */ js.Any => Double): Self = this.set("level", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSilly(value: /* repeated */ js.Any => Unit): Self = this.set("silly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTable(value: /* repeated */ js.Any => Unit): Self = this.set("table", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTime(value: /* repeated */ js.Any => Unit): Self = this.set("time", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeEnd(value: /* repeated */ js.Any => Unit): Self = this.set("timeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeLog(value: /* repeated */ js.Any => Unit): Self = this.set("timeLog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrace(value: /* repeated */ js.Any => Unit): Self = this.set("trace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerbose(value: /* repeated */ js.Any => Unit): Self = this.set("verbose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
}
