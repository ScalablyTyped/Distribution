package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Translation provider interface
  */
trait ITranslator extends StObject {
  
  /**
    * The code of the language in use.
    */
  val languageCode: String
  
  /**
    * Load translation bundles for a given domain.
    *
    * @param domain The translation domain to use for translations.
    *
    * @returns The translation bundle if found, or the English bundle.
    */
  def load(domain: String): TranslationBundle
}
object ITranslator {
  
  inline def apply(languageCode: String, load: String => TranslationBundle): ITranslator = {
    val __obj = js.Dynamic.literal(languageCode = languageCode.asInstanceOf[js.Any], load = js.Any.fromFunction1(load))
    __obj.asInstanceOf[ITranslator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITranslator] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: String => TranslationBundle): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
  }
}
