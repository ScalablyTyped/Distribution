package typings.atJestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildCircusMod {
  import typings.std.Record

  type AsyncFn = TestFn | HookFn
  type BlockFn = typings.atJestTypes.buildGlobalMod.BlockFn
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.atJestTypes.atJestTypesStrings.skip
    - typings.atJestTypes.atJestTypesStrings.only
    - typings.atJestTypes.atJestTypesStrings.todo
  */
  type BlockMode = _BlockMode | Unit
  type BlockName = typings.atJestTypes.buildGlobalMod.BlockName
  type DoneFn = typings.atJestTypes.buildGlobalMod.DoneFn
  type EventHandler = js.Function2[/* event */ Event, /* state */ State, Unit]
  type Exception = js.Any
  type FormattedError = String
  type HookFn = js.Function1[/* done */ js.UndefOr[DoneFn], js.UndefOr[js.Promise[js.Any] | Null]]
  type Process = typings.node.NodeJSNs.Process
  type TestContext = Record[String, js.Any]
  type TestError = Exception | (js.Array[js.Tuple2[js.UndefOr[Exception], Exception]])
  type TestFn = typings.atJestTypes.buildGlobalMod.TestFn
  type TestMode = BlockMode
  type TestName = typings.atJestTypes.buildGlobalMod.TestName
  type TestResults = js.Array[TestResult]
}
