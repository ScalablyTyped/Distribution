package typings.macrotask

import typings.macrotask.macrotaskStrings.imaginary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("macrotask", "CancelToken")
  @js.native
  class CancelToken () extends StObject {
    
    // needed for TS to not accept just any object, only instances of CancelToken
    var __cancel__prop: imaginary = js.native
  }
  
  @JSImport("macrotask", "clear")
  @js.native
  def clear(cancel: CancelToken): Unit = js.native
  
  @JSImport("macrotask", "run")
  @js.native
  def run[TArgs /* <: js.Array[_] */](
    task: js.Function1[/* args */ TArgs, Unit],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): CancelToken = js.native
}
