package typings.jestValidate

import typings.jestValidate.typesMod.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("jest-validate/build/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorMessage(option: String, received: js.Any, defaultValue: js.Any, options: ValidationOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errorMessage")(option.asInstanceOf[js.Any], received.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def errorMessage(
    option: String,
    received: js.Any,
    defaultValue: js.Any,
    options: ValidationOptions,
    path: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errorMessage")(option.asInstanceOf[js.Any], received.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
