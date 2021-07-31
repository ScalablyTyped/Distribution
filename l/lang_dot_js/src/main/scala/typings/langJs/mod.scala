package typings.langJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lang.js", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Lang {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Lang extends StObject {
    
    /**
      * Gets the plural or singular form of the message specified based on an integer value.
      *
      * @param key The key of the message.
      * @param count The number of elements.
      * @param replacements The replacements to be done in the message.
      * @param locale The locale to use, if not passed use the default locale.
      *
      * @return The translation message according to an integer value.
      */
    def choice(key: String, count: Double): String = js.native
    def choice(key: String, count: Double, replacements: Unit, locale: String): String = js.native
    def choice(key: String, count: Double, replacements: Replacements): String = js.native
    def choice(key: String, count: Double, replacements: Replacements, locale: String): String = js.native
    
    /**
      * Gets a translation message.
      *
      * @param key The key of the message.
      * @param replacements The replacements to be done in the message.
      * @param locale The locale to use, if not passed use the default locale.
      *
      * @return The translation message, if not found the given key.
      */
    def get(key: String): String = js.native
    def get(key: String, replacements: Unit, locale: String): String = js.native
    def get(key: String, replacements: Replacements): String = js.native
    def get(key: String, replacements: Replacements, locale: String): String = js.native
    
    /**
      * Get the fallback locale being used.
      *
      * @return The fallback locale.
      */
    def getFallback(): String = js.native
    
    /**
      * Get the current locale.
      *
      * @return The current locale.
      */
    def getLocale(): String = js.native
    
    /**
      * Checks whether a given key exists in the messages source.
      *
      * @param key The key of the message.
      * @param locale The locale of the message.
      *
      * @return true if the given key is defined on the messages source, otherwise false.
      */
    def has(key: String): Boolean = js.native
    def has(key: String, locale: String): Boolean = js.native
    
    /**
      * Set the fallback locale being used.
      *
      * @param fallback The fallback locale.
      */
    def setFallback(fallback: String): Unit = js.native
    
    /**
      * Set the current locale.
      *
      * @return void
      */
    def setLocale(locale: String): Unit = js.native
    
    /**
      * Set messages source.
      *
      * @param messages The messages source.
      */
    def setMessages(messages: Messages): Unit = js.native
    
    /**
      * Gets a translation message.
      *
      * This method act as an alias to get() method, just without the locale parameter.
      *
      * @param key The key of the message.
      * @param replacements The replacements to be done in the message.
      *
      * @return The translation message, if not found the given key.
      */
    def trans(key: String): String = js.native
    def trans(key: String, replacements: Replacements): String = js.native
    
    /**
      * Gets the plural or singular form of the message specified based on an integer value.
      *
      * This method act as an alias to choice() method, just without the locale parameter.
      *
      * @param key The key of the message.
      * @param count The number of elements.
      * @param replacements The replacements to be done in the message.
      *
      * @return The translation message according to an integer value.
      */
    def transChoice(key: String, count: Double): String = js.native
    def transChoice(key: String, count: Double, replacements: Replacements): String = js.native
  }
  
  type Messages = StringDictionary[StringDictionary[String]]
  
  trait Options extends StObject {
    
    var fallback: String
    
    var locale: String
    
    var messages: Messages
  }
  object Options {
    
    @scala.inline
    def apply(fallback: String, locale: String, messages: Messages): Options = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    }
  }
  
  type Replacements = StringDictionary[String]
}
