package typings.macrotask

import typings.macrotask.macrotaskStrings.imaginary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("macrotask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("macrotask", "CancelToken")
  @js.native
  class CancelToken () extends StObject {
    
    // needed for TS to not accept just any object, only instances of CancelToken
    /* private */ var __cancel__prop: imaginary = js.native
  }
  
  inline def clear(cancel: CancelToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(cancel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def run[TArgs /* <: js.Array[js.Any] */](
    task: js.Function1[/* args */ TArgs, Unit],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): CancelToken = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(task.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CancelToken]
}
