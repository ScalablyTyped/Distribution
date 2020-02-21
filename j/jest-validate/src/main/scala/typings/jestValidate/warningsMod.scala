package typings.jestValidate

import typings.jestValidate.typesMod.ValidationOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-validate/build/warnings", JSImport.Namespace)
@js.native
object warningsMod extends js.Object {
  def unknownOptionWarning(
    config: Record[String, _],
    exampleConfig: Record[String, _],
    option: String,
    options: ValidationOptions
  ): Unit = js.native
  def unknownOptionWarning(
    config: Record[String, _],
    exampleConfig: Record[String, _],
    option: String,
    options: ValidationOptions,
    path: js.Array[String]
  ): Unit = js.native
}

