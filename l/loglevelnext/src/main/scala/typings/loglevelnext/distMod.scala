package typings.loglevelnext

import org.scalablytyped.runtime.Shortcut
import typings.loglevelnext.distLogLevelMod.LogLevelOptions
import typings.loglevelnext.distPrefixFactoryMod.PrefixFactoryOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod extends Shortcut {
  
  @JSImport("loglevelnext/dist", JSImport.Default)
  @js.native
  val default: DefaultLogger = js.native
  
  @JSImport("loglevelnext/dist", "LogLevel")
  @js.native
  open class LogLevel protected ()
    extends typings.loglevelnext.distLogLevelMod.LogLevel {
    def this(options: LogLevelOptions) = this()
  }
  
  @JSImport("loglevelnext/dist", "MethodFactory")
  @js.native
  open class MethodFactory ()
    extends typings.loglevelnext.distMethodFactoryMod.MethodFactory {
    def this(logger: typings.loglevelnext.distLogLevelMod.LogLevel) = this()
  }
  
  @JSImport("loglevelnext/dist", "PrefixFactory")
  @js.native
  open class PrefixFactory ()
    extends typings.loglevelnext.distPrefixFactoryMod.PrefixFactory {
    def this(logger: typings.loglevelnext.distLogLevelMod.LogLevel) = this()
    def this(logger: Unit, options: PrefixFactoryOptions) = this()
    def this(logger: typings.loglevelnext.distLogLevelMod.LogLevel, options: PrefixFactoryOptions) = this()
  }
  
  @js.native
  trait DefaultLogger
    extends typings.loglevelnext.distLogLevelMod.LogLevel {
    
    /* private */ var cache: Any = js.native
    
    def create(opts: String): typings.loglevelnext.distLogLevelMod.LogLevel = js.native
    def create(opts: LogLevelOptions): typings.loglevelnext.distLogLevelMod.LogLevel = js.native
    
    def factories: Any = js.native
    
    def loggers: Record[String, typings.loglevelnext.distLogLevelMod.LogLevel] = js.native
  }
  
  type _To = DefaultLogger
  
  /* This means you don't have to write `default`, but can instead just say `distMod.foo` */
  override def _to: DefaultLogger = default
}
