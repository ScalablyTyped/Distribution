package typings.jestJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AsyncExpectationResult = js.Promise[typings.jestJasmine2.typesMod.SyncExpectationResult]
  type ExpectationResult = typings.jestJasmine2.typesMod.SyncExpectationResult | typings.jestJasmine2.typesMod.AsyncExpectationResult
  type Jasmine = typings.jestJasmine2.AnonAddMatchers with typings.expect.typesMod.Expect with typings.jestJasmine2.typesMod._Global_.NodeJS.Global
  type RawMatcherFn = js.Function3[
    /* expected */ js.Any, 
    /* actual */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    typings.jestJasmine2.typesMod.ExpectationResult
  ]
}
