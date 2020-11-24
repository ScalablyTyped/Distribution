package typings.jscodeshift.testUtilsMod

import typings.jscodeshift.coreMod.Options
import typings.jscodeshift.coreMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jscodeshift/src/testUtils", "defineInlineTest")
@js.native
object defineInlineTest extends js.Object {
  
  def apply(module: Transform, options: Options, inputSource: String, expectedOutputSource: String): js.Function0[_] = js.native
  def apply(
    module: Transform,
    options: Options,
    inputSource: String,
    expectedOutputSource: String,
    testName: String
  ): js.Function0[_] = js.native
}
