package typings.heremaps.H.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Namespace contains functionality related to internationalization.
  */
object i18n {
  
  /**
    * This class is used for internationalization of UI components.
    */
  trait Localization extends StObject {
    
    /**
      * This method returns translation keys for current locale. Keys from this set can be used to get translations via translate method.
      * @returns {Array<string>}
      */
    def getKeys(): js.Array[String]
    
    /**
      * This method returns current locale code i.e 'en-US'
      * @returns {string} - locale code
      */
    def getLocale(): String
    
    /**
      * This method returns a boolean value indicating whether this localization object has a translation for the specified translation key.
      * @param key {string} - a translation key
      * @returns {boolean} - true if the key exists, otherwise false
      */
    def hasKey(key: String): Boolean
    
    /**
      * This method returns translation for provided key. It throws exception if translation is not available
      * @param key {string} - a translation key
      * @returns {string} - a localized string corresponding to provided key
      */
    def translate(key: String): String
  }
  object Localization {
    
    inline def apply(
      getKeys: () => js.Array[String],
      getLocale: () => String,
      hasKey: String => Boolean,
      translate: String => String
    ): Localization = {
      val __obj = js.Dynamic.literal(getKeys = js.Any.fromFunction0(getKeys), getLocale = js.Any.fromFunction0(getLocale), hasKey = js.Any.fromFunction1(hasKey), translate = js.Any.fromFunction1(translate))
      __obj.asInstanceOf[Localization]
    }
    
    extension [Self <: Localization](x: Self) {
      
      inline def setGetKeys(value: () => js.Array[String]): Self = StObject.set(x, "getKeys", js.Any.fromFunction0(value))
      
      inline def setGetLocale(value: () => String): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
      
      inline def setHasKey(value: String => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      inline def setTranslate(value: String => String): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
    }
  }
}
