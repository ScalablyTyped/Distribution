package typings.ionic

import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.LogFn
import typings.std.Set
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("ionic/lib/utils/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/utils/logger", "Logger")
  @js.native
  open class Logger ()
    extends StObject
       with ILogger {
    
    /* CompleteClass */
    override def ok(msg: String): Unit = js.native
    /* CompleteClass */
    @JSName("ok")
    var ok_Original: LogFn = js.native
    
    /* CompleteClass */
    override def rawmsg(msg: String): Unit = js.native
    /* CompleteClass */
    @JSName("rawmsg")
    var rawmsg_Original: LogFn = js.native
  }
  
  inline def createDefaultLoggerHandlers(): Set[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cli-framework.StreamHandler */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultLoggerHandlers")().asInstanceOf[Set[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cli-framework.StreamHandler */ Any
  ]]
  inline def createDefaultLoggerHandlers(
    formatter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggerFormatter */ Any
  ): Set[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cli-framework.StreamHandler */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultLoggerHandlers")(formatter.asInstanceOf[js.Any]).asInstanceOf[Set[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cli-framework.StreamHandler */ Any
  ]]
  
  inline def createFormatter(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")().asInstanceOf[Any]
  inline def createFormatter(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateTaggedFormatterOptions */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createPrefixedWriteStream(log: ILogger, prefix: String): WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedWriteStream")(log.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[WritableStream[Any]]
  inline def createPrefixedWriteStream(
    log: ILogger,
    prefix: String,
    level: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoggerLevelWeight */ Any
  ): WritableStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedWriteStream")(log.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[WritableStream[Any]]
}
