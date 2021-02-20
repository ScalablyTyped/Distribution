package typings.jestValidate

import typings.jestValidate.typesMod.ValidationOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningsMod {
  
  @JSImport("jest-validate/build/warnings", "unknownOptionWarning")
  @js.native
  def unknownOptionWarning(
    config: Record[String, _],
    exampleConfig: Record[String, _],
    option: String,
    options: ValidationOptions
  ): Unit = js.native
  @JSImport("jest-validate/build/warnings", "unknownOptionWarning")
  @js.native
  def unknownOptionWarning(
    config: Record[String, _],
    exampleConfig: Record[String, _],
    option: String,
    options: ValidationOptions,
    path: js.Array[String]
  ): Unit = js.native
}
