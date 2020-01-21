package typings.jestJasmine2.expectationResultFactoryMod

import typings.jestTestResult.typesMod.FailedAssertion
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/expectationResultFactory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(options: Options): FailedAssertion = js.native
  def apply(options: Options, initError: Error): FailedAssertion = js.native
}

