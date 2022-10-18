package typings.injectionJs

import typings.injectionJs.facadeLangMod.DebugContext
import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facadeErrorsMod {
  
  @JSImport("injection-js/facade/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("injection-js/facade/errors", "ERROR_COMPONENT_TYPE")
  @js.native
  val ERROR_COMPONENT_TYPE: /* "ngComponentType" */ String = js.native
  
  @JSImport("injection-js/facade/errors", "ERROR_DEBUG_CONTEXT")
  @js.native
  val ERROR_DEBUG_CONTEXT: /* "ngDebugContext" */ String = js.native
  
  @JSImport("injection-js/facade/errors", "ERROR_LOGGER")
  @js.native
  val ERROR_LOGGER: /* "ngErrorLogger" */ String = js.native
  
  @JSImport("injection-js/facade/errors", "ERROR_ORIGINAL_ERROR")
  @js.native
  val ERROR_ORIGINAL_ERROR: /* "ngOriginalError" */ String = js.native
  
  @JSImport("injection-js/facade/errors", "ERROR_TYPE")
  @js.native
  val ERROR_TYPE: /* "ngType" */ String = js.native
  
  inline def getDebugContext(error: js.Error): DebugContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getDebugContext")(error.asInstanceOf[js.Any]).asInstanceOf[DebugContext]
  
  inline def getErrorLogger(error: js.Error): js.Function2[/* console */ Console, /* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorLogger")(error.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* console */ Console, /* repeated */ Any, Unit]]
  
  inline def getOriginalError(error: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalError")(error.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def getType(error: js.Error): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(error.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def wrappedError(message: String, originalError: Any): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("wrappedError")(message.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any])).asInstanceOf[js.Error]
}
