package typings.loglevelnext

import org.scalablytyped.runtime.Shortcut
import typings.loglevelnext.logLevelMod.LogLevelOptions
import typings.loglevelnext.prefixFactoryMod.PrefixFactoryOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("loglevelnext/dist", JSImport.Default)
  @js.native
  val default: DefaultLogger = js.native
  
  @JSImport("loglevelnext/dist", "LogLevel")
  @js.native
  open class LogLevel protected ()
    extends typings.loglevelnext.logLevelMod.LogLevel {
    def this(options: LogLevelOptions) = this()
  }
  
  @JSImport("loglevelnext/dist", "MethodFactory")
  @js.native
  open class MethodFactory ()
    extends typings.loglevelnext.methodFactoryMod.MethodFactory {
    def this(logger: typings.loglevelnext.logLevelMod.LogLevel) = this()
  }
  
  @JSImport("loglevelnext/dist", "PrefixFactory")
  @js.native
  open class PrefixFactory ()
    extends typings.loglevelnext.prefixFactoryMod.PrefixFactory {
    def this(logger: typings.loglevelnext.logLevelMod.LogLevel) = this()
    def this(logger: Unit, options: PrefixFactoryOptions) = this()
    def this(logger: typings.loglevelnext.logLevelMod.LogLevel, options: PrefixFactoryOptions) = this()
  }
  
  @js.native
  trait DefaultLogger
    extends typings.loglevelnext.logLevelMod.LogLevel {
    
    /* private */ var cache: Any = js.native
    
    def create(opts: String): typings.loglevelnext.logLevelMod.LogLevel = js.native
    def create(opts: LogLevelOptions): typings.loglevelnext.logLevelMod.LogLevel = js.native
    
    def factories: Any = js.native
    
    def loggers: Record[String, typings.loglevelnext.logLevelMod.LogLevel] = js.native
  }
  
  type _To = DefaultLogger
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: DefaultLogger = default
}
