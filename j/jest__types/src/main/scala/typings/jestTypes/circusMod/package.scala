package typings.jestTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object circusMod {
  type AsyncFn = typings.jestTypes.circusMod.TestFn | typings.jestTypes.circusMod.HookFn
  type BlockFn = typings.jestTypes.globalMod.BlockFn
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.jestTypes.jestTypesStrings.skip
    - typings.jestTypes.jestTypesStrings.only
    - typings.jestTypes.jestTypesStrings.todo
  */
  type BlockMode = typings.jestTypes.circusMod._BlockMode | scala.Unit
  type BlockName = typings.jestTypes.globalMod.BlockName
  type DoneFn = typings.jestTypes.globalMod.DoneFn
  type EventHandler = js.Function2[
    /* event */ typings.jestTypes.circusMod.Event, 
    /* state */ typings.jestTypes.circusMod.State, 
    scala.Unit
  ]
  type Exception = js.Any
  type FormattedError = java.lang.String
  type HookFn = js.Function1[
    /* done */ js.UndefOr[typings.jestTypes.circusMod.DoneFn], 
    js.UndefOr[js.Promise[js.Any] | scala.Null]
  ]
  type Process = typings.node.NodeJS.Process
  type TestContext = typings.std.Record[java.lang.String, js.Any]
  type TestError = typings.jestTypes.circusMod.Exception | (js.Array[
    js.Tuple2[
      js.UndefOr[typings.jestTypes.circusMod.Exception], 
      typings.jestTypes.circusMod.Exception
    ]
  ])
  type TestFn = typings.jestTypes.globalMod.TestFn
  type TestMode = typings.jestTypes.circusMod.BlockMode
  type TestName = typings.jestTypes.globalMod.TestName
  type TestResults = js.Array[typings.jestTypes.circusMod.TestResult]
}
