package typings.jestValidate

import org.scalablytyped.runtime.Shortcut
import typings.jestValidate.typesMod.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultConfigMod extends Shortcut {
  
  @JSImport("jest-validate/build/defaultConfig", JSImport.Default)
  @js.native
  val default: ValidationOptions = js.native
  
  type _To = ValidationOptions
  
  /* This means you don't have to write `default`, but can instead just say `defaultConfigMod.foo` */
  override def _to: ValidationOptions = default
}
