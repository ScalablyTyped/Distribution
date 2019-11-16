package typings.jestDashJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typings.expect.buildTypesMod.Expect
  import typings.jestDashJasmine2.Anon_AddMatchers
  import typings.jestDashJasmine2.buildTypesMod._Global_.NodeJS.Global

  type AsyncExpectationResult = js.Promise[SyncExpectationResult]
  type ExpectationResult = SyncExpectationResult | AsyncExpectationResult
  type Jasmine = Anon_AddMatchers with Expect with Global
  type RawMatcherFn = js.Function3[
    /* expected */ js.Any, 
    /* actual */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    ExpectationResult
  ]
}
