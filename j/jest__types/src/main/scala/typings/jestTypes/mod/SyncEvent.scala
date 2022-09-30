package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jestTypes.anon.AsyncError
  - typings.jestTypes.anon.BlockName
  - typings.jestTypes.anon.Fn
  - typings.jestTypes.anon.Concurrent
  - typings.jestTypes.anon.ErrorException
*/
trait SyncEvent
  extends StObject
     with Event2
object SyncEvent {
  
  inline def AsyncError(asyncError: js.Error, blockName: BlockName2, mode: BlockMode): typings.jestTypes.anon.AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "start_describe_definition")
    __obj.asInstanceOf[typings.jestTypes.anon.AsyncError]
  }
  
  inline def BlockName(blockName: BlockName2, mode: BlockMode): typings.jestTypes.anon.BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "finish_describe_definition")
    __obj.asInstanceOf[typings.jestTypes.anon.BlockName]
  }
  
  inline def Concurrent(asyncError: js.Error, concurrent: Boolean, failing: Boolean, fn: TestFn2, testName: TestName2): typings.jestTypes.anon.Concurrent = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], concurrent = concurrent.asInstanceOf[js.Any], failing = failing.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], name = "add_test", testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.Concurrent]
  }
  
  inline def ErrorException(error: Exception): typings.jestTypes.anon.ErrorException = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "error")
    __obj.asInstanceOf[typings.jestTypes.anon.ErrorException]
  }
  
  inline def Fn(asyncError: js.Error, fn: HookFn2, hookType: HookType): typings.jestTypes.anon.Fn = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], hookType = hookType.asInstanceOf[js.Any], name = "add_hook")
    __obj.asInstanceOf[typings.jestTypes.anon.Fn]
  }
}
