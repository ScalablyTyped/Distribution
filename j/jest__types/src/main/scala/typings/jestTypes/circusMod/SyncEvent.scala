package typings.jestTypes.circusMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jestTypes.anon.AsyncError
  - typings.jestTypes.anon.BlockName
  - typings.jestTypes.anon.Fn
  - typings.jestTypes.anon.Mode
  - typings.jestTypes.anon.Error
*/
trait SyncEvent
  extends StObject
     with Event
object SyncEvent {
  
  @scala.inline
  def AsyncError(asyncError: Error, blockName: BlockName, mode: BlockMode): typings.jestTypes.anon.AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "start_describe_definition")
    __obj.asInstanceOf[typings.jestTypes.anon.AsyncError]
  }
  
  @scala.inline
  def BlockName(blockName: typings.jestTypes.circusMod.BlockName, mode: BlockMode): typings.jestTypes.anon.BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "finish_describe_definition")
    __obj.asInstanceOf[typings.jestTypes.anon.BlockName]
  }
  
  @scala.inline
  def Error(error: Exception): typings.jestTypes.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "error")
    __obj.asInstanceOf[typings.jestTypes.anon.Error]
  }
  
  @scala.inline
  def Fn(
    asyncError: Error,
    fn: /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit],
    hookType: HookType
  ): typings.jestTypes.anon.Fn = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), hookType = hookType.asInstanceOf[js.Any], name = "add_hook")
    __obj.asInstanceOf[typings.jestTypes.anon.Fn]
  }
  
  @scala.inline
  def Mode(
    asyncError: Error,
    fn: /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit],
    testName: TestName
  ): typings.jestTypes.anon.Mode = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), name = "add_test", testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.Mode]
  }
}
