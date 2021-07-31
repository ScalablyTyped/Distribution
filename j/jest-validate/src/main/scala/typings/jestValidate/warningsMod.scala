package typings.jestValidate

import typings.jestValidate.typesMod.ValidationOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningsMod {
  
  @JSImport("jest-validate/build/warnings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def unknownOptionWarning(
    config: Record[String, js.Any],
    exampleConfig: Record[String, js.Any],
    option: String,
    options: ValidationOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unknownOptionWarning")(config.asInstanceOf[js.Any], exampleConfig.asInstanceOf[js.Any], option.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def unknownOptionWarning(
    config: Record[String, js.Any],
    exampleConfig: Record[String, js.Any],
    option: String,
    options: ValidationOptions,
    path: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unknownOptionWarning")(config.asInstanceOf[js.Any], exampleConfig.asInstanceOf[js.Any], option.asInstanceOf[js.Any], options.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
