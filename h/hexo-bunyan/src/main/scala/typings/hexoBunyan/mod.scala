package typings.hexoBunyan

import typings.bunyan.mod.LogLevel
import typings.bunyan.mod.Logger
import typings.bunyan.mod.LoggerOptions
import typings.bunyan.mod.RingBufferOptions
import typings.bunyan.mod.RotatingFileStreamOptions
import typings.bunyan.mod.StdSerializers_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hexo-bunyan", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typings.bunyan.mod.^ {
    def this(options: LoggerOptions) = this()
  }
  @JSImport("hexo-bunyan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hexo-bunyan", "DEBUG")
  @js.native
  val DEBUG: Double = js.native
  
  @JSImport("hexo-bunyan", "ERROR")
  @js.native
  val ERROR: Double = js.native
  
  @JSImport("hexo-bunyan", "FATAL")
  @js.native
  val FATAL: Double = js.native
  
  @JSImport("hexo-bunyan", "INFO")
  @js.native
  val INFO: Double = js.native
  
  @JSImport("hexo-bunyan", "RingBuffer")
  @js.native
  class RingBuffer protected ()
    extends typings.bunyan.mod.RingBuffer {
    def this(options: RingBufferOptions) = this()
  }
  
  @JSImport("hexo-bunyan", "RotatingFileStream")
  @js.native
  class RotatingFileStream protected ()
    extends typings.bunyan.mod.RotatingFileStream {
    def this(options: RotatingFileStreamOptions) = this()
  }
  
  @JSImport("hexo-bunyan", "TRACE")
  @js.native
  val TRACE: Double = js.native
  
  @JSImport("hexo-bunyan", "WARN")
  @js.native
  val WARN: Double = js.native
  
  @scala.inline
  def createLogger(options: LoggerOptions): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(options.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  /* Inlined {[ name in bunyan.bunyan.LogLevelString ]: number} */
  object levelFromName {
    
    @JSImport("hexo-bunyan", "levelFromName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hexo-bunyan", "levelFromName.debug")
    @js.native
    def debug: Double = js.native
    @scala.inline
    def debug_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.error")
    @js.native
    def error: Double = js.native
    @scala.inline
    def error_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.fatal")
    @js.native
    def fatal: Double = js.native
    @scala.inline
    def fatal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fatal")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.info")
    @js.native
    def info: Double = js.native
    @scala.inline
    def info_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.trace")
    @js.native
    def trace: Double = js.native
    @scala.inline
    def trace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
    
    @JSImport("hexo-bunyan", "levelFromName.warn")
    @js.native
    def warn: Double = js.native
    @scala.inline
    def warn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def resolveLevel(value: LogLevel): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLevel")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def safeCycles(): js.Function2[/* key */ String, /* value */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeCycles")().asInstanceOf[js.Function2[/* key */ String, /* value */ js.Any, js.Any]]
  
  @JSImport("hexo-bunyan", "stdSerializers")
  @js.native
  val stdSerializers: StdSerializers_ = js.native
}
