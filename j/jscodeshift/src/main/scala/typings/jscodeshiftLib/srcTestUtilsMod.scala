package typings
package jscodeshiftLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jscodeshift/src/testUtils", JSImport.Namespace)
@js.native
object srcTestUtilsMod extends js.Object {
  def defineInlineTest(
    module: jscodeshiftLib.srcCoreMod.Transform,
    options: jscodeshiftLib.srcCoreMod.Options,
    inputSource: java.lang.String,
    expectedOutputSource: java.lang.String
  ): js.Function0[_] = js.native
  def defineInlineTest(
    module: jscodeshiftLib.srcCoreMod.Transform,
    options: jscodeshiftLib.srcCoreMod.Options,
    inputSource: java.lang.String,
    expectedOutputSource: java.lang.String,
    testName: java.lang.String
  ): js.Function0[_] = js.native
  def defineTest(
    dirName: java.lang.String,
    transformName: java.lang.String,
    options: jscodeshiftLib.srcCoreMod.Options
  ): js.Function0[_] = js.native
  def defineTest(
    dirName: java.lang.String,
    transformName: java.lang.String,
    options: jscodeshiftLib.srcCoreMod.Options,
    testFilePrefix: java.lang.String
  ): js.Function0[_] = js.native
}

