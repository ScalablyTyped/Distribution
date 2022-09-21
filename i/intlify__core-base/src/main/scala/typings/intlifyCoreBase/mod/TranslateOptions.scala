package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateOptions[Locales] extends StObject {
  
  /**
    * @remarks
    * Default message when is occurred translation missing
    */
  var default: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * @remarks
    * Whether do escape parameter for list or named interpolation values
    */
  var escapeParameter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @remarks
    * Whether do template interpolation on translation keys when your language lacks a translation for a key
    */
  var fallbackWarn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @remarks
    * List interpolation
    */
  var list: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * @remarks
    * The locale of localization
    */
  var locale: js.UndefOr[Locales] = js.undefined
  
  /**
    * @remarks
    * Whether suppress warnings outputted when localization fails
    */
  var missingWarn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @remarks
    * Named interpolation
    */
  var named: js.UndefOr[NamedValue[js.Object]] = js.undefined
  
  /**
    * @remarks
    * Plulralzation choice number
    */
  var plural: js.UndefOr[Double] = js.undefined
  
  /**
    * @remarks
    * Whether the message has been resolved
    */
  var resolvedMessage: js.UndefOr[Boolean] = js.undefined
}
object TranslateOptions {
  
  inline def apply[Locales](): TranslateOptions[Locales] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateOptions[Locales]]
  }
  
  extension [Self <: TranslateOptions[?], Locales](x: Self & TranslateOptions[Locales]) {
    
    inline def setDefault(value: String | Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setEscapeParameter(value: Boolean): Self = StObject.set(x, "escapeParameter", value.asInstanceOf[js.Any])
    
    inline def setEscapeParameterUndefined: Self = StObject.set(x, "escapeParameter", js.undefined)
    
    inline def setFallbackWarn(value: Boolean): Self = StObject.set(x, "fallbackWarn", value.asInstanceOf[js.Any])
    
    inline def setFallbackWarnUndefined: Self = StObject.set(x, "fallbackWarn", js.undefined)
    
    inline def setList(value: js.Array[Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setListVarargs(value: Any*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setLocale(value: Locales): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMissingWarn(value: Boolean): Self = StObject.set(x, "missingWarn", value.asInstanceOf[js.Any])
    
    inline def setMissingWarnUndefined: Self = StObject.set(x, "missingWarn", js.undefined)
    
    inline def setNamed(value: NamedValue[js.Object]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
    
    inline def setNamedUndefined: Self = StObject.set(x, "named", js.undefined)
    
    inline def setPlural(value: Double): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    
    inline def setResolvedMessage(value: Boolean): Self = StObject.set(x, "resolvedMessage", value.asInstanceOf[js.Any])
    
    inline def setResolvedMessageUndefined: Self = StObject.set(x, "resolvedMessage", js.undefined)
  }
}
