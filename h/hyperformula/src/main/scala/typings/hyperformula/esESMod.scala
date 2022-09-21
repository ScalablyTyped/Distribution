package typings.hyperformula

import org.scalablytyped.runtime.Shortcut
import typings.hyperformula.translationPackageMod.RawTranslationPackage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esESMod extends Shortcut {
  
  @JSImport("hyperformula/typings/i18n/languages/esES", JSImport.Default)
  @js.native
  val default: RawTranslationPackage = js.native
  
  @JSImport("hyperformula/typings/i18n/languages/esES", "dictionary")
  @js.native
  val dictionary: RawTranslationPackage = js.native
  
  type _To = RawTranslationPackage
  
  /* This means you don't have to write `default`, but can instead just say `esESMod.foo` */
  override def _to: RawTranslationPackage = default
}
