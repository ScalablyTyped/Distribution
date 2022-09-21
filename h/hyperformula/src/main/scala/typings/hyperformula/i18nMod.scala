package typings.hyperformula

import typings.hyperformula.cellMod.TranslatableErrorType
import typings.hyperformula.translationPackageMod.RawTranslationPackage
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nMod {
  
  @JSImport("hyperformula/typings/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/i18n", "TranslationPackage")
  @js.native
  open class TranslationPackage protected ()
    extends typings.hyperformula.translationPackageMod.TranslationPackage {
    def this(functions: TranslationSet, errors: ErrorTranslationSet, ui: UITranslationSet) = this()
  }
  
  @js.native
  sealed trait UIElement extends StObject
  @JSImport("hyperformula/typings/i18n", "UIElement")
  @js.native
  object UIElement extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UIElement & String] = js.native
    
    @js.native
    sealed trait NEW_SHEET_PREFIX
      extends StObject
         with UIElement
    /* "NEW_SHEET_PREFIX" */ val NEW_SHEET_PREFIX: typings.hyperformula.i18nMod.UIElement.NEW_SHEET_PREFIX & String = js.native
  }
  
  inline def buildTranslationPackage(rawTranslationPackage: RawTranslationPackage): typings.hyperformula.translationPackageMod.TranslationPackage = ^.asInstanceOf[js.Dynamic].applyDynamic("buildTranslationPackage")(rawTranslationPackage.asInstanceOf[js.Any]).asInstanceOf[typings.hyperformula.translationPackageMod.TranslationPackage]
  
  type ErrorTranslationSet = Record[TranslatableErrorType, String]
  
  type TranslationSet = Record[String, String]
  
  type UITranslationSet = Record[UIElement, String]
}
