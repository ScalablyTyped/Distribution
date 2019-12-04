package typings.jestDashJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTreeProcessorMod {
  import typings.jestDashJasmine2.Anon_AfterAllFns
  import typings.jestDashJasmine2.jestDashJasmine2Strings.getResult
  import typings.jestDashJasmine2.jestDashJasmine2Strings.parentSuite
  import typings.jestDashJasmine2.jestDashJasmine2Strings.result
  import typings.std.Pick

  type TreeNode = Anon_AfterAllFns with (Pick[
    typings.jestDashJasmine2.buildJasmineSuiteMod.default, 
    getResult | parentSuite | result
  ])
}
