package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class which defines instances created via:  WL.Logger.create({pkg: 'something'});
  * Actual definition is outside of WL namespace. For easier d.ts file compiling it is here
  */
@js.native
trait LogInstance extends js.Object {
  
  def debug(message: String): Unit = js.native
  
  def error(message: String): Unit = js.native
  
  def fatal(message: String): Unit = js.native
  
  def info(message: String): Unit = js.native
  
  def trace(message: String): Unit = js.native
  
  def warn(message: String): Unit = js.native
}
object LogInstance {
  
  @scala.inline
  def apply(
    debug: String => Unit,
    error: String => Unit,
    fatal: String => Unit,
    info: String => Unit,
    trace: String => Unit,
    warn: String => Unit
  ): LogInstance = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[LogInstance]
  }
  
  @scala.inline
  implicit class LogInstanceOps[Self <: LogInstance] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: String => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: String => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFatal(value: String => Unit): Self = this.set("fatal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: String => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrace(value: String => Unit): Self = this.set("trace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: String => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
}
