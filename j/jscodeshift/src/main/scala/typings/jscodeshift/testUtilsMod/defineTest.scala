package typings.jscodeshift.testUtilsMod

import typings.jscodeshift.coreMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jscodeshift/src/testUtils", "defineTest")
@js.native
object defineTest extends js.Object {
  def apply(dirName: String, transformName: String, options: Options): js.Function0[_] = js.native
  def apply(dirName: String, transformName: String, options: Options, testFilePrefix: String): js.Function0[_] = js.native
  def apply(
    dirName: String,
    transformName: String,
    options: Options,
    testFilePrefix: String,
    testOptions: TestOptions
  ): js.Function0[_] = js.native
}

