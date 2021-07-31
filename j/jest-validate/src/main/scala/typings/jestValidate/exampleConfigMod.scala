package typings.jestValidate

import org.scalablytyped.runtime.Shortcut
import typings.jestValidate.typesMod.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exampleConfigMod extends Shortcut {
  
  @JSImport("jest-validate/build/exampleConfig", JSImport.Default)
  @js.native
  val default: ValidationOptions = js.native
  
  type _To = ValidationOptions
  
  /* This means you don't have to write `default`, but can instead just say `exampleConfigMod.foo` */
  override def _to: ValidationOptions = default
}
