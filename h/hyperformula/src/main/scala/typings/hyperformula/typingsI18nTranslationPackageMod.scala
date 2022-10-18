package typings.hyperformula

import typings.hyperformula.typingsCellMod.ErrorType
import typings.hyperformula.typingsCellMod.TranslatableErrorType
import typings.hyperformula.typingsI18nMod.ErrorTranslationSet
import typings.hyperformula.typingsI18nMod.TranslationSet
import typings.hyperformula.typingsI18nMod.UIElement
import typings.hyperformula.typingsI18nMod.UITranslationSet
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsI18nTranslationPackageMod {
  
  @JSImport("hyperformula/typings/i18n/TranslationPackage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/i18n/TranslationPackage", "TranslationPackage")
  @js.native
  open class TranslationPackage protected () extends StObject {
    def this(functions: TranslationSet, errors: ErrorTranslationSet, ui: UITranslationSet) = this()
    
    /* private */ val _protectedTranslations: Any = js.native
    
    def buildErrorMapping(): Record[String, TranslatableErrorType] = js.native
    
    def buildFunctionMapping(): Record[String, String] = js.native
    
    /* private */ var checkErrors: Any = js.native
    
    /* private */ var checkFunctionTranslations: Any = js.native
    
    /* private */ var checkUI: Any = js.native
    
    /* private */ var errors: Any = js.native
    
    def extendFunctions(additionalFunctionTranslations: TranslationSet): Unit = js.native
    
    /* private */ var functions: Any = js.native
    
    def getErrorTranslation(key: ErrorType): String = js.native
    
    def getFunctionTranslation(key: String): String = js.native
    
    def getFunctionTranslations(functionIds: js.Array[String]): js.Array[String] = js.native
    
    def getMaybeFunctionTranslation(key: String): Maybe[String] = js.native
    
    def getUITranslation(key: UIElement): String = js.native
    
    def isFunctionTranslated(key: String): Boolean = js.native
    
    /* private */ var ui: Any = js.native
  }
  
  inline def buildTranslationPackage(rawTranslationPackage: RawTranslationPackage): TranslationPackage = ^.asInstanceOf[js.Dynamic].applyDynamic("buildTranslationPackage")(rawTranslationPackage.asInstanceOf[js.Any]).asInstanceOf[TranslationPackage]
  
  trait RawTranslationPackage extends StObject {
    
    var errors: ErrorTranslationSet
    
    var functions: TranslationSet
    
    var langCode: String
    
    var ui: UITranslationSet
  }
  object RawTranslationPackage {
    
    inline def apply(errors: ErrorTranslationSet, functions: TranslationSet, langCode: String, ui: UITranslationSet): RawTranslationPackage = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], langCode = langCode.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawTranslationPackage]
    }
    
    extension [Self <: RawTranslationPackage](x: Self) {
      
      inline def setErrors(value: ErrorTranslationSet): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setFunctions(value: TranslationSet): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setLangCode(value: String): Self = StObject.set(x, "langCode", value.asInstanceOf[js.Any])
      
      inline def setUi(value: UITranslationSet): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    }
  }
}
