package typings.linguiCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventEmitterMod {
  
  @JSImport("@lingui/core/cjs/eventEmitter", "EventEmitter")
  @js.native
  open class EventEmitter[Events /* <: StringDictionary[js.Function1[/* repeated */ Any, Any]] */] () extends StObject {
    
    /* private */ val _events: Any = js.native
    
    /* private */ var _hasEvent: Any = js.native
    
    def emit(
      event: /* keyof Events */ String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Events[typeof event]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
        ]
    ): Unit = js.native
    
    def on(
      event: /* keyof Events */ String,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
    ): js.Function0[Unit] = js.native
    
    def removeListener(
      event: /* keyof Events */ String,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
    ): Unit = js.native
  }
}
