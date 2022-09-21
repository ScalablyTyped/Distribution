package typings.macrotask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object macrotask {
    
    @JSGlobal("macrotask")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("macrotask.CancelToken")
    @js.native
    open class CancelToken ()
      extends typings.macrotask.mod.CancelToken
    
    inline def clear(cancel: typings.macrotask.mod.CancelToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(cancel.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def run[TArgs /* <: js.Array[Any] */](
      task: js.Function1[/* args */ TArgs, Unit],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): typings.macrotask.mod.CancelToken = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(task.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.macrotask.mod.CancelToken]
  }
}
