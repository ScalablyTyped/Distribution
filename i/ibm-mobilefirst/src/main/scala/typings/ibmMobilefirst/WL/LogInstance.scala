package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class which defines instances created via:  WL.Logger.create({pkg: 'something'});
  * Actual definition is outside of WL namespace. For easier d.ts file compiling it is here
  */
trait LogInstance extends StObject {
  
  def debug(message: String): Unit
  
  def error(message: String): Unit
  
  def fatal(message: String): Unit
  
  def info(message: String): Unit
  
  def trace(message: String): Unit
  
  def warn(message: String): Unit
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
  implicit class LogInstanceMutableBuilder[Self <: LogInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: String => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFatal(value: String => Unit): Self = StObject.set(x, "fatal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrace(value: String => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
